package ex_ggd;

import java.util.Scanner;

public class ggd {
	static int result=0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			int digit=0;
			System.out.println("�Է� > ");
			if(!scanner.hasNextInt())
			{
				if(scanner.next().equals("q"))
					break;
				
				System.out.println("���ڸ� �Է��ϼ���.");
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
		System.out.print("�ڼ�");
		switch(result)
		{
		case 1:
			System.out.println("¦");
			break;
		case 2:
			System.out.println("¦¦");
			break;
		default:
			System.out.println("����");
		}
		
		result = 0;
	}

}
