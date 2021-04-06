package homework5.bottomUp;

import homework5.AbstractSort;
import homework5.IPAddress;

public class MergeSort extends AbstractSort{
	public static void sort(Comparable[] array) {
		
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
