package eng_kor;

import java.util.Scanner;

public class eng_kor {

	public static void main(String[] args) {
		String eng[] = {"eje","bsh","pjs","ydh","khj"};
		String kor[] = {"�״ٵ�","����","�ڳ뿹","�����","�����"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��� �Է��Ͻ��� > ");
		String buf = scanner.next();
		if(!buf.equals("exit"))
			for(int i = 0; i < 5; i++)
				if(buf.equals(eng[i]))
					System.out.println(kor[i] + "����");
		
		
		scanner.close();
	}

}
