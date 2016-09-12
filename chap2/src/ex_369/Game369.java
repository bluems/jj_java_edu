package ex_369;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¼ıÀÚ : ");
		String num = scanner.next();
		
		int count=0;
		
		for(int i=0; i<num.length();i++)
		{
			if((num.charAt(i)=='3') || (num.charAt(i)=='6') || (num.charAt(i)=='9'))
				count++;
		}
		
		switch(count){
			case 1:
				System.out.println("¹Ú¼öÂ¦");
				break;
			case 2:
				System.out.println("¹Ú¼öÂ¦Â¦");
				break;
			case 3:
				System.out.println("¹Ú¼öÂ¦Â¦Â¦");
				break;
			case 4:
				System.out.println("¹Ú¼öÂ¦Â¦Â¦Â¦");
				break;
			case 5:
				System.out.println("¹Ú¼öÂ¦Â¦Â¦Â¦Â¦");
				break;
			default:
				System.out.println("¹Ú¼ö ¾øÀ½");
				break;
		}
		
	}

}
