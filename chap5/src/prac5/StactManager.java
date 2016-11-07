package prac5;

import java.util.Scanner;

public class StactManager {

	public static void main(String[] args) {
		StringStack stringStack = new StringStack();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열 입력 >>");
		for(int i = 0; i< 5; i++) {
			if(stringStack.push(scanner.next())) {
				
			}
		}
		
		scanner.close();
	}

}
