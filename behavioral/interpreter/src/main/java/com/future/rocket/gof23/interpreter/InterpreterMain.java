package com.future.rocket.gof23.interpreter;

import com.future.rocket.gof23.common.OtherTool;
import com.future.rocket.gof23.interpreter.iface.Context;
import com.future.rocket.gof23.interpreter.iface.Expression;
import com.future.rocket.gof23.interpreter.impl.AndExpression;
import com.future.rocket.gof23.interpreter.impl.OrExpression;
import com.future.rocket.gof23.interpreter.impl.TerminalExpression;

public class InterpreterMain {

    public static Expression getMaleExpression() {
        Expression leo = new TerminalExpression("leo");
        Expression foo = new TerminalExpression("foo");
        return new OrExpression(leo, foo);
    }

    public static Expression getMarriedWomanExpression() {
        Expression judy = new TerminalExpression("judy");
        Expression married = new TerminalExpression("married");
        return new AndExpression(judy, married);
    }

    public static void main(String[] args) {
        System.out.println("hi, welcome to gof23 rockets, now we in interpreter house...");
        OtherTool.printSplitLine();
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomanExpression();

        System.out.println("John is Male?: " + isMale.interpret(new Context() {
            @Override
            public String getContext() {
                return "John";
            }
        }));

        System.out.println("leo is Male?: " + isMale.interpret(new Context() {
            @Override
            public String getContext() {
                return "leo";
            }
        }));

        System.out.println("foo is Male?: " + isMale.interpret(new Context() {
            @Override
            public String getContext() {
                return "foo";
            }
        }));

        System.out.println("judy is a married women?: " + isMarriedWomen.interpret(new Context() {
            @Override
            public String getContext() {
                return "judy married";
            }
        }));

        System.out.println("lily is a married women?: " + isMarriedWomen.interpret(new Context() {
            @Override
            public String getContext() {
                return "lily single";
            }
        }));
    }
}
