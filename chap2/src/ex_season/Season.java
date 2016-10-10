package ex_season;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇월임??? : ");
		
		int month = scanner.nextInt();
		switch(month)
		{
		case 3: case 4: case 5:
			System.out.println("봄이네"); break;
		case 6: case 7: case 8:
			System.out.println("여름이네");break;
		case 9: case 10: case 11:
			System.out.println("가을이네");break;
		case 12: case 1: case 2:
			System.out.println("겨울이네");break;
		default:
			System.out.println("똑띠 입력 안하냐");
		}
		scanner.close();
	}

}
