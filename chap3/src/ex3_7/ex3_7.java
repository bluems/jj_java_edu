package ex3_7;

import java.util.Scanner;

public class ex3_7 {
	static int result=0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int digit = 0; digit < 100; digit++)
		{
			
			
			int Tdigit = digit / 10;
			int Sdigit = digit % 10;
			
			result = ( Tdigit ==3 || Tdigit == 6 || Tdigit == 9)? (result+1):result;
			result = ( Sdigit ==3 || Sdigit == 6 || Sdigit == 9)? (result+1):result;
			
			if(result == 0)
				continue;
			else
			{
				System.out.print(digit + " ");
				clap();				
			}

		}
		
		scanner.close();
		System.exit(0);
	}
	
	private static void clap()
	{
		System.out.print("�ڼ�");
		switch(result)
		{
		case 1:
			System.out.println("¦");
			break;
		case 2:
			System.out.println("¦¦");
			break;
		}
		
		result = 0;
	}

}
