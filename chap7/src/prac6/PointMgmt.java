package prac6;

import java.io.IOException;
import java.util.Scanner;

public class PointMgmt {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Management.table();
		MainLoop: while (true) {
			System.out.println("┣━━━━━ 1. 등록 2. 조회 3. 관리");
			System.out.print("┣━━━━━ > ");

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
			System.out.println("┣━━━━━ 1. 전체 명단 2. 회원 정보 검색 0.이전 메뉴");
			System.out.print("┣━━━━━ (조회) > ");
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
