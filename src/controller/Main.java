package controller;

import model.EvenOddSort;

public class Main {

	// Main method for calling the even odd sort method
	public static long main(int[] array) {
		
		EvenOddSort eoSort = new EvenOddSort();
		
		long start_time = System.nanoTime();
		// method call 
		eoSort.sort(array);
		long end_time = System.nanoTime();
		// calculating run time
		long duration_nano = end_time - start_time;
		// return run time 
		return duration_nano;
	}
	
}
