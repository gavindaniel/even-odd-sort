package controller;

import model.EvenOddSort;

public class Main {

	// Main method for calling the even odd sort method
	public static void main(int[] array) {
		
		EvenOddSort eoSort = new EvenOddSort();
		
		long start_time = System.nanoTime();
		
		eoSort.sort(array);
		
		long end_time = System.nanoTime();
		
		long duration_nano = end_time - start_time;
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		System.out.println();
		System.out.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
		System.out.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
		System.out.println("Time to complete -> " + duration + " seconds (s)");
		System.out.println();
	}
	
}
