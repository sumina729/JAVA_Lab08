package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * A class that provides a service for calculating the maximum common divisor of two numbers.
 *
 */
public class GCDEngine implements Computable {
    private static final String engineName ="GCD";
    private int input[];
    private int result;
    
    /**
	 * The method of obtaining the input number to be calculated.
	 * Before handing over each input to fields a and b, make sure that the number of inputs is 2 and that the input is not negative.
	 * Pass the input values to field a and field b, respectively.
	 */
    public void setInput(String[] args) {
    	if(args.length < 3) {
    		InputChecker.printErrorMesssageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
    	}
    	for(int i=1; i<args.length; i++) {
    		if(Integer.parseInt(args[i]) < 0) {
        		InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        	}
    	}
    	
    	
    	input = new int[args.length-1];
    	for(int i= 1; i<args.length; i++) {
    		input[i-1] = Integer.parseInt(args[i]);
    	}
    }
	
    /**
     * Method for calculating the maximum common divisor.
     * Hand over the result value.
     */
	public void compute() {

		int result = input[0];
        for (int i = 1; i < input.length; i++) {
        	
            result = getGCD(result, input[i]);
        }
        this.result = result;
	}
	
	/**
	 * Method for obtaining the maximum common divisor of two numbers
	 * It is used in the compute() method.
	 */
	public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }

	/**
	 * A method that returns the calculated result value so that it can be used by other classes or methods.
	 */
	public double getResult(){
		return result;
	}
	
	/**
	 * The getter method that returns input for use by other methods.
	 */
	public int[] getInput() {
		return input;
	}

	/**
	 * The getter method that returns engine name for use by other methods.
	 */
	public static String getEnginename() {
		return engineName;
	}

	/**
	 * A setter method that allows results to be obtained from other methods.
	 */
	public void setResult(int result) {
		this.result = result;
	}

	/**
	 * A setter method that allows input to be obtained from other methods.
	 */
	public void setInput(int[] input) {
		this.input = input;
	}
	
	
    
}
