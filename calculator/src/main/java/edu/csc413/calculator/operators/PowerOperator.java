package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator{
    public int priority(){
        return 3;
    }

    public Operand execute(Operand operandOne, Operand operandTwo){
        return new Operand((int)Math.pow(operandOne.getValue(), operandTwo.getValue()));
    }
}
