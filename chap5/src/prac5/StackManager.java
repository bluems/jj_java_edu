package prac5;

import java.util.Scanner;

public class StackManager {

	public static void main(String[] args) {
		StringStack stringStack = new StringStack();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է� ");
		for(int i = 0; i< stringStack.length(); i++) {
			System.out.println("(push) >> ");
			if(!stringStack.push(scanner.next())) {
				System.out.println("������ ���� á���ϴ�.");
				break;
			}
		}
		
		for(int i = 0; i<stringStack.length(); i++){
			System.out.println("(pop) >> " + stringStack.pop());
		}
		
		scanner.close();
	}
}
