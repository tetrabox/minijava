/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.minijava.semantics.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.tetrabox.minijava.semantics.tests.util.MiniJavaTestUtil
import org.tetrabox.minijava.xtext.tests.MiniJavaInjectorProvider

@RunWith(XtextRunner)
@InjectWith(MiniJavaInjectorProvider)
class MiniJavaSemanticsOtherTests {
	@Inject
	extension MiniJavaTestUtil testUtil

	@Test
	def void main1() {
		val expected = #["start"] + (0 .. 9).map[it.toString]
		genericPrintTest('''
class Main  {
	public static void main(String[] args) {
		System.out.println("start");
		int j = 12;
		boolean b = j > 24;
		for (int i = 0; i<10; i = i+1) {
			int x = j;
			System.out.println(i);
		}
	} 
}
''', expected)

	}

	@Test
	def void stateMachine() {
		val expected = #[
			"Monday",
			"hello! it is Tuesday",
			"hello! it is Wednesday",
			"Thursday",
			"hello! it is Friday",
			"hello! it is Saturday",
			"Sunday"
		]
		genericPrintTest('''
interface Statelike {
   public void writeName(StateContext context, String name);
}

public class StateNormal implements Statelike {
    public void writeName(StateContext context, String name) {
        System.out.println(name);
        StateHello hello = new StateHello();
        context.setState(hello);
    } 
}

public class StateHello implements Statelike {
    /** Counter local to this state */
    public int count = 0;

    public void writeName(StateContext context, String name) {
        System.out.println("hello! it is " + name);
        /* Change state after StateMultipleUpperCase's writeName() gets invoked twice */
        this.count = this.count +1;
        if(this.count > 1) {
            context.setState(new StateNormal());
        }
    }
}

public class StateContext {
    private Statelike myState;
    
    public StateContext() {
		this.setState(new StateNormal());
	}
    

    /**
     * Setter method for the state.
     * Normally only called by classes implementing the State interface.
     * @param newState the new state of this context
     */
    public void setState(Statelike newState) {
        this.myState = newState;
    }

    public void writeName(String name) {
        this.myState.writeName(this, name);
    }
}

public class DemoOfClientState {
    public static void main(String[] args) {
        StateContext sc = new StateContext();

        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");
    }
}
		''', expected)
	}

}
