package prac4;

import java.util.Scanner;

public class Addtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String exp = scanner.nextLine();
		Calc calc = new Calc();	
		
		calc.calculator(exp.trim());
		
		System.out.println("°á°ú : " + calc.getResult());

		scanner.close();
	}

}
