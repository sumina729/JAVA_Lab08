package edu.handong.csee.java.hw2.engines;

//import java.util.Arrays;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * A class that provides a service for calculating the minimum value among several numbers.
 *
 */
public class MinEngine implements Computable {
    private static final String engineName ="MIN";
    private double[] input;
    private double result;
    
    
    /**
	 * The method of obtaining the input number to be calculated.
	 * Before handing over each input to the field input, make sure that the number of inputs is two or more.
	 * Each input value is handed over to the field input.
	 */
    public void setInput(String[] args) {
    	
    	if(args.length < 3) {
    		InputChecker.printErrorMesssageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
    	}
    	
    	input = new double[args.length-1];
    	for(int i= 1; i<args.length; i++) {
    		input[i-1] = Integer.parseInt(args[i]);
    	}
    }
	
    /**
     * The method for calculating the minimum value.
     * Hand over the result value.
     */
	public void compute() {

		double min = input[0];
		   for (int i = 1; i < input.length; i++) {
		       if (input[i] < min) {
		           min = input[i];
		       }
		   }
		   result = min;
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
	public void setInput(double[] input) {
		this.input = input;
	}
	

	/**
	 * The getter method that returns input for use by other methods.
	 */
	public double[] getInput() {
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
