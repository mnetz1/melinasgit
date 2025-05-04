package homework3HilfsPackageFürA1;

import homework3A1.Account;

public class ExternalAudit {

	public void accessAccount(Account account) {
		System.out.println(account.owner); //public: access
		
		// System.out.println(account.balance); //private: only access in own class 
		System.out.println(account.getBalance()); //Alternative
		
		// System.out.println(account.pin); //protected: no access globally/ not in other package
		 //Alternative: Getter und Setter regenerieren und private statt protected für pin
		
		//internalNote: kein Zugriff möglich
		//System.out.println(account.internalNote);
		//Alternative: auf private und mit gettern und settern arbeiten
	}
}
