package ex_circle2;

import java.util.Scanner;

public class circle2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.141592;
		System.out.println("������ �Է� : ");
		
		double radius = scanner.nextDouble();
		double result = radius * radius * PI;
		
		System.out.println("�Էµ� ������ : "+radius+", ���� ������ : "+result);
		scanner.close();
	}

}