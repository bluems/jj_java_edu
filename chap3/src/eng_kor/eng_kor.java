package eng_kor;

import java.util.Scanner;

public class eng_kor {

	public static void main(String[] args) {
		String eng[] = {"JJ Univ.","Student","Love","Java","Happy","Future"};
		String kor[] = {"���ִ��б�","�л�","���","�ڹ�","�ູ��","�̷�"};
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("��� �Է��Ͻÿ� > ");
			String buf = scanner.nextLine();
			
			if(buf.equals("exit"))
				break;
			else
				for(int i = 0; i < 5; i++)
					if(buf.equals(eng[i]))
						System.out.println(kor[i]);
		}
		
		scanner.close();
	}

}
