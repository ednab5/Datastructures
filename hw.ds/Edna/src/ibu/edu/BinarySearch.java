package ibu.edu;

public class BinarySearch {
	public static int search(IpAddress[] elements, long ip) {
	    int low = 0; 
	    int high = elements.length - 1;
	    
	    while (low <= high) {
	        int mid = (high + low) / 2;
	        
	        if (ip < elements[mid].ipFrom) {
	            high = mid - 1;
	        } 
	        else if (ip > elements[mid].ipTo) {
	            low = mid + 1;
	        } 
	        else {
	            return mid; 
	        }
	    }
	    return -1;
	}

}
