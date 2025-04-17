package homework2;

public class Publication {
  
	//attributes
	private String title;
	private int year;
	
	//Konstruktor
	public Publication(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	//method that returns a formatted string
	public String getInfo() {
		return this.title + ", published in " + this.year; 
	}


}


