package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * A class that provides a service for calculating the volume of a cube
 *
 */
public class CubeVolEngine implements Computable {
    private static final String engineName ="CUBEVOL";
    private double sideLength;
    private double volme;


	/**
	 * The method of obtaining the input number to be calculated.
	 * Before handing over each input to the field side length, make sure that the input number is not negative, with one input number.
	 * Hand over the input value to the fieldideLength.
	 */
    public void setInput(String[] args) {
    	if(args.length != 2) {
    		InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
    	}
    	if(Integer.parseInt(args[1]) < 0) {
    		InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
    	}
    	
    	sideLength = Integer.parseInt(args[1]);
    }
	
    /**
     * Method for calculating the volume of a cube.
     * Hand over the result value.
     */
	public void compute() {
		volme = Math.pow(sideLength, 3);
	}
	
	/**
	 * A method that returns the calculated result value so that it can be used by other classes or methods.
	 */
	public double getResult(){
		return volme;
	}
	
	
	/**
	 * The getter method that returns engine name for use by other methods.
	 */
	public static String getEnginename() {
		return engineName;
	}

	/**
	 * The getter method that returns input for use by other methods.
	 */
	public double getSideLength() {
		return sideLength;
	}


	/**
	 * A setter method that allows results to be obtained from other methods.
	 */
	public void setVolme(double volme) {
		this.volme = volme;
	}
	
	

}
