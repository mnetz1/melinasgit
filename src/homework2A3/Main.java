package homework2A3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inbox testInbox = new Inbox();
		
		testInbox.addMail(new Mail("alice@example.com", "Hello", "2025-04-17 10:00", "Hi there! I have some questions...."));
		testInbox.addMail(new Mail("bob@example.com", "Meeting", "2025-04-17 11:00",  "Let's meet at 3pm"));
		testInbox.addMail(new Mail("carol@example.com", "Project", "2025-04-17 12:00", "Project update attached."));
		
		testInbox.printAllHeaders();
		System.out.println(testInbox.countUnread());
	
		testInbox.open(4);
		testInbox.open(1);
		System.out.println(testInbox.countUnread());
		
		testInbox.open(1);
		System.out.println(testInbox.countUnread());
		
		testInbox.open(2);
		System.out.println(testInbox.countUnread());
		
		
		testInbox.open(3);
		
		testInbox.open(0);
		System.out.println(testInbox.countUnread());
		
		testInbox.open(0);
		testInbox.open(1);
		testInbox.open(2);
		System.out.println(testInbox.countUnread());
	}

}
