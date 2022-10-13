package shell;
//3h+1
public class ShellSort {
public static void sort(Comparable[] arr) {
		

        int n = arr.length; 
  
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
         
            for (int i = gap; i < n; i += 1) 
            { 
                
                Comparable temp = arr[i]; 
  
               
                int j; 
                for (j = i; j >= gap && arr[j - gap].compareTo(temp) == 1; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
             
                arr[j] = temp; 
            } 
        } 
    }

}
