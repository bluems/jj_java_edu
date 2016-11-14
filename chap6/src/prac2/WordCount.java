package prac2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println(" >> ");
			String query = scanner.nextLine();
			
			if ( query.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(query," ");
			
			System.out.println("어절 개수는 " + st.countTokens());
		}
		
		scanner.close();
	}

}
