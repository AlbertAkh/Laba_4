package example_01;
import java.util.Scanner;
public class example01_08 {

	public static void main(String[] args) {
		System.out.println("Введите текс для шифрования: ");
		System.out.println("_______________________________________");
		Scanner scan = new Scanner(System.in);	//создали переменную скан
			String text = scan.next();			//ввели текс
				int size = text.length();
		int hhh = 0;
		System.out.println("_______________________________________");
				System.out.println("введите ключ от 1 до 25: ");
					Scanner key = new Scanner(System.in);	//задали значение ключа
						int key_1 = key.nextInt();
						
						String alfa = "abcdefghijklmnopqrstuvwxyz"; //строка алфавита
						char[] muss = alfa.toCharArray(); //массив алфавита
						 
						char[] vvel = text.toCharArray(); //массив введенного текста
				for (int i = 0; i < size; i++)		//цикл от 0 до размера строки
						for (int j = 0; j<muss.length; j++) 
						{
						if (muss[j] == vvel[i])
						{
								if (j+key_1>26) { hhh = (j + key_1)-26; }
								else hhh = j + key_1;
	
								System.out.print(muss[hhh]);
								}  
								}
				System.out.println(" :текст после преобразования");
					System.out.println("_______________________________________");
						System.out.println("выполнить обратное преобразоване? y/n");
								Scanner key_2 = new Scanner(System.in);	//задали значение ключа
				String key_3 = key_2.next();
					switch (key_3) {
						case "y": 
				  		  System.out.println("_______________________________________");
							System.out.print(text);
					  break;
						case "n": System.out.println("до свидания!"); 
					break;
				  	  default: System.out.println("введите корректный ответ!");
				  		}
					}
		}