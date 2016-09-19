package ex3_7;

import java.util.Scanner;

public class ex3_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		
		System.out.println("정수 5개 입력 > ");
		
		for(int i = 0; i < 5; i++)
		{
			int intArray[];
			intArray = new int[5];
			
			intArray[i] = scanner.nextInt();
			
			if(intArray[i] > max)
				max = intArray[i];
		}
		
		System.out.println("Max > " + max);
		
		scanner.close();

	}

}
