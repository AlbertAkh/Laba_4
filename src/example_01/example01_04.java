package example_01;

public class example01_04 {

	public static void main(String[] args) {
		int [][]massiv = new int[5][5];
		
				
		for (int i = 0; i<massiv.length; i++) {
			for (int j = 0; j<i; j++)	{
				System.out.print(massiv[i][j]+" ");
				
				}
			System.out.println();
				}
		}
	}

