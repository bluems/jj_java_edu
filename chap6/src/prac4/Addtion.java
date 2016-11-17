package prac4;

import java.util.Scanner;

public class Addtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String exp = scanner.nextLine();
		Calc calc = new Calc();
		
		
		System.out.println(calc.sub(exp)); 
		
		
		//System.out.println("гую╨ " + sum);
		scanner.close();
	}

}
