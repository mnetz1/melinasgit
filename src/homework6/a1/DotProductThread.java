package a1;

public class DotProductThread extends Thread{
	
	private int[] v1;
	private int[] v2;
	private int dot;

	public DotProductThread(int[] v1, int[] v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	

	public int getDot() {
		return dot;
	}

	
	
	public void run() {
		dot = 0;
		// noch prüfen ob v1 und v2 gleich lang und sonst Fehler ausgeben?
		for (int i=0; i<v1.length; i++) {
			dot += v1[i]*v2[i];
		}	
	}

	

}
