package mainpackage;

import java.io.IOException;

import merge_recursive.*;

public class Main {

	public static void main(String[] args) {
		String path = "C:/Users/Admin/Desktop/Edna/IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		String newFile = "C:/Users/Admin/Desktop/Edna/IP-COUNTRY-REGION-CITY-MERGE-SORTED.csv";
		
		IPAddress[] array = new IPAddress[10000];
		
		try{
			
			ReadWriteFile.readFile(path,array);
			MergeSortRecursive.sort(array);
			ReadWriteFile.writeFile(array,newFile);
			
					
		}
		catch(IOException e){
			
		}

	}

}
