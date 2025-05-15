package a1;

import java.util.Arrays;

public class MatrixMultMain {

	public static void main(String[] args) {
		
		/* int[][]m1 = { {1,0,1}, {0,0,0}, {0,1,0} };
		int[][]m2 = { {1,0,0}, {0,1,0}, {0,0,1} }; */
		
		/* int[][]m1 = {{3,3},{3,3}};
		int[][]m2 = {{3,3},{3,2}}; */
		
		int[][] m1 = {{2,1},{0,1}};
		int[][] m2 = {{2,2,2},{2,2,2}};
		
		System.out.print(Arrays.deepToString(productOfTwoMatrices(m1,m2))); //weil man kann nicht einfach eine Mtarix ausgeben lassen deswegen Arrays.

	}
	
	//Mit start():
	  	public static int[][] productOfTwoMatrices(int[][] m1, int[][] m2) {
			int rowsM1 = m1.length; //Anzahl Zeilen Matrix 1 
			int colsM2 = m2[0].length; //Anzahl Spalten Matrix 2
		
		int[][] finalMatrix = new int[rowsM1][colsM2];
		
		
		int[] w = new int[m2.length];
	
		DotProductThread[][] threads = new DotProductThread[rowsM1][colsM2];
		
		
		for (int n=0; n<rowsM1; n++) {
			
		//geht über i-te Spalte der Matrix 2
		for (int i=0; i<colsM2; i++) {
			
			//geht über j-te Zeile der Matrix2
		for (int j=0; j<m2.length; j++) {
		w[j]= m2[j][i]; //Vektor w speichert i- te Spalte von matrix2
		}
		threads[n][i] = new DotProductThread(m1[n],w.clone()); //Vektor w Klonen!!!! 
		threads[n][i].start(); 
		}}
		
		for (int i=0; i<rowsM1; i++) {
			for (int j=0; j<colsM2; j++) {
				try {
					threads[i][j].join();
					finalMatrix[i][j] = threads[i][j].getDot();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	return finalMatrix;	
}           																				
	
	
	// VS
	//Mit run():
	
	 /* 		public static int[][] productOfTwoMatrices(int[][] m1, int[][] m2) {
		int rowsM1 = m1.length; //Anzahl Zeilen Matrix 1 
		int colsM2 = m2[0].length; //Anzahl Spalten Matrix 2
	
	int[][] finalMatrix = new int[rowsM1][colsM2];
	
	
	int[] w = new int[m2.length];

	DotProductThread[][] threads = new DotProductThread[rowsM1][colsM2];
	
	
	for (int n=0; n<rowsM1; n++) {
		
	//geht über i-te Spalte der Matrix 2
	for (int i=0; i<colsM2; i++) {
		
		//geht über j-te Zeile der Matrix2
	for (int j=0; j<m2.length; j++) {
	w[j]= m2[j][i]; //Vektor w speichert i- te Spalte von matrix2
	}
	threads[n][i] = new DotProductThread(m1[n],w.clone()); //Vektor w Klonen!!!! 
	threads[n][i].run(); 
	finalMatrix[n][i] = threads[n][i].getDot();
	}}
	
return finalMatrix;	
}           																		*/				
	
	
}
