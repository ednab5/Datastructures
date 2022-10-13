package selection;
import mainpackage.* ;

public class SelectionSort extends AbstractSort {
	public static void sort(Comparable[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (less(arr[j],arr[index])){  
                    index = j; 
                }  
            }  
            swap(arr, i, index);
           
        }  
    }  

}
