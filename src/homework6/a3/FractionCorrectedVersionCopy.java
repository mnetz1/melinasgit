package a3;

public class FractionCorrectedVersionCopy {

public class Fraction {
		
		private int zaehler;
		private int nenner;
		
		//icomplete 
		public Fraction(int zaehler, int nenner){
		this.zaehler = zaehler;
		this.nenner = nenner; }
		
		//wrong -> verbessert
		public void Kehrwert (){
		int z = this.zaehler;
		int n = this.nenner;
		setNenner(z);
		setZaehler(n); }
		
		//wrong  -> verbessert
		public void multiplikation(Fraction a){
		setNenner(this.nenner * a.nenner);
		setZaehler(this.zaehler * a.zaehler); }
		
		//wrong
		public void addition(Fraction a){
		if (a.getNenner() != this.getNenner()){
		
		int neuerZaehler;
		this.setZaehler(this.getZaehler()*a.getNenner());
		
		neuerZaehler = a.getZaehler()*this.getNenner();
		this.setNenner(this.getNenner()*a.getNenner());	
		this.setZaehler(this.getZaehler()+neuerZaehler); 
		} else {
		this.setZaehler(this.getZaehler() + a.getZaehler()); 
		}}
		
		//wrong
		public void kuerzen (){
		int ggt = ggt(Math.abs(zaehler), Math.abs(nenner)); 
		this.zaehler /= ggt;
		this.nenner /= ggt;
		}
		
		//helper method Euklidian algorithm, // here are no mistakes
		private int ggt(int a, int b) {
		while (b != 0) { int temp = b;
		b = a % b;
		a = temp; }
		return a; }
		
		@Override
		public String toString (){
		return this.getZaehler()+"/"+this.getNenner(); }
		
		public int getZaehler() {
		return zaehler; }
		
		public void setZaehler(int zaehler) {
		this.zaehler = zaehler; }
		
		public int getNenner() {
		return nenner; }
		
		public void setNenner(int nenner) {
			this.nenner = nenner;
		}


	}

}
