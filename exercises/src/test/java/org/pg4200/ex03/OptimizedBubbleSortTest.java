package org.pg4200.ex03;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptimizedBubbleSortTest {

	private OptimizedBubbleSort sorter = new OptimizedBubbleSort();

	public class StringComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			return s1.compareTo(s2);
		}
	}

	@Test
	public void TestNull() {
		assertEquals(0, sorter.sort(null, new StringComparator(), false));
	}

	@Test
	public void TestSortedString() {
		String[] arr = {"a", "b", "c", "d", "e", "f"};
		int comp = sorter.sort(arr, new StringComparator(), false);
		assertEquals(5, comp);
		assertEquals("a", arr[0]);
		assertEquals("b", arr[1]);
		assertEquals("c", arr[2]);
		assertEquals("d", arr[3]);
		assertEquals("e", arr[4]);
		assertEquals("f", arr[5]);
	}

	@Test
	public void TestWorstCaseString() {
		String[] arr1 = {"f", "e", "d", "c", "b", "a"};
		String[] arr2 = {"f", "e", "d", "c", "b", "a"};
		assertEquals(30, sorter.sort(arr1, new StringComparator(), false));
		assertEquals("a", arr1[0]);
		assertEquals("b", arr1[1]);
		assertEquals("c", arr1[2]);
		assertEquals("d", arr1[3]);
		assertEquals("e", arr1[4]);
		assertEquals("f", arr1[5]);

		assertEquals(15, sorter.sort(arr2, new StringComparator(), true));
		assertEquals("a", arr2[0]);
		assertEquals("b", arr2[1]);
		assertEquals("c", arr2[2]);
		assertEquals("d", arr2[3]);
		assertEquals("e", arr2[4]);
		assertEquals("f", arr2[5]);
	}

	@Test
	public void TestString() {
		String[] arr1 = {"c", "b", "a", "d", "e", "f"};
		String[] arr2 = {"c", "b", "a", "d", "e", "f"};
		assertEquals(true, sorter.sort(arr2, new StringComparator(), true) < sorter.sort(arr1, new StringComparator(), false));

		assertEquals("a", arr1[0]);
		assertEquals("b", arr1[1]);
		assertEquals("c", arr1[2]);
		assertEquals("d", arr1[3]);
		assertEquals("e", arr1[4]);
		assertEquals("f", arr1[5]);

		assertEquals("a", arr2[0]);
		assertEquals("b", arr2[1]);
		assertEquals("c", arr2[2]);
		assertEquals("d", arr2[3]);
		assertEquals("e", arr2[4]);
		assertEquals("f", arr2[5]);
	}
}
