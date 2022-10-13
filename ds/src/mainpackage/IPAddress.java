package mainpackage;


public class IPAddress implements Comparable<IPAddress> {
	
	
	
	
	long ipFrom; 
	long ipTo;
	String countryCode;
	String countryName;
	String regionName;
	String cityName;
	public String toString() {//metoda koja od atributa obj formira text
		String dilimiter = "\",\"";
		return "\"" + ipFrom + dilimiter + ipTo + dilimiter + countryCode + dilimiter +
				countryName + dilimiter + regionName + dilimiter + cityName + "\"" ;
				
	}


	
	public IPAddress(long ipFrom, long ipTo, String countryCode, String countryName, String regionName,
			String cityName) {
		this.ipFrom = ipFrom;
		this.ipTo = ipTo;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionName = regionName;
		this.cityName = cityName;
	}
	
	
	
	public int compareTo(IPAddress that) {
		  if (this.ipFrom > that.ipFrom ) {                                      
		        return 1;                                                   
		    } else if (this.ipFrom  < that.ipFrom ) {                               
		        return -1;                                                  
		    } else {                                                        
		        return 0;                                                   
		    }
	}
	
	
}