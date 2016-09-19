package ex3_6;

import java.util.Scanner;

public class ex3_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 (종료 : exit) > ");
		
		while(true)
			if(scanner.nextLine().equals("exit"))
				break;
		
		System.out.println("종료합니다.");
		scanner.close();

	}

}
