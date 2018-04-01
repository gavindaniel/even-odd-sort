package model;

public class EvenOddSort {

	private int current_index;
	
	public EvenOddSort() {
		current_index = 0;
	}
	
	// sorting method
	public void sort(int[] array) {
		
		// check to make sure array is long enough to sort
		if (array.length < 2)
			return;
		
		for (int i = current_index; i < array.length; i++) {
			// check if array[i] is even or odd
			int modulo = (array[i] % 2);
			if (modulo != 0) {
//			if ((array[i] % 2) == 0) {
				// if swapping is unsuccessful it means there are no more even numbers to swap with
				if (!swap(array, i)) {
					return; // DONE!
				}
			}	
		}
		
	}
	
	
	// swap method
	public boolean swap(int[] array, int index) {
		
		// look backwards through the array for any even numbers to swap with the value at the index passed in
		for (int i = (array.length - 1); i > index; i--) {
			// check if the current value is even
			if ((array[i] % 2) == 0) {
				int temp = array[index];
				array[index] = array[i];
				array[i] = temp;
				return true;	// exit the method
			}
		}
		// no even number was found 
		return false;
	}
}
