package test;

import java.util.Arrays;

import org.junit.Test;

import controller.Main;

public class SortTest {

	int size = 6;
	
	int[] array1 = {3,2,1,4,5,6};
	
	@Test
	public void test1() {
		
		System.out.println("**************** Test 1 ****************");
		System.out.println();
		System.out.println("Array (before) -> " + Arrays.toString(array1));
		
		Main.main(array1);
		
		System.out.println("Array (after)  -> " + Arrays.toString(array1));
	}
	
}
