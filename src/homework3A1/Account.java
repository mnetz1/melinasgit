package homework3A1;

public class Account {
	
	public String owner;
	private double balance;
	protected int pin;
	String internalNote; //default/ package-private access

	public Account(String owner, double balance, int pin, String internalNote ) {
		this.owner = owner;
		this.balance = balance;
		this.pin = pin;
		this.internalNote = internalNote;
	}

	
	//return balance
	public double getBalance() {
		return this.balance;
	}
	
	//change pin, nur wenn (korrekter) aktueller Pin vorhanden
	public boolean changePin(int currentPin, int neuerPin) {
		if (currentPin == pin) {
			 pin = neuerPin;
			 return true; //Pinänderung erfolgreich
		}
		else return false; //wenn man aktuellen Pin nicht richtig kennt, dann bleibt der Pin einfach beim alten, also wird nicht geändert
		
	}


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
