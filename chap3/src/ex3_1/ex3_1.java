package ex3_1;

public class ex3_1 {

	public static void main(String[] args) {
		int i, sum = 0;
		
		for(i=1; i<=100; i++)
		{
			if(i % 2 != 0)
				continue;
			sum += i;
			System.out.print(i);
			
			if(i <= 9)
				System.out.print("+");
			else
			{
				System.out.print("=");
				System.out.println(sum);
			}
		}

	}

}
