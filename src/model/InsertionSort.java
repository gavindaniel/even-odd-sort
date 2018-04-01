package model;

public class InsertionSort {

	public void sort(int[] array, int length) {
		// check if the array to be sorted is less than 2 in size
		if (length < 2)
			return;
		// keep recursively sorting until down to 1 value in the array
		sort(array, length-1);
		// save the last value in the array to be inserted in its proper place in the sorted array
		int last = array[length-1];
		int i = length - 2;
		
		while (i >= 0 && !isEven(array[i]) && isEven(last)) {
			array[i+1] = array[i];
			i--;
		}
		
		array[i+1] = last;
		
	}
	
	public boolean isEven(int val) {
		if (val % 2 == 0)
			return true;
		else
			return false;
	}
}
