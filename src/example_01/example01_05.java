package example_01;

public class example01_05 {

	public static void main(String[] args) {
	int [][]massiv = new int[4][7];
	
		for (int i = 0; i<massiv.length; i++) {
			for (int j = 0; j<massiv[i].length; j++) {
				
				massiv[i][j] = ((int)(Math.random()*10));
				System.out.print(massiv[i][j]+" ");
		}
		System.out.println();
		
		}
		System.out.println("меняем местами строку со столбцом:");
		
int [][]massivf = new int[7][4];
		for (int i = 0; i<massivf.length; i++) {
			for (int j = 0; j<massivf[i].length; j++) {
				
				massivf[i][j] = massiv[j][i];
				System.out.print(massivf[i][j]+" ");
		}
		System.out.println();
		
	}
	}
}