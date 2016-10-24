package eng_kor;

import java.util.Scanner;

public class eng_kor {

	public static void main(String[] args) {
		String eng[] = {"JJ Univ.","Student","Love","Java","Happy","Future"};
		String kor[] = {"전주대학교","학생","사랑","자바","행복한","미래"};
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("영어를 입력하시오 > ");
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
