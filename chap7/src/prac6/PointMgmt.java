package prac6;

import java.io.IOException;
import java.util.Scanner;

public class PointMgmt {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Management.table();
		MainLoop: while (true) {
			System.out.println("������������ 1. ��� 2. ��ȸ 3. ����");
			System.out.print("������������ > ");

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
		System.gc();
	}

	public static void MainCaseInQuery() {
		InQueryLoop: while (true) {
			System.out.println("������������ 1. ��ü ��� 2. ȸ�� ���� �˻� 0.���� �޴�");
			System.out.print("������������ (��ȸ) > ");
			if (scanner.hasNextInt())
				switch (scanner.nextInt()) {
				case 1:
					Management.View();
					break;
				case 2:
					Management.search();
					break;
				case 0:
				default:
					break InQueryLoop;
				}
		}
	}

}
