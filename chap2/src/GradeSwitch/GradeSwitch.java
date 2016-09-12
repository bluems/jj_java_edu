package GradeSwitch;

import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		int score;
		
		System.out.println("score : ");
		score = scanner.nextInt();
		
		if(score >= 80)
			grade = 'E';
		else if(score >=60)
			grade = 'G';
		else
			grade = 'B';
		
		switch(grade)
		{
		case 'E':
			System.out.println("Excellent");
			break;
		case 'G':
			System.out.println("Good");
			break;
		case 'B':
			System.out.println("Bye");
			
		}
		
	}

}
