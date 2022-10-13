package shell;

import java.io.IOException;
import mainpackage.*;

public class Main {

	public static void main(String[] args) {
		
		
		String path = "C:/Edna/IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		String newFile = "C:/Edna/IP-COUNTRY-REGION-CITY-SHELL-SORTED.csv";
		
		IPAddress[] array = new IPAddress[10000];
		
		try{
			
			ReadWriteFile.readFile(path,array);
			ShellSort.sort(array);
			ReadWriteFile.writeFile(array,newFile);
			System.out.println("sort is finished successfully") ;
					
		}
		catch(IOException e){
			System.out.println("sort is not finished successfully") ;
			
		}
		
		//--------------------------------------------------------
		

	}

	
}



