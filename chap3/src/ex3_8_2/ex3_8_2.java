package ex3_8_2;

import java.util.Scanner;

public class ex3_8_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		int arr [] = new int[10];
		
		System.out.print("���� 10�� �Է� > ");
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextInt();
		
		for(int i = 0; i < arr.length; i++)
			if(arr[i] % 3 == 0)
				System.out.println("3��� > " + arr[i]);
		
		scanner.close();
	}
	
}
