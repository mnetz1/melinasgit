package a3;

public class LampDemo {

	public static void main(String[] args) {
		
		Lamp lamp = new Lamp();
		
		//turn on 
		lamp.turnOn();
		
		//setze Helligkeit
		lamp.setBrightness(80);
		
		//dim to half
		lamp.dimToHalf();
		
		System.out.println("Brightness: " + lamp.getBrightness());

	}

}
