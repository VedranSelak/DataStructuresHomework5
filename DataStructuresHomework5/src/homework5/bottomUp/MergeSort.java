package homework5.bottomUp;

import homework5.AbstractSort;

public class MergeSort extends AbstractSort{
	
	public static void sort(Comparable[] array) {
		Comparable[] aux = new Comparable[array.length];
		
		for (int size=1; size<array.length; size *= 2) {
			for (int lo=0; lo<array.length-size; lo += 2 * size) {
				int mid = lo + size - 1;
				int hi = Math.min(lo + 2 * size - 1, array.length - 1);
				merge(array, aux, lo, mid, hi);
			}
		}
	}
	
	public static void merge(Comparable[] array, Comparable[] aux, int lo, int mid, int hi) {
		for (int k=lo; k<=hi; k++) {
			aux[k] = array[k];
		}
		int i = lo;
		int j = mid + 1;
		for (int k=lo; k<=hi; k++) {
			if(i > mid) {
				array[k] = aux[j++];
			} else if (j > hi) {
				array[k] = aux[i++];
			} else if (less(aux[j], aux[i])) {
				array[k] = aux[j++];
			} else {
				array[k] = aux[i++];
			}
		}
	}
	
}
