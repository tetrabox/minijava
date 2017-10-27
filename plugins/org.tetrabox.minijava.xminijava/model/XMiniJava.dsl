DSL org.tetrabox.minijava.XMiniJava {
	abstract-syntax {
		ecore = "platform:/resource/org.tetrabox.minijava.xminijava/model/XMiniJava.ecore"
	}
	semantic {
		k3 = "org.tetrabox.minijava.xminijava.aspects.MethodCallAspect",
		"org.tetrabox.minijava.xminijava.aspects.ExpressionAspect",
		"org.tetrabox.minijava.xminijava.aspects.SelectionAspect",
		"org.tetrabox.minijava.xminijava.aspects.ThisAspect",
		"org.tetrabox.minijava.xminijava.aspects.FieldSelectionAspect",
		"org.tetrabox.minijava.xminijava.aspects.ProgramAspect",
		"org.tetrabox.minijava.xminijava.aspects.NewAspect",
		"org.tetrabox.minijava.xminijava.aspects.BoolConstantAspect",
		"org.tetrabox.minijava.xminijava.aspects.MessageAspect",
		"org.tetrabox.minijava.xminijava.aspects.VariableAspect",
		"org.tetrabox.minijava.xminijava.aspects.CastAspect",
		"org.tetrabox.minijava.xminijava.aspects.StringConstantAspect",
		"org.tetrabox.minijava.xminijava.aspects.IntConstantAspect"
	}
}
