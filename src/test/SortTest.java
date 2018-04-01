package test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.junit.Test;

import controller.Main;

public class SortTest {

	final static String output_path = "outputs/";
	
	int size1 = 6;
	int size2 = 50;
	int size3 = 100;
	int size4 = 250;
	int size5 = 500;
	int size6 = 1000;
	int size7 = 2500;
	int size8 = 5000;
	int size9 = 10000;
	int size10 = 25000;
	int size11 = 50000;
	int size12 = 100000;
	// Test 1
	int[] array1_before = {3,2,1,4,5,6};
	int[] array1_after = {3,2,1,4,5,6};
	// Test 2
	int[] array2_before = new int[size2];
	int[] array2_after = new int[size2];
	// Test 3
	int[] array3_before = new int[size3];
	int[] array3_after = new int[size3];
	// Test 4
	int[] array4_before = new int[size4];
	int[] array4_after = new int[size4];
	// Test 5
	int[] array5_before = new int[size5];
	int[] array5_after = new int[size5];
	// Test 6
	int[] array6_before = new int[size6];
	int[] array6_after = new int[size6];
	// Test 7
	int[] array7_before = new int[size7];
	int[] array7_after = new int[size7];
	// Test 8
	int[] array8_before = new int[size8];
	int[] array8_after = new int[size8];
	// Test 9
	int[] array9_before = new int[size9];
	int[] array9_after = new int[size9];
	// Test 10
	int[] array10_before = new int[size10];
	int[] array10_after = new int[size10];
	// Test 11
	int[] array11_before = new int[size11];
	int[] array11_after = new int[size11];
	// Test 12
	int[] array12_before = new int[size12];
	int[] array12_after = new int[size12];
	
	@Test
	public void test1() {
		
		long duration_nano = 0;
		duration_nano = Main.main(array1_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output1.txt", "UTF-8");
			output.println("**************** Test 1 ****************");
			output.println();
			output.println("Size of array:  " + size1);
//			output.println("Array (before) -> " + Arrays.toString(array1_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array1_before));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test2() {
		
		// generate random array
		for (int i = 0; i < size2; i++) {
			int random = (int) ((Math.random() * size2) + 1);
			array2_before[i] = random;
			array2_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array2_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output2.txt", "UTF-8");
			output.println("**************** Test 2 ****************");
			output.println();
			output.println("Size of array:  " + size2);
//			output.println("Array (before) -> " + Arrays.toString(array2_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array2_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test3() {
		
		// generate random array
		for (int i = 0; i < size3; i++) {
			int random = (int) ((Math.random() * size3) + 1);
			array3_before[i] = random;
			array3_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array3_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output3.txt", "UTF-8");
			output.println("**************** Test 3 ****************");
			output.println();
			output.println("Size of array:  " + size3);
//			output.println("Array (before) -> " + Arrays.toString(array3_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array3_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test4() {
		
		// generate random array
		for (int i = 0; i < size4; i++) {
			int random = (int) ((Math.random() * size4) + 1);
			array4_before[i] = random;
			array4_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array4_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output4.txt", "UTF-8");
			output.println("**************** Test 4 ****************");
			output.println();
			output.println("Size of array:  " + size4);
//			output.println("Array (before) -> " + Arrays.toString(array4_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array4_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test5() {
		
		// generate random array
		for (int i = 0; i < size5; i++) {
			int random = (int) ((Math.random() * size5) + 1);
			array5_before[i] = random;
			array5_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array5_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output5.txt", "UTF-8");
			output.println("**************** Test 5 ****************");
			output.println();
			output.println("Size of array:  " + size5);
//			output.println("Array (before) -> " + Arrays.toString(array5_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array5_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test6() {
		
		// generate random array
		for (int i = 0; i < size6; i++) {
			int random = (int) ((Math.random() * size6) + 1);
			array6_before[i] = random;
			array6_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array6_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output6.txt", "UTF-8");
			output.println("**************** Test 6 ****************");
			output.println();
			output.println("Size of array:  " + size6);
//			output.println("Array (before) -> " + Arrays.toString(array6_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array6_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test7() {
		
		// generate random array
		for (int i = 0; i < size7; i++) {
			int random = (int) ((Math.random() * size7) + 1);
			array7_before[i] = random;
			array7_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array2_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output7.txt", "UTF-8");
			output.println("**************** Test 7 ****************");
			output.println();
			output.println("Size of array:  " + size7);
//			output.println("Array (before) -> " + Arrays.toString(array7_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array7_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test8() {
		
		// generate random array
		for (int i = 0; i < size8; i++) {
			int random = (int) ((Math.random() * size8) + 1);
			array8_before[i] = random;
			array8_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array8_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output8.txt", "UTF-8");
			output.println("**************** Test 8 ****************");
			output.println();
			output.println("Size of array:  " + size8);
//			output.println("Array (before) -> " + Arrays.toString(array8_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array8_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test9() {
		
		// generate random array
		for (int i = 0; i < size9; i++) {
			int random = (int) ((Math.random() * size9) + 1);
			array9_before[i] = random;
			array9_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array9_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output9.txt", "UTF-8");
			output.println("**************** Test 9 ****************");
			output.println();
			output.println("Size of array:  " + size9);
//			output.println("Array (before) -> " + Arrays.toString(array9_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array9_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test10() {
		
		// generate random array
		for (int i = 0; i < size10; i++) {
			int random = (int) ((Math.random() * size10) + 1);
			array10_before[i] = random;
			array10_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array10_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output10.txt", "UTF-8");
			output.println("**************** Test 10 ****************");
			output.println();
			output.println("Size of array:  " + size10);
//			output.println("Array (before) -> " + Arrays.toString(array10_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array10_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test11() {
		
		// generate random array
		for (int i = 0; i < size11; i++) {
			int random = (int) ((Math.random() * size11) + 1);
			array11_before[i] = random;
			array11_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array11_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output11.txt", "UTF-8");
			output.println("**************** Test 11 ****************");
			output.println();
			output.println("Size of array:  " + size11);
//			output.println("Array (before) -> " + Arrays.toString(array11_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array11_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test12() {
		
		// generate random array
		for (int i = 0; i < size12; i++) {
			int random = (int) ((Math.random() * size12) + 1);
			array12_before[i] = random;
			array12_after[i] = random;
		}
		
		long duration_nano = 0;
		duration_nano = Main.main(array12_after);
		
		// run time calculations
		double duration_milli = duration_nano / 1000000.0;
		double duration = duration_nano / 1000000000.0;
		
		// Print statements
		try {
			PrintWriter output = new PrintWriter(output_path + "output12.txt", "UTF-8");
			output.println("**************** Test 12 ****************");
			output.println();
			output.println("Size of array:  " + size12);
//			output.println("Array (before) -> " + Arrays.toString(array12_before));
			output.println();
			output.println("Time to complete -> " + duration_nano + " nanoseconds (ns)");
			output.println("Time to complete -> " + duration_milli + " milliseconds (ms)");
			output.println("Time to complete -> " + duration + " seconds (s)");
			output.println();
//			output.println("Array (after)  -> " + Arrays.toString(array12_after));
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
