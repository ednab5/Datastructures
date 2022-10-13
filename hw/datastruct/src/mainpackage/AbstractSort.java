package mainpackage;

public abstract class AbstractSort {
	
	  public static boolean less(Comparable v, Comparable w) {
	        return v.compareTo(w) == -1;
	    }
	    
	    /* Swaps the two elements in an array */
	    public static void swap (Comparable[] elements, int i, int j) {
	        Comparable tmp = elements[i];
	        elements[i] = elements[j];
	        elements[j] = tmp;
	    }

}
