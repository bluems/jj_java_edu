package prac6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Management {
	static Scanner scanner = new Scanner(System.in); // 어차피 계속 쓰이고 아무 메소드에서나
														// close() 되면 전부 die
														// 되므로, Add에서도 써야하므로
														// static
	private static HashMap<String, MemberInfo> MemberList = new HashMap<String, MemberInfo>();
	// Add, View는 관리모드가 아니어도 동작해야 하므로 Static

	public static void table() {
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃　　　　　　　　　　　　　　　　　　　　┏━━━━━━━━━━━━━━━━━━┓　　　　　　　　　　　　　　　　　　　　　　┃");
		System.out.println("┃　　　　　　　　　　　　　　　　　　　　┃　 　고객 관리 프로그램　　┃　　　　　　　　　　　　　　　　　　　　　　┃");
		System.out.println("┃　　　　　　　　　　　　　　　　　　　　┗━━━━━━━━━━━━━━━━━━┛　　　　　　　　　　　　　　　　　　　　　　┃");
		System.out.println("┃　　　　　　　　　　　　　　　　　　　　　　　　　　  　  Ver. 1.0.0　　　　　　　    　　　　　　　　　　　　　　┃");
		System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}
	
	public void start() throws IOException {

		ManagementLoop: while (true) {
			System.out.println("┣━━━━━ 1. 고객 인적사항 변경 2. 고객 포인트 변경 9. 전체 명단 0. 이전 메뉴");
			System.out.print("┣━━━━━ (관리) > ");
			if (scanner.hasNextInt())
				switch (scanner.nextInt()) {
				case 1:
					Modify("info");
					break;
				case 2:
					Modify("point");
					break;
				case 9:
					View();
					break;
				case 0:
					break ManagementLoop;
				default:
					System.out.println("┃　　　　  다시 입력하세요.");
					break;
				}
		}
	}

	private void Modify(String mode) throws IOException {
		System.out.println("┣━━━━━ 변경할 고객 이름을 입력하세요");
		System.out.print("┣━━━━━ (관리/이름) > ");
		scanner.nextLine(); // 여기도 버퍼 초기화
		String find_name = scanner.nextLine();
		MemberInfo info = null;

		if (MemberList.containsKey(find_name)) {
			if (mode.equals("point"))
				info = ModifyPoint(find_name);
			else if (mode.equals("info"))
				info = ModifyInfo(find_name);
		} else
			System.out.println("┃　　　　  해당 고객의 데이터는 존재하지 않습니다.");

		MemberList.put(find_name, info);
	}

	private MemberInfo ModifyPoint(String find_name) throws IOException {
		MemberInfo info = MemberList.get(find_name);
		pointPrint(find_name, info);

		System.out.println("┣━━━━━ 수정할 포인트를 입력하세요.");
		System.out.println("┃　　　　   ex) +500, -500 =500");
		System.out.print("┣━━━━━ (관리/포인트) > ");

		String value = scanner.next();

		if (value.indexOf('+') == 0 || value.indexOf('-') == 0 || value.indexOf('=') == 0) {
			if (value.charAt(0) == '=')
				info.point = Integer.parseInt(value.substring(1, value.length()));
			else
				info.point = info.point + Integer.parseInt(value);
		}
		return info;

	}

	private MemberInfo ModifyInfo(String find_name) {
		MemberInfo info = MemberList.get(find_name); // 수정을 위해 임시 MemberInfo 객체를
														// 생성하고 값 입력
		infoPrint(find_name, info); // 셀렉된 대상 데이터 출력

		ModifyInfoLoop: while (true) {
			System.out.println("┣━━━━━ 수정할 데이터를 입력하세요.");
			System.out.println("┃　　　　   1. 나이 2. 주소 0. 취소");
			System.out.println("┣━━━━━ (관리/인적) > ");
			if (scanner.hasNextInt()) // 정상적인 메뉴 셀렉 확인 후
				switch (scanner.nextInt()) { // 대입. NoSuchElementException 방지
				case 1:
					while (true) {
						System.out.println("┣━━━━━ 수정할 값을 입력해주세요.");
						System.out.print("┣━━━━━ (관리/수정/나이 " + info.age + ") > ");

						if (scanner.hasNextInt()) {
							info.age = scanner.nextInt(); // 임시 데이터에 입력
							break;
						} else
							System.out.println("┃　　　　  올바른 값을 입력하세요.");
					}

					break ModifyInfoLoop;
				case 2:
					System.out.println("┣━━━━━ 수정할 값을 입력해주세요.");
					System.out.print("┣━━━━━ (관리/수정/주소 " + info.addr + ") > "); // 어째선가 이곳도 println하면 아래가 문제 발생함.
					scanner.nextLine(); // 버퍼 초기화
					info.addr = scanner.nextLine();
					break ModifyInfoLoop;
				case 0:
					break ModifyInfoLoop;
				default:
					System.out.println("┃　　　　  올바른 대상을 선택하세요.");
					break;
				}
		}

		return info;

	}

	public static void Add() { // Create 안해도 추가할 순 있다.
		Scanner scanner = new Scanner(System.in); // scanner를 이 메소드에서 닫으면 전체가
													// 더이상 scanner를 쓸 수 없다.
													// Warning 무시.
		System.out.print("┣━━━━━ (이름) > ");
		String name = scanner.nextLine();
		if (MemberList.containsKey(name)) {
			System.out.println("┣━━━━━ Error(500): 이미 존재하는 고객입니다.");
			View(name);
			return ;
		}

		System.out.print("┃　　　　   (나이) > ");
		// byte age = scanner.nextByte();

		int age = scanner.nextInt(); // nextInt는 개행문자를 버퍼에 그대로 남겨둔다.
										// 그런데 자바에는 fflush 같은게 없다.
		scanner.nextLine(); // 따라서 개행문자를 입력받을 수 있는 메소드로 버퍼를 비워야 한다.

		System.out.print("┃　　　　   (주소) > "); // 어째선지 println을 쓰면 가끔 아래 nextLine이 무시됨.
		String addr = scanner.nextLine();

		MemberList.put(name, new MemberInfo(age, addr, 0)); // Put
	}
	
	public static void search() {
		System.out.println("┣━━━━━ 검색한 고객명을 입력하세요.");
		System.out.print("┣━━━━━ (검색) > ");
		//scanner.nextLine(); // 여기도 버퍼 초기화
		String find_name = scanner.nextLine();

		View(find_name);

	}

	public static void View() {// Create 안해도 볼 순 있다.
		Iterator<String> it = MemberList.keySet().iterator();

		while (it.hasNext()) { // MemberList의 개수만큼 루프
			String name = (String) it.next();
			MemberInfo info = MemberList.get(name);

			infoPrint(name, info);
		}

	}

	public static void View(String find_name) {
		if (MemberList.containsKey(find_name)) {
			MemberInfo info = MemberList.get(find_name);
			infoPrint(find_name, info);
		}
	}

	

	private static void infoPrint(String name, MemberInfo info) { // 고객 데이터출력 양식
																	// 통일을 위해 만든
																	// 메소드
		System.out.println("┃　　　　   고객명 : " + name + ", 나이 : " + info.age + ", 포인트 : " + info.point + ", 주소 : " + info.addr);
	}

	private static void pointPrint(String name, MemberInfo info) { // 고객 데이터출력
																	// 양식 통일을 위해
																	// 만든 메소드
		System.out.println("┃　　　　   고객명 : " + name + ", 나이 : " + info.age + ", 포인트 : " + info.point);
	}

}
