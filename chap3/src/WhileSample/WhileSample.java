package WhileSample;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		int n,count=0;
		System.out.println("�Է�(����) > ");
		
		while((n = scanner.nextInt()) != 0)
		{
			sum+=n;
		}
		
		System.out.println("�Էµ� ���� > "+count);
		System.out.println("��� > "+(double)sum/count);
		
		scanner.close();

	}

}
