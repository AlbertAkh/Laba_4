package example_01;
import java.util.Scanner;
public class example01_09 {

	public static void main(String[] args) {
		System.out.println("������� ����������� �������: ");
		System.out.println("_______________________________________");
			Scanner scan_1 = new Scanner(System.in);	//������� ���������� ����
			String text_1 = scan_1.next();			//����� ����
				char[] mussy = text_1.toCharArray();
		
		
		
		System.out.println("������� ���� ��� ����������: ");
		System.out.println("_______________________________________");
		Scanner scan = new Scanner(System.in);	//������� ���������� ����
			String text = scan.next();			//����� ����
				int size = text.length();
		int hhh = 0;
		System.out.println("_______________________________________");
				System.out.println("������� ���� �� 1 �� 25: ");
					Scanner key = new Scanner(System.in);	//������ �������� �����
						int key_1 = key.nextInt();
						
						//String alfa = "abcdefghijklmnopqrstuvwxyz"; //������ ��������
						//char[] mussy = text_1.toCharArray(); //������ ��������
						 
						char[] vvel = text.toCharArray(); //������ ���������� ������
				for (int i = 0; i < size; i++)		//���� �� 0 �� ������� ������
						for (int j = 0; j<mussy.length; j++) 
						{
						if (mussy[j] == vvel[i])
						{
								if (j+key_1>26) { hhh = (j + key_1)-26; }
								else hhh = j + key_1;
	
								System.out.print(mussy[hhh]);
								}  
								}
				System.out.println(" :����� ����� ��������������");
					System.out.println("_______________________________________");
						System.out.println("��������� �������� �������������? y/n");
								Scanner key_2 = new Scanner(System.in);	//������ �������� �����
				String key_3 = key_2.next();
					switch (key_3) {
						case "y": 
				  		  System.out.println("_______________________________________");
							System.out.print(text);
					  break;
						case "n": System.out.println("�� ��������!"); 
					break;
				  	  default: System.out.println("������� ���������� �����!");
				  		}
					}
		}