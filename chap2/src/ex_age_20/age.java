package ex_age_20;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� : ");
		int age = scanner.nextInt();
		if((age>=20) && (age < 30 ))
		{
			System.out.println("20���Դϴ�.");
			System.out.println("20��� �ູ�մϴ�.");
			
			
		}
		
		else
			System.out.println("20�밡 �ƴմϴ�.");
		
		scanner.close();
	}

}
