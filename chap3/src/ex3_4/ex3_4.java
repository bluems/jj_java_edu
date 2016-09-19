package ex3_4;

public class ex3_4 {

	public static void main(String[] args) {
		
		System.out.println("구구단 출력입니다.");
		
		for(int i = 1; i < 10; i++)
		{
			if(i%3!=0)
				continue;
			
			for(int j = 1; j < 10; j++)
			{
				System.out.print(i + "X" + j + "=" + i * j);
				
				if(j < 9)
					System.out.print("\t");
				else
					System.out.println("");
			}
		}
	}

}
