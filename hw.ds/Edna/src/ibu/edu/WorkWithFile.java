package ibu.edu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFile {
	
	
public static IpAddress[] readFile(String path, IpAddress[] arr) throws IOException {
		
		
        String line;
        String dilimiter = "\",\"";

    	Scanner reader = new Scanner(new File(path));
        int i = 0;
        try {
        	
			while (i<arr.length) {
			 
				line = reader.nextLine();
				line = line.substring(1, line.length()-1);
			    String[] s = line.split(dilimiter);
			    
			   
			    arr[i] = new IpAddress(Long.parseLong(s[0]), Long.parseLong(s[1]), s[2],s[3],s[4],s[5]);
			   
			    i++;
			
			    
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        try {
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        return arr;
	}
	
	public static void writeFile(IpAddress[] ips, String path) throws IOException {
		
		
		
		
		try{
			
			FileWriter writer = new FileWriter(path);
			for(IpAddress st : ips){
				
				writer.write(st.toString()+"\n");
			}
			writer.close();
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	
	}

}

