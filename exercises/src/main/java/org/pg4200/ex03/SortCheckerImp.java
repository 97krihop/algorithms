package org.pg4200.ex03;

import org.pg4200.les03.sort.BubbleSort;

import java.util.Arrays;


public class SortCheckerImp implements SortChecker {
	@Override
	public <T extends Comparable<T>> boolean isSortedCopy(T[] original, T[] sorted) {
		if (original == null && sorted == null)
			return true;
		if (original == null || sorted == null)
			return false;
		if (original.length != sorted.length)
			return false;
		for (int i = 0; i < original.length; i++) {
			if (original[i] == null || sorted[i] == null)
				return false;
		}

		for(int i=0; i<original.length-1; i++){
			if(sorted[i].compareTo(sorted[i+1]) > 0)
				return false;
		}

		for (T v : original) {
			int originalCount = 0;
			int sortedCount = 0;

			for (int j = 0; j < original.length; j++) {
				if (sorted[j].equals(v)) {
					sortedCount++;
				}
				if (original[j].equals(v)) {
					originalCount++;
				}
			}
			if (originalCount != sortedCount)
				return false;
		}
		return true;
	}
}
