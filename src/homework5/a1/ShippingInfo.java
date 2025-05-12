package a1;

import a2.InvalidShippingInfoException;

public class ShippingInfo {
	
	private String city;
	private int zip;
	private String country;
	

	public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException{
	setCity(city); //damit exception geworfen wird
	setZip(zip);// "
	//setCountry(country);*/
		//this.city = city;
		//this.zip = zip;
		this.country = country;
	}


	public String getCity() {
		return city;
	}

//a2
	public void setCity(String city) throws InvalidShippingInfoException {
		if (city == null || city.isEmpty()) {
			throw new InvalidShippingInfoException("City cannot be empty");
		}
		this.city = city;
	}


	public int getZip() {
		return zip;
	}

//a2
	public void setZip(int zip) throws InvalidShippingInfoException{
		//int zip in seine Ziffern zerlegen:
		// In String umwandeln
		String str = String.valueOf(zip);
		// Array vorbereiten
		int[] ziffern = new int[str.length()];
		// Jede Ziffer extrahieren
		for (int i = 0; i < str.length(); i++) {
		    ziffern[i] = Character.getNumericValue(str.charAt(i));
		}
		for (int i : ziffern) {
			if (i < 0) {
				throw new InvalidShippingInfoException("zip must be a valid positive number (no negative values)");
			}
		}
		this.zip = zip;
	}


	public String getCountry() {
		return country;
	}

//kein setter um zugriff von außen zu verhindern
	/*public void setCountry(String country) {
		this.country = country;
	}*/

}
