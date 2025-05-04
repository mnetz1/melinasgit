package a3;

public interface Dimmable {
	
	//Konstante
	public int MAX_BRIGHTNESS = 100;
	
	//Methode: stellt sicher, dass Helligkeit zwischen 0 und MAX_BRIGHTNESS ist
	public void setBrightness(int level);
	
		
	
	public int getBrightness();
	
	//Default Methode: setzt Helligkeit auf MAX_BRIGHTNESS/2
	default void dimToHalf() {
		setBrightness(MAX_BRIGHTNESS/2);
	}

}
