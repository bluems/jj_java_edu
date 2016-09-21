package eng_kor;

import java.util.Scanner;

public class eng_kor {

	public static void main(String[] args) {
		String eng[] = {"eje","bsh","pjs","ydh","khj"};
		String kor[] = {"네다드","백드론","박노예","유노비","김곰신"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("영어를 입력하시지 > ");
		String buf = scanner.next();
		if(!buf.equals("exit"))
			for(int i = 0; i < 5; i++)
				if(buf.equals(eng[i]))
					System.out.println(kor[i] + "랑께");
		
		
		scanner.close();
	}

}
