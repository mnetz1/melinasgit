package Präsenzaufgabe2;

import java.util.ArrayList;

public class PHDStudent extends Student {
	
	private String dissTopic;

	public PHDStudent( String firstName,  String lastName, int age, int matNumber, int semester, ArrayList<String> listOfCourses, String dissTopic) {
		super(firstName, lastName, age,  matNumber, semester, listOfCourses);
		this.dissTopic = dissTopic;
	}
	
	public String getInfo() {
		return super.getInfo() + this.dissTopic;
	}
	
	

}
