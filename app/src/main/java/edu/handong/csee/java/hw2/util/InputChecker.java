package edu.handong.csee.java.hw2.util;

/**
 * Class that outputs an input error.
 * Input Count Error
 * Input Range Error
 *
 */
public class InputChecker {
	
	/**
	 * When the number of inputs the engine needs to receive is wrong, an error is output and exit is performed.
	 */
    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
    
    /**
     * When the input received by the engine is negative, it outputs an error and exits.
     */
    public static void printErrorMesssageForNegativeInputsAndExit(String engineName) {
        
    	System.out.println("The input value cannot be negative for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
    
    /**
     * When the number of inputs the engine needs to receive is less than or equal to a specific number, an error is output and exit.
     */
    public static void printErrorMesssageForTheNumberOfMinimumRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
    	System.out.println("You need at least " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
}
