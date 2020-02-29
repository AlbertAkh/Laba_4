package example_01;
import java.util.Scanner;
public class example01_09 {

	public static void main(String[] args) {
		System.out.println("¬ведите собственный алфавит: ");
		System.out.println("_______________________________________");
			Scanner scan_1 = new Scanner(System.in);	//создали переменную скан
			String text_1 = scan_1.next();			//ввели текс
				char[] mussy = text_1.toCharArray();
		
		
		
		System.out.println("¬ведите текс дл€ шифровани€: ");
		System.out.println("_______________________________________");
		Scanner scan = new Scanner(System.in);	//создали переменную скан
			String text = scan.next();			//ввели текс
				int size = text.length();
		int hhh = 0;
		System.out.println("_______________________________________");
				System.out.println("введите ключ от 1 до 25: ");
					Scanner key = new Scanner(System.in);	//задали значение ключа
						int key_1 = key.nextInt();
						
						//String alfa = "abcdefghijklmnopqrstuvwxyz"; //строка алфавита
						//char[] mussy = text_1.toCharArray(); //массив алфавита
						 
						char[] vvel = text.toCharArray(); //массив введенного текста
				for (int i = 0; i < size; i++)		//цикл от 0 до размера строки
						for (int j = 0; j<mussy.length; j++) 
						{
						if (mussy[j] == vvel[i])
						{
								if (j+key_1>26) { hhh = (j + key_1)-26; }
								else hhh = j + key_1;
	
								System.out.print(mussy[hhh]);
								}  
								}
				System.out.println(" :текст после преобразовани€");
					System.out.println("_______________________________________");
						System.out.println("выполнить обратное преобразоване? y/n");
								Scanner key_2 = new Scanner(System.in);	//задали значение ключа
				String key_3 = key_2.next();
					switch (key_3) {
						case "y": 
				  		  System.out.println("_______________________________________");
							System.out.print(text);
					  break;
						case "n": System.out.println("до свидани€!"); 
					break;
				  	  default: System.out.println("введите корректный ответ!");
				  		}
					}
		}