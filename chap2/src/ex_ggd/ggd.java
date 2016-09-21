package ex_ggd;

import java.util.Scanner;

public class ggd {
	static int result=0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			int digit=0;
			System.out.println("입력 > ");
			if(!scanner.hasNextInt())
			{
				if(scanner.next().equals("q"))
					break;
				
				System.out.println("숫자를 입력하세요.");
				continue;
			}
			else
				digit = scanner.nextInt();
			
			int Tdigit = digit / 10;
			int Sdigit = digit % 10;
			
			result = ( Tdigit ==3 || Tdigit == 6 || Tdigit == 9)? (result+1):result;
			result = ( Sdigit ==3 || Sdigit == 6 || Sdigit == 9)? (result+1):result;
			
			clap();
		}
		
		scanner.close();
		System.exit(0);
	}
	
	private static void clap()
	{
		System.out.print("박수");
		switch(result)
		{
		case 1:
			System.out.println("짝");
			break;
		case 2:
			System.out.println("짝짝");
			break;
		default:
			System.out.println("없음");
		}
		
		result = 0;
	}

}
