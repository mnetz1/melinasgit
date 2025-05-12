package a3;

public class Calculator {
	
	/*
	//Variante 1
	public static double divide(double a, double b) {
		try {
			if (b==0) {
				throw new  ArithmeticException("Division by zero is not allowed!"); }
	return a/b;
	} catch (ArithmeticException e) {
		System.out.println("Fehler: " + e.getMessage());
		return 0;
		}}
	
	
	public static void main(String[] args) {
		//System.out.println(Calculator.divide(3,0));
		System.out.println(divide(2,2));

	}
	*/
	
	//Variante 2:
	public static double divide(double a, double b) throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException("Division by zero is not allowed!"); }
		return a/b; }
	
	public static void main(String[] args) {
		try {
			System.out.println(Calculator.divide(3,0)); } 
		catch (ArithmeticException e) {
			System.out.println("Fehler: " + e.getMessage()); }}
}
