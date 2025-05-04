package homework3A1;

public class AccountManager {
	
	

	//Test: kann man auf Attribute der Klasse "Account" zugreifen?
	
	public void accessAccount(Account account) {
		
		System.out.println(account.owner); //public: accessible
		
		//System.out.println(account.balance); kein Zugriff möglich (weil private)
		System.out.println(account.getBalance()); //Alternative
		
		System.out.println(account.pin); // protected: accessible in same package
		
		System.out.println(account.internalNote);  //package-private: accessible
	}

}
