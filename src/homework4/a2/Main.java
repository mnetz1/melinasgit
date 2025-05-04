package a2;

import java.util.Arrays;
import java.util.Scanner;

//implement Scanner.class;

public class Main {

	public static void main(String[] args) {
		
		//Test für Methode "isAnagram()":
		System.out.println(isAnagram("melina", "melina"));
		
		//Test für Methode "countLetters()":
		 System.out.println(Arrays.toString(countLetters("melina")));
		
		//Test für Methode "printLetterCounts()":
		printLetterCounts("melina");
		
		
		//Aus Aufgabe: man soll Scanner Klasse nutzen:
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the first String: ");
	String word1 = scanner.nextLine();
	
	System.out.print("Enter the second string: ");
	String word2 = scanner.nextLine();
	
	System.out.println("Are the anagrams? " + isAnagram(word1, word2));
	printLetterCounts(word1);

	}
	
//true, wenn a und b Anagrame sind
public static boolean isAnagram(String a, String b) { //ich glaube static weil methoden in Main sind, 
		//konnte sonst nicht die Methode testen in main methode
		int[] a1 = countLetters(a);
		int[] b1 = countLetters(b);
		
		for (int i = 0; i<26; i++) {
			if (a1[i] != b1[i]) {
				return false;
			}
		}
		return true;
	}
	

//Hilfsmethode: zählt Anzahl des vorkommens jedes Buchstabens (von a-z) im String s	
public static int[] countLetters(String s) {
	
	int[] anzahlBuchstabenInS = new int[26]; //a-z sind 26 Buchstaben 
	
	outerLoop:
	for(int i=0; i<s.length(); i++) {
		
	for (char buchstabe = 'a'; buchstabe <= 'z'; buchstabe++) {
		if (s.charAt(i) == buchstabe) {
	
			anzahlBuchstabenInS[buchstabe - 'a']++; //mit Unicode-Wert der chars
			//wir starten bei a, gibt index des jeweiligen buchstabens zurück, zb für b den Index 1
			
			continue outerLoop; //wenn if bedingung erfüllt wird gestoppt und i++ gemacht
			//also man schaut sich nächsten Buchstaben von s an
		}}}
	return anzahlBuchstabenInS;
	
}
	
	

public static void printLetterCounts(String s) {
		int[] i = countLetters(s);
		
		//man muss gleichzeitig hochgehen mit beiden Indexen deswegen geht das so auch nicht 
		/*for (int j : i) {
			//if (i[j] != null) { //j ist schon der Wert aus dem Array, nicht der Index
			if 	(j != 0) {
				System.out.println();
			}}*/
		
		
		//man kann nicht zwei verschiedene Typen in for Schleife haben
		//for (int j = 0, char buchstabe = 'a'; j < 26 && buchstabe <= 'z'; j++, buchstabe++) {
		//}
		
		//zuerst j initialisieren, dann gehts
		int j = 0;
		for (char buchstabe = 'a'; buchstabe <= 'z'; buchstabe++, j++) {
		if (i[j] != 0) {
			System.out.println(buchstabe + ":" + i[j]);
			continue;
		}}}



}
