package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * Class that provides services for calculating the nth number of the Fibonacci sequence.
 *
 */
public class FibonacciEngine implements Computable {
    private static final String engineName ="FIBONACCI";
    private int n;
    private double result;
    
    /**
	 * The method of obtaining the input number to be calculated.
	 * Before handing over each input to field n, make sure that the number of inputs is 1 and that it is not negative.
	 * Hand over the input value to field n.
	 */
    public void setInput(String[] args) {
    	if(args.length != 2) {
    		InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
    	}
    	if(Integer.parseInt(args[1]) < 0) {
    		InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
    	}
    	
    	n = Integer.parseInt(args[1]);
    }
	
    /**
     * Method for calculating the nth number of the Fibonacci sequence.
     * Hand over the result value	
     */
	public void compute() {
		int prev1 = 1, prev2 = 1, curr = 0;
		
		if(n == 1) {
			result = prev1;
			return;
		}
		
		if(n == 2) {
			result = prev1;
			return;
		}
		
		for (int i = 3; i <= n; i++) {
	        curr = prev1 + prev2;
	        prev1 = prev2;
	        prev2 = curr;
	    }
	    result = curr;
		
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
	 public int getN() {
		return n;
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

	/**
	 * A setter method that allows input to be obtained from other methods.
	 */
	public void setN(int n) {
		this.n = n;
	}
	
	
}
