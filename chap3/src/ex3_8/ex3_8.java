package ex3_8;

import java.util.Scanner;

public class ex3_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;
		
		System.out.println("ÀÔ·Â > ");
		
		for(int i = 0; i < intArray.length; i++)
		{
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}

		
		System.out.println("Æò±ÕÀº > " + (double)sum / intArray.length);
	}

}
