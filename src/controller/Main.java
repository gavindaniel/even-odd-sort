package controller;

import model.EvenOddSort;
import model.MergeSort;
import model.SortResults;

public class Main {

	// Main method for calling the even odd sort method
	public static SortResults main(int[] array1, int[] array2) {
		
		EvenOddSort eoSort = new EvenOddSort();
		MergeSort mergeSort = new MergeSort();
		SortResults results = new SortResults();
		
	// ******* Even Odd Sort *******
		long start_time = System.nanoTime();
		// method call 
		eoSort.sort(array1);
		long end_time = System.nanoTime();
		// calculating run time
		long duration_nano = end_time - start_time;
		// set results to class variable
		results.setEvenOddDuration(duration_nano);
	// ******* Merge Sort *******
		start_time = System.nanoTime();
		// method call 
		mergeSort.sort(array2);
		end_time = System.nanoTime();
		// calculating run time
		duration_nano = end_time - start_time;
		// set results to class variable
		results.setMergeDuration(duration_nano);
	// return run time results
		return results;
	}
	
}
