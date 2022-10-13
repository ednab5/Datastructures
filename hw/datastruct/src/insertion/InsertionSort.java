package insertion;

import mainpackage.* ;

  
public class InsertionSort extends AbstractSort {
	
	public static void sort(Comparable[] elements) {
	    for (int i = 0; i < elements.length; i++) {
	        for (int j = i; j > 0; j--) {
	            if (less(elements[j], elements[j - 1])) {
	                swap(elements, j, j - 1);
	            } else {
	                break;
	            }
	        }
	    }
	}

}




