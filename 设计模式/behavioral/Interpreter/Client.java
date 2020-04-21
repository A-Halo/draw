package com.java.behavioral.Interpreter;

public class Client {
    public static void main(String[] args) {
        Expression isMale=getMaleExpression();
        Expression isMarriedWoman=getMarriedWomenExpression();
        System.out.println("john is male?"+isMale.interpret("John"));
        System.out.println("julie is a married"+isMarriedWoman.interpret("married julie "));

    }
    //规定robert和john是男性
    public static Expression getMaleExpression(){
        Expression robert=new TerminalExpression("Robert");
        Expression john=new TerminalExpression("John");
        return new OrExpression(robert,john);
    }
    //规定julie是已婚女性
    public static Expression getMarriedWomenExpression(){
        Expression julie=new TerminalExpression("julie");
        Expression married=new TerminalExpression("married");
        return new AndExpression(julie,married);
    }
}
