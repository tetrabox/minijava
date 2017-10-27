/**
 * 
 */
package org.tetrabox.minijava.xtext.lookup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.tetrabox.minijava.xtext.miniJava.Class;
import org.tetrabox.minijava.xtext.miniJava.ClassType;
import org.tetrabox.minijava.xtext.miniJava.Field;
import org.tetrabox.minijava.xtext.miniJava.Method;
import org.tetrabox.minijava.xtext.miniJava.Program;
import org.tetrabox.minijava.xtext.miniJava.Type;
import org.tetrabox.minijava.xtext.util.ClassSet;

/**
 * @author bettini
 * 
 *         Auxiliary functions for looking up into classes (e.g., all the fields
 *         of a class hierarchy)
 */
public class AuxiliaryFunctions {
	/**
	 * The programs where we will perform lookups
	 */
	Program program;

	/**
	 * Collects all the fields of a class (including the inherited ones)
	 * 
	 * @param cl
	 * @return the fields of a class (including the inherited ones)
	 */
	public List<Field> getFields(Class cl) {
		List<Field> fields = new LinkedList<Field>(cl.getFields());
		List<Class> superClasses = getOrderedSuperclasses(cl);
		
		for (Class class1 : superClasses) {
			fields.addAll(class1.getFields());
		}
		
		return fields;
	}

	/**
	 * Collects all the fields of a class (including the inherited ones, which
	 * will appear first in the list).
	 * 
	 * @param cl
	 * @return the fields of a class (including the inherited ones)
	 */
	public List<Field> getOrderedFields(Class cl) {
		if (cl == null)
			return new LinkedList<Field>();
		
		List<Field> fields = new LinkedList<Field>(cl.getFields());
		List<Class> superClasses = getOrderedSuperclasses(cl);
		
		for (Class class1 : superClasses) {
			fields.addAll(0, class1.getFields());
		}
		
		return fields;
	}

	public List<Field> getOrderedFields(ClassType type) {
		return getOrderedFields(type.getClassref());
	}

	/**
	 * Searches for a field in a class given the field name
	 * 
	 * @param cl
	 * @param fieldName
	 * @return the field if found, or null otherwise
	 */
	public Field getField(Class cl, String fieldName) {
		List<Field> fields = getFields(cl);
		for (Iterator<Field> iterator = fields.iterator(); iterator.hasNext();) {
			Field field = iterator.next();
			if (field.getName().equals(fieldName))
				return field;
		}

		return null;
	}

	/**
	 * Searches for a field in a type given the field name (if the type is a
	 * basic type, the always returns null)
	 * 
	 * @param cl
	 * @param fieldName
	 * @return the field if found, or null otherwise
	 */
	public Field getField(Type type, String fieldName) {
		if (type instanceof ClassType) {
			return getField(((ClassType) type).getClassref(), fieldName);
		}
		return null; // no field in basic types
	}

	/**
	 * Collects all the methods of a class (including the inherited ones). In
	 * case of method overriding, makes sure to get the most redefined version.
	 * 
	 * @param cl
	 * @return the methods of a class (including the inherited ones)
	 */
	public List<Method> getMethods(Class cl) {
		HashMap<String, Method> methodMap = new HashMap<String, Method>();
		List<Method> methods = cl.getMethods();

		for (Method method : methods) {
			methodMap.put(method.getName(), method);
		}

		List<Class> superClasses = getOrderedSuperclasses(cl);
		for (Class class1 : superClasses) {
			List<Method> currentClassMethods = class1.getMethods();
			for (Method method : currentClassMethods) {
				// add it only if not already present
				if (!methodMap.containsKey(method.getName()))
					methodMap.put(method.getName(), method);
			}
		}
		
		return new LinkedList<Method>(methodMap.values());
	}

	/**
	 * Searches for a method in a class given its name
	 * 
	 * @param cl
	 * @param methodName
	 * @return the field if found, or null otherwise
	 */
	public Method getMethod(Class cl, String methodName) {
		List<Method> fields = getMethods(cl);
		for (Iterator<Method> iterator = fields.iterator(); iterator.hasNext();) {
			Method method = iterator.next();
			if (method.getName().equals(methodName))
				return method;
		}

		return null;
	}

