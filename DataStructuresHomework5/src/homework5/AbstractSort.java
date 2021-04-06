package homework5;

public abstract class AbstractSort {
	@SuppressWarnings("rawtypes") 
	public static boolean less(Comparable v, Comparable w) {
        if (v.compareTo(w) == 1) {
            return true;
        } else {
            return false;
        }
    }
	
	@SuppressWarnings("rawtypes")
	public static void swap (Comparable[] elements, int a, int b) {
    	Comparable tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }
}
