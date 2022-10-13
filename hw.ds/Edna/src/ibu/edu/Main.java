package ibu.edu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Main {
	
	

	public static void main(String[] args) {
		
		
		
		String path = "C:/Edna/IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		String newFile = "C:/Edna/IP-COUNTRY-REGION-CITY-SORTED.csv";
		
		IpAddress[] array = new IpAddress[10000];
		Scanner sc = new Scanner(System.in);
		
		try{
			
			//Task1
			
			WorkWithFile.readFile(path,array);
			BubbleSort.sort(array);
			
			for(IpAddress ip : array){
				System.out.println(ip);
			}
			
			WorkWithFile.writeFile(array,newFile);
			
			//-----------------------------------------------
			//Task2
			
			System.out.print("Enter ip address: ");
			String ip = sc.nextLine();
			
			String[] split = ip.split("\\.");
			
			long w = Integer.parseInt(split[0]);
			long x = Integer.parseInt(split[1]);
			long y = Integer.parseInt(split[2]);
			long z = Integer.parseInt(split[3]);
			
			long ipNumber  =16777216*w + 65536*x + 256*y + z;
			System.out.println(ipNumber);
			
			
			int index = BinarySearch.search(array, ipNumber);
			
			if(index != -1){
				System.out.print("The requested address was found: " + array[index]);
			}
			else{
				System.out.print("The requested address was not found");
			}
			
				
		}
		catch(IOException e){
			
		}
		
		//--------------------------------------------------------
		

	}
	
	
	
	
	
	

}
