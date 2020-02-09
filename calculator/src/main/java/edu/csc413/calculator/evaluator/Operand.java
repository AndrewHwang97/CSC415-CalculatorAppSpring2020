package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    /**
     * construct operand from string token.
     */
    int value;

    public Operand(String token) {
        this.value = Integer.valueOf(token);
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.value = value;
    }

    /**
     * return value of operand
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        for(int i = 0; i < token.length(); i++){
            if(token.charAt(i) < 48 || token.charAt(i) > 57){
                return false;
            }
        }
        return true;
    }
}
