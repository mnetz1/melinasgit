package homework2A3;

import java.util.ArrayList;

public class Inbox{
	
	//Attribute, die alle Mails speichert mit Mail Objekten
	private ArrayList<Mail> alleMails;

	public Inbox() {
		alleMails = new ArrayList<Mail>();
	}
	
	
	
	//fügt jeweils eine Mail in die Mail-Liste der Inbox hinzu
	 public void addMail(Mail newMail) {
	        alleMails.add(newMail);
	    }
	 
	 //printet bestimmte Mail mit gewünschten Index aus der Inbox
	 public void open(int index) {
		 if (index < alleMails.size() && index >=0) {
			 alleMails.get(index).MarkAsRead(); //makiert Mail als gelesen, weil wir gerade drauf gegangen sind
			 alleMails.get(index).Print(); //printet ganze Mail
		 }
		 else  System.out.println("Invalid index.");
	 }
	
	 //zählt ungelesenen Mails
	 public int countUnread() {
		 int counter = 0;
		for (Mail mail : alleMails) {
			if (mail.Read() == false) {
				counter++;
			}
		}
		return counter;
	 }
	 
	 //printet alle Headers wie die aufgabe gewünscht hat (also ohne die Nachichten)
	 public void printAllHeaders() {
		for (Mail mail : alleMails) {
			mail.PrintHeader();
		}
	 }
}