	/**
	 * Searches for a method in a type given its name (for basic types always
	 * return null)
	 * 
	 * @param cl
	 * @param methodName
	 * @return the field if found, or null otherwise
	 */
	public Method getMethod(Type type, String methodName) {
		if (type instanceof ClassType) {
			return getMethod(((ClassType) type).getClassref(), methodName);
		}
		
		return null;
	}

	/**
	 * Computes the superclasses of a given class (also avoids duplicates, in
	 * case of cyclic hierarchy). The implicit class Object is added
	 * automatically. The superclasses in this set DO NOT respect the hierarchy
	 * order. If you need the superclasses according to the hierarchy, use
	 * getOrderedSuperclasses method.
	 * 
	 * @param cl
	 * @return the superclasses of a given class (without duplicates)
	 */
	public ClassSet getSuperclasses(Class cl) {
		ClassSet superClasses = new ClassSet();

//		if (!cl.getName().equals("Object")) {
//			Resource resource = cl.eResource();
//
//			//TODO removed object super class, for now?
//			//superClasses.add(resource.getObjectClass());
//		}

		Class current = cl.getExtends();
		while (current != null) {
			// avoid endless loops in case of cycles
			if (superClasses.contains(current))
				break;
			superClasses.add(current);
			current = current.getExtends();
		}

		return superClasses;
	}

	/**
	 * Computes the superclasses of a given class (also avoids duplicates, in
	 * case of cyclic hierarchy). The implicit class Object is added
	 * automatically. The superclasses respect the hierarchy order, starting
	 * from the direct superclasses up to Object.
	 * 
	 * When iterating over a class hierarchy, you should never iterate directly
	 * over the superclass of a given class since a (malformed) class hierarchy
	 * may contain a cycle and you'd end up looping. Thus, never do:
	 * 
	 * <pre>
	 * Class current = cl;
	 * while (current != null) {
	 * 		...
	 * 		current = current.getExtends();
	 * }
	 * </pre>
	 * 
	 * Instead the classes returned by this method should be used to iterate
	 * over a class hierarchy.
	 * 
	 * @param cl
	 * @return the superclasses of a given class (without duplicates)
	 */
	public List<Class> getOrderedSuperclasses(Class cl) {
		List<Class> orderedSuperClasses = new LinkedList<Class>();
		// only used to avoid loops.
		ClassSet superClasses = new ClassSet();

		Class current = cl.getExtends();
		while (current != null) {
			// avoid endless loops in case of cycles
			if (superClasses.contains(current))
				break;
			superClasses.add(current);
			orderedSuperClasses.add(current);
			current = current.getExtends();
		}

//		if (!cl.getName().equals("Object")) {
//			Resource resource =  cl.eResource();
//
//			//// TODO removed here as well
//			//superClasses.add(resource.getObjectClass());
//			//orderedSuperClasses.add(resource.getObjectClass());
//		}

		return orderedSuperClasses;
	}

	/**
	 * Finds a class in a program give its name.
	 * 
	 * @param program
	 * @param className
	 * @return null if such class does not exist in the program
	 */
	public Class findClassByName(Program program, String className) {
		EList<Class> classes = program.getClasses();

		for (Class class1 : classes) {
			if (class1.getName().equals(className))
				return class1;
		}

		return null;
	}

	/**
	 * Collects all the classes of a program where the specified element
	 * resides.
	 * 
	 * @param eObject
	 *            the object whose program's we collect the classes
	 * @return
	 */
	public List<Class> collectClasses(EObject eObject) {
		ResourceSet resourceSet = eObject.eResource().getResourceSet();
		Iterator<Resource> iterator = resourceSet.getResources().iterator();
		List<Class> classes = new LinkedList<Class>();
		while (iterator.hasNext()) {
			Resource resource = iterator.next();
			EList<EObject> contents = resource.getContents();
			if (contents.size() > 0) {
				Program program = (Program) contents.get(0);
				//TODO removed object here as well
//				if (resource.getURI().equals(FJLinkingResource.implicitObjectUri)) {
//					// the case for implicit resource containing only Object
//					// insert Object as the first class
//					classes.add(0, program.getClasses().get(0));
//				} else {
//				}
				classes.addAll(program.getClasses());
			}
		}
		return classes;
	}

}
