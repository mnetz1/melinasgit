package homework3A2;

public class Main {

	public static void main(String[] args) {
		Message m1 = new Email(); 
		Message m2 = new SMS();
		System.out.println(m1.getType()); 
		System.out.println(m2.getType());
		
		
		 //m1.send(); // Uncomment this line and explain what happens 
		if (m1.getClass() == Email.class) {
			((Email) m1).send();
		}
		//oder
		if (m1 instanceof Email) {
			((Email) m1).send();
		}
		
		 
	}

}
