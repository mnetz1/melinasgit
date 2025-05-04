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
	}

	//setBrightness() only changes the value when lamp is on
	@Override
	public void setBrightness(int level) {
	if (on == true && level <= MAX_BRIGHTNESS && level >= 0) {
		brightness = level;}

	}

	@Override
	public int getBrightness() {
		return brightness;	
	}

}
