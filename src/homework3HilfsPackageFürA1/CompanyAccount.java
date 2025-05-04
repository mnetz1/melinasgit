package homework3HilfsPackageFürA1;

import homework3A1.Account; //damit das Package zugriff auf Klasse Account vom anderen Package hat

public class CompanyAccount extends Account {

	public CompanyAccount(String owner, double balance, int pin, String internalNote) {
		super(owner, balance, pin, internalNote);
	}
	
	public void accessAccount(Account account) {
	
		System.out.println(account.owner);
		
		System.out.println(account.getBalance());
		
		//System.out.println(account.pin); //pin ist protected -> da vererbt ist zugriff möglich direkt über this.pin aber NICHT über account.pin
		System.out.println(this.pin); 
		
		// System.out.println(account.internalNote); kein zugriff; access if Zugriffsmodifikator protected, private (via getter und setter) oder public
	}
	
	
	

}
