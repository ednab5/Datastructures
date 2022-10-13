package mainpackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReadWriteFile {
	
	
	public static void readFile(String path, IPAddress[] arr) throws IOException {
		
		
        String line;
        String dilimiter = "\",\"";

    	Scanner reader = new Scanner(new File(path)); 
        int i = 0;
        try {
        	
			while (i<arr.length) {
				
			
			 
				line = reader.nextLine();
				line = line.substring(1, line.length()-1);
			    String[] s = line.split(dilimiter);
			    
			   
			    arr[i] = new IPAddress(Long.parseLong(s[0]), Long.parseLong(s[1]), s[2],s[3],s[4],s[5]);
			   
			    i++;
			
			    
			}
		
		} 
        catch (Exception e) {
			e.printStackTrace();
		}
        
        try {
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        
       
	}
	
	public static void writeFile(IPAddress[] array, String path) throws IOException  {
		
		
			
			FileWriter w = new FileWriter(path); 
			for(IPAddress ip : array){
				
				w.write(ip.toString()+"\n");
			}
			w.close();
			
		
		
		
	
	}

}
