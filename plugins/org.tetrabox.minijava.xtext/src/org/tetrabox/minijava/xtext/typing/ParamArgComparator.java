/**
 * 
 */
package org.tetrabox.minijava.xtext.typing;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.tetrabox.minijava.xtext.miniJava.Argument;
import org.tetrabox.minijava.xtext.miniJava.Field;
import org.tetrabox.minijava.xtext.miniJava.Method;
import org.tetrabox.minijava.xtext.miniJava.Parameter;
import org.tetrabox.minijava.xtext.util.TypeUtils;
/**
 * Checks for arguments and parameters
 * 
 * @author bettini
 * 
 */
public class ParamArgComparator {
	MiniJavaTypeSystem typeSystem;

	MiniJavaSubtyping subtyping;

	public ParamArgComparator(MiniJavaTypeSystem typeSystem, MiniJavaSubtyping subtyping) {
		super();
		this.typeSystem = typeSystem;
		this.subtyping = subtyping;
	}

	/**
	 * Checks whether the list of arguments is consistent with the list of
	 * parameters
	 * 
	 * @param params
	 * @param args
	 * @return the error string or an empty string if check succeeds.
	 */
	public String checkParamArg(EList<Parameter> params, EList<Argument> args) {
		if (params.size() != args.size()) {
			return "expected " + params.size() + " arguments, while "
					+ args.size() + " are provided";
		}

		Iterator<Parameter> paramIt = params.iterator();
		Iterator<Argument> argIt = args.iterator();
		while (paramIt.hasNext()) {
			Parameter param = paramIt.next();
			Argument arg = argIt.next();
			TypeResult argType = typeSystem.getType(arg);
			if (!subtyping.isSubtype(argType.getType(), param.getType())) {
				return "argument type " + argType
						+ " is not a subtype of param type "
						+ TypeUtils.typeToString(param.getType());
			}
		}

		return "";
	}

	/**
	 * Checks whether the first list of parameters is equal to the second list
	 * of parameters (only compare types, NOT parameter names)
	 * 
	 * @param params1
	 * @param params2
	 * @return the error string or an empty string if check succeeds.
	 */
	public String checkParams(EList<Parameter> params1, EList<Parameter> params2) {
		if (params1.size() != params2.size()) {
			return "expected " + params1.size() + " parameters, while "
					+ params2.size() + " are provided";
		}

		Iterator<Parameter> paramIt1 = params1.iterator();
		Iterator<Parameter> paramIt2 = params2.iterator();

		while (paramIt1.hasNext()) {
			Parameter param1 = paramIt1.next();
			Parameter param2 = paramIt2.next();

			String param1Type = TypeUtils.typeToString(param1.getType());
			String param2Type = TypeUtils.typeToString(param2.getType());

			if (!param1Type.equals(param2Type)) {
				return "parameter type " + param1Type
						+ " is not equal to parameter type " + param2Type;
			}
		}

		return "";
	}

	/**
	 * Checks whether arguments are provided for each field
	 * 
	 * @param fields
	 * @param args
	 * @return the error string or an empty string if check succeeds.
	 */
	public String checkFieldArgs(List<Field> fields, EList<Argument> args) {
		if (fields.size() != args.size()) {
			return "expected " + fields.size() + " field initializers, while "
					+ args.size() + " are provided";
		}

		Iterator<Field> fieldIt = fields.iterator();
		Iterator<Argument> argIt = args.iterator();

		while (fieldIt.hasNext()) {
			Field field = fieldIt.next();
			Argument arg = argIt.next();

			String fieldType = TypeUtils.typeToString(field.getType());
			TypeResult argTypeResult = typeSystem.getType(arg);

			if (argTypeResult.getDiagnostic() != null) {
				return argTypeResult.getDiagnostic();
			}

			String argType = TypeUtils.typeToString(argTypeResult.getType());

			if (!subtyping.isSubtype(argTypeResult.getType(), field.getType())) {
				return "argument type " + argType
						+ " is not a subtype of field type " + fieldType;
			}
		}

		return "";
	}

	/**
	 * Checks whether the "overridden" predicate is satisfied: the first method
	 * has the same signature of the second one
	 * 
	 * @param method
	 * @param overridden
	 * @return the error string or an empty string if check succeeds.
	 */
	public String checkeOverride(Method method, Method overridden) {
		TypeResult returnType = typeSystem.getType(method);
		if (returnType.getDiagnostic() != null) {
			return returnType.getDiagnostic();
		}

		TypeResult overriddenReturnType = typeSystem.getType(overridden);
		if (overriddenReturnType.getDiagnostic() != null) {
			return overriddenReturnType.getDiagnostic();
		}

		String t1 = TypeUtils.typeToString(returnType.getType());
		String t2 = TypeUtils.typeToString(overriddenReturnType.getType());

		if (!t1.equals(t2)) {
			return "return types are different (method overriding)";
		}

		return checkParams(method.getParams(), overridden.getParams());
	}
}
