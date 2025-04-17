package homework2A3;

public class Mail {
	
	//Attribute 
	private String sender;
	private String subject;
	private String datetime;
	private String message;
	private boolean read = false;
	
	
	public Mail(String sender, String subject, String datetime, String message) {
		this.sender = sender;
		this.subject = subject;
		this.datetime = datetime;
		this.message = message;
	}
	
	//Methode, die Mail als gelesen makiert wenn man sie nutzt
	public boolean MarkAsRead() {
		this.read = true;
		return this.read;
	}
	
	public boolean Read() { //gerade unnötig, aber brauchen wir bei einer Methode in Inbox um zu sehen, ob bestimmte Mails aus Inbox gelesen wurden
		return this.read;
	}
	
	//Methode die Mail komplett ausgibt/ printet
	public void Print() {
		System.out.println(subject + " from " + sender + " on " + datetime + " : " + message); 
	}
	
	public void PrintHeader() {
		System.out.println(read + " | " + subject + " | " + sender +  " | " + datetime);
	}

}
