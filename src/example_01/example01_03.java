package example_01;
public class example01_03 {

	public static void main(String[] args) {
		int[][] array = new int[3][2];
		
		array[0][0] = 2;
		array[0][1] = 2;
		array[1][0] = 2;
		array[1][1] = 2;
		array[2][0] = 2;
		array[2][1] = 2;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) 
				
			{
				
				System.out.print(array[i][j]+"   ");
			}
			System.out.println();
		}
		}
}