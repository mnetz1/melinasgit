package a1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		char[] values = {'1', 'a', '3', 'z', '9'};
		int[] nums = {10,0,-4,20,5};
		System.out.println(findMaxNumberWithPrimitives(nums));
		
	}
	
	
	//TASK A:
	//methode prüft, wie viele char aus values eine ziffer (digit) sind. 
	//Dabei nutzte nur primitive Operationen
	public int countDigitsWithPrimitiveOperation(char[] values) {
		int counter = 0;
		for (int i=0; i<values.length; i++) {
			if (values[i]>= 0 && values[i]<=9) {
	//denn Buchstaben a-z nehmen Unicode Werte 97-122 an
				counter++;
			}}
		return counter; }
	
	
	//TASK B:
	//selbe Methode, diesmal mit primitiven Operationen
	public int countDigits(char[] values) {
		int counter = 0;
		for (int i=0; i<values.length; i++) {
			if (Character.isDigit(values[i])) {
				counter++;
			}}
		return counter;}
	
	
	//TASK C:
	//Max Nummer aus Array (nums) using primitives
	public static int findMaxNumberWithPrimitives(int[] nums) {
		//ich überschreibe jeweils die werte im array, am schluss besteht array nur noch aus dem max value
		for (int i=0; i< nums.length-1; i++) {
			if(nums[i]>= nums[i+1]) {
				nums[i+1] = nums[i];
			}
			else {
				for (int j=0; j< i; j++) {
					nums[j] = nums[i];
				}
			}
		}
		return nums[nums.length-1];
	}
	
	
	//TASK D:
	//ohne primitve
	public int findMaxNumber(int[] nums) {
		Arrays.sort(nums); //sortiert aufsteigend
		return nums[nums.length-1];
		
	}

}
