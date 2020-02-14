package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class LeftParenOperator extends Operator {
    public int priority(){
        return -1;
    }

    public Operand execute(Operand one, Operand two){
        return null;
    }

}
