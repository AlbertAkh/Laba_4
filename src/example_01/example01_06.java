package example_01;

public class example01_06 {

	public static void main(String[] args) {
	int [][]massiv = new int[4][4];
		for (int i = 0; i<massiv.length; i++) {
			for (int j = 0; j<massiv[i].length; j++) {
				
				massiv[i][j] = ((int)(Math.random()*10));
				System.out.print(massiv[i][j]+" ");
		}
		System.out.println();
		
		}
		System.out.println("____________________");
		
		
int num_1 = ((int)(Math.random()*3));		
int num_2 = ((int)(Math.random()*3));
int [][]massivf = new int[4][4];
		for (int i = 0; i<massivf.length; i++) {
			if (i != num_1) {
				for (int j = 0; j<massivf[i].length; j++) 
				{
					if (j != num_2) {
				massivf[i][j] = massiv[i][j];
				System.out.print(massivf[i][j]+" ");
					}
		}
					
		System.out.println();
			}  		
			}
		System.out.println("удалили ["+num_1+"] строку и ["+num_2+"] столбец" );
	}
	
}