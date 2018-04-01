package controller;

import model.InsertionSort;
import model.MergeSort;
import model.SortResults;

public class Main {

	// Main method for calling the even odd sort method
	public static SortResults main(int[] array1, int[] array2) {
		
		InsertionSort insertSort = new InsertionSort();
		MergeSort mergeSort = new MergeSort();
		SortResults results = new SortResults();
		long start_time = 0, end_time = 0, duration_nano = -1;
	// ******* Insertion Sort *******
		// method call 
		try {
			start_time = System.nanoTime();
			insertSort.sort(array1, array1.length);
			end_time = System.nanoTime();
			// calculating run time
			duration_nano = end_time - start_time;
		} catch (StackOverflowError e) {
			
		}
		// set results to class variable
		results.setInsertDuration(duration_nano);
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
