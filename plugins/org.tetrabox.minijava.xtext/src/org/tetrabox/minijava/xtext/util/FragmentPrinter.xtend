/** 
 */
package org.tetrabox.minijava.xtext.util

import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

/** 
 * Prints the URI fragments associated to objects in the model
 * @author bettini
 */
class FragmentPrinter {
	def String fragmentToString(EObject eObject) {
		var Resource resource = eObject.eResource()
		return resource.getURIFragment(eObject)
	}

	def void printFragment(EObject eObject) {
		System.out.println('''«eObject» = «fragmentToString(eObject)»''')
	}

	def void printFragment(Resource resource) {
		var TreeIterator<EObject> contents = resource.getAllContents()
		while (contents.hasNext())
			printFragment(contents.next())
	}
}
