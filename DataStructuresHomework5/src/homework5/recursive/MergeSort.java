package homework5.recursive;

import java.util.Comparator;

import homework5.AbstractSort;

public class MergeSort extends AbstractSort{
	public static void sort(Comparable[] array, Comparator comparator) {
		Comparable[] aux = new Comparable[array.length];
		sort(array, aux, 0, array.length - 1, comparator);
	}
	
	public static void sort(Comparable[] array, Comparable[] aux, int lo, int hi, Comparator comparator) {
		if (hi <= lo) {
			return;
		}
		int mid = lo + (hi - lo)/2;
		sort(array, aux, lo, mid, comparator);
		sort(array, aux, mid+1, hi, comparator);
		merge(array, aux, lo, mid, hi, comparator);
	}
	
	public static void merge(Comparable[] array, Comparable[] aux, int lo, int mid, int hi, Comparator comparator) {
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
			} else if (comparator.compare(aux[j], aux[i]) < 0) {
				array[k] = aux[j++];
			} else {
				array[k] = aux[i++];
			}
		}
	}
}
