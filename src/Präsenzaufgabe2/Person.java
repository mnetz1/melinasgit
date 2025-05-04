package Präsenzaufgabe2;

public class Person {
	
	//Attribute
	private String firstName;
	private String lastName;
	private int age;
	
	

	public Person( String firstName,  String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	
	//Method
	public String getInfo() {
		return this.firstName + " " + this.lastName + " , " + this.age;
	}
}
