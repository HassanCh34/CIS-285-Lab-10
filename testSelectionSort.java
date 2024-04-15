package basicSelectionSort;

//import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/*import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;*/

public class testSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
		
	}

	private void testDuplicates() {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 10;
		arr[2] = 2;
		arr[3] = 10;
		arr[4] = 2;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 2;
		Sortedarr[2] = 8;
		Sortedarr[3] = 10;
		Sortedarr[4] = 10;

		SelectionSort selectionSort = new SelectionSort();
		/** add tests to check for this unit test **/
		assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));

	}

	private void testMixed() {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 0;
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -2;
		Sortedarr[3] = 0;
		Sortedarr[4] = 8;

		SelectionSort selectionSort = new SelectionSort();
		/** add tests to check for this unit test **/
		assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));

	}

	private void testNegative() {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;

		SelectionSort selectionSort = new SelectionSort();
		/** add tests to check for this unit test **/
		assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));

	}

	private void assertArrayEquals(int[] sortedarr, int[] basicSelectionSort) {
		// TODO Auto-generated method stub
		
	}

	private void testPositive() {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;

		SelectionSort selectionSort = new SelectionSort();
		/** add tests to check for this unit test **/
		assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));
	}

}
