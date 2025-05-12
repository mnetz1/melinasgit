package a1;

import a2.InvalidCostumerException;
import a2.InvalidShippingInfoException;
import a2.MissingShippingInfoException;

public class EComController {

	public static void main(String[] args) {
		
		ShippingInfo info = null;
		try {
			info = new ShippingInfo("Munich", 80331, "Germany");
		} catch (InvalidShippingInfoException e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		
		
		
		Profile profile = null;
		try {
			profile = new Profile(info);
		} catch (MissingShippingInfoException e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		
		
		//wenn profile fehlt und id negativ wird nur der fehler für profile ausgegeben, nicht beide Fehler....
		Costumer costumer = null;
		try {
			costumer = new Costumer(profile, 123);
		} catch (InvalidCostumerException e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		
		//wenn costumer leer ist kann man nicht auf GETTER zugreifen und es wird eine Exception geworfen
		if(costumer != null) {
		System.out.println("Shipping to: " + costumer.getProfile().getInfo().getCity());
		}
	}

}
