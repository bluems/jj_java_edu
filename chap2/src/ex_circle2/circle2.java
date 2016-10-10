package ex_circle2;

import java.util.Scanner;

public class circle2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.141592;
		System.out.println("반지름 입력 : ");
		
		double radius = scanner.nextDouble();
		double result = radius * radius * PI;
		
		System.out.println("입력된 반지름 : "+radius+", 원의 면적은 : "+result);
		scanner.close();
	}

}