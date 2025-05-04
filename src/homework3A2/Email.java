package homework3A2;

public class Email extends Message{

	@Override
	public String getType() {
		return "Email";
	}
	
	public void send() { //prints "E-mail sent"
		System.out.println("E-mail sent");
	}

}
