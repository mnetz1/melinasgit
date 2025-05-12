package a3;

public class Lamp implements Dimmable, Switchable {
	
	public boolean on;
	public int brightness;

	
	@Override
	public void turnOn() {
	on = true;
	}

	@Override
	public void turnOff() {
		on = false;
	}

	@Override
	public boolean isOn() {
		if (on == true) {
			return true;
		} else return false;
		//oder einfach: return on;
	}

	//setBrightness() only changes the value when lamp is on
	@Override
	public void setBrightness(int level) {
	if (on == true && level <= MAX_BRIGHTNESS && level >= 0) {
		brightness = level;}
	//oder: brightness= Math.max(0, Math.min(MAX_BRIGHTNESS, level)); 
	//stellt sicher, dass level zwischen 0 und 100

	}

	@Override
	public int getBrightness() {
		return brightness;	
	}

}
