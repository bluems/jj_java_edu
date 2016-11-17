package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(scanner.nextLine(),"/");
		
		while(st.hasMoreTokens() )
			System.out.println(st.nextToken());
		
		System.out.println(st.countTokens());
	}

}
