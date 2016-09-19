package ex3_8_2;

import java.util.Scanner;

public class ex3_8_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		int arr [] = new int[10];
		
		System.out.print("정수 10개 입력 > ");
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextInt();
		
		for(int i = 0; i < arr.length; i++)
			if(arr[i] % 3 == 0)
				System.out.println("3배수 > " + arr[i]);
		
		scanner.close();
	}
	
}
