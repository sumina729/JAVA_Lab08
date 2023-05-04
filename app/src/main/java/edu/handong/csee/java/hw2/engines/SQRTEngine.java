package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * A class that provides a service for calculating the square root of a number.
 *
 */
public class SQRTEngine implements Computable {
    private static final String engineName ="SQRT";
    private double input;
    private double result;
    
    
    /**
	 * The method of obtaining the input number to be calculated.
	 * Before handing over each input to the field input, make sure that the number of inputs is 1 and that the input is not negative.
	 * Hand over the input value to the field input.
	 */
    public void setInput(String[] args) {
    	if(args.length != 2) {
    		InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
    	}
    	if(Integer.parseInt(args[1]) < 0) {
    		InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
    	}
    	
    	input = Integer.parseInt(args[1]);
    }
	
    /**
     * Method for calculating the square root.
     * Hand over the result value.
     */
	public void compute() {
		result = Math.sqrt(input);
		
	}

	/**
	 * A method that returns the calculated result value so that it can be used by other classes or methods.
	 */
	public double getResult(){
		return result;
	}
	
	/**
	 * A setter method that allows input to be obtained from other methods.
	 */
	public void setInput(double input) {
		this.input = input;
	}
	
	/**
	 * The getter method that returns input for use by other methods.`
	 */
	public double getInput() {
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
	public void setResult(double result) {
		this.result = result;
	}
}
