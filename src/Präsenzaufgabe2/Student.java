package Präsenzaufgabe2;

import java.util.ArrayList;

public class Student extends Person {

	private int matNumber;
	private int semester;
	
	private ArrayList<String> listOfCourses; 
	
	
	public Student( String firstName,  String lastName, int age, int matNumber, int semester, ArrayList<String> listOfCourses) {
		super(firstName, lastName, age);
		this.matNumber = matNumber;
		this.semester = semester;
		this.listOfCourses = new ArrayList<>();
	}
	
	//fügt Kurs zu Liste der Kurse hinzu
	public void addCourse(String course) {
		listOfCourses.add(course);
	}
	
	public void printCourseList() {
		for (int i=0; i < listOfCourses.size(); i++) {
			System.out.println(listOfCourses.get(i));
		}
		
		//vs.: public String printCourseList() {
		// return listOfCourses.toString();
		
		
		// vs.: System.out.println("Course of" + firstName + ":");
		// for (String course : listOfCourses) {
		// System.out.println(" " : courses);
		// }
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + " , " + this.matNumber + " , " + this.semester + " , " + listOfCourses.toString();	
	}
		
	

}
