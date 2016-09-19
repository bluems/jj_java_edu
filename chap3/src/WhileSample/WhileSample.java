package WhileSample;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		int n,count=0;
		System.out.println("입력(연속) > ");
		
		while((n = scanner.nextInt()) != 0)
		{
			sum+=n;
		}
		
		System.out.println("입력된 갯수 > "+count);
		System.out.println("평균 > "+(double)sum/count);
		
		scanner.close();

	}

}
