package prac6;

import java.io.IOException;
import java.util.Scanner;

public class PointMgmt {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		MainLoop:while(true) {
			System.out.println("1. ��� 2. ��ȸ 3. ����");
			if (scanner.hasNextInt())
				switch (scanner.nextInt()) {
					
					case 1:
						Management.Add();
						break;
					case 2:
						MainCaseInQuery();
						break;
					case 3:
						Management manage = new Management();
						manage.start();
						break;
					case 0:
					default:
						break MainLoop;
				}
		}
		
		scanner.close();
	}
	
	public static void MainCaseInQuery() {
		
		
		InQueryLoop:while(true) {
			System.out.println("1. ��ü ��� 0.���� �޴�");
			
			if (scanner.hasNextInt())
				switch(scanner.nextInt()) {
				case 1:
					Management.View();
				case 0:
					break InQueryLoop;
				}
		}
	}

}
