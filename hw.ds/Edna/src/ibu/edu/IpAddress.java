package ibu.edu;

public class IpAddress implements Comparable<IpAddress> {
	long ipFrom; 
	long ipTo;
	String countryCode;
	String countryName;
	String regionName;
	String cityName;
	@Override
	public String toString() {
		String dilimiter = "\",\"";
		return "\"" + ipFrom + dilimiter + ipTo + dilimiter + countryCode + dilimiter +
				countryName + dilimiter + regionName + dilimiter + cityName + "\"" ;
				
	}



	
	
	public IpAddress(long ipFrom, long ipTo, String countryCode, String countryName, String regionName,
			String cityName) {
		this.ipFrom = ipFrom;
		this.ipTo = ipTo;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionName = regionName;
		this.cityName = cityName;
	}
	
	
	
	public int compareTo(IpAddress that) {
		  if (this.ipFrom > that.ipFrom ) {                                      
		        return 1;                                                   
		    } else if (this.ipFrom  < that.ipFrom ) {                               
		        return -1;                                                  
		    } else {                                                        
		        return 0;                                                   
		    }
	}
	
	
}


