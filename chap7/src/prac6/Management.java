package prac6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Management {
	static Scanner scanner = new Scanner(System.in); // ������ ��� ���̰� �ƹ� �޼ҵ忡����
														// close() �Ǹ� ���� die
														// �ǹǷ�, Add������ ����ϹǷ�
														// static
	private static HashMap<String, MemberInfo> MemberList = new HashMap<String, MemberInfo>();
	// Add, View�� ������尡 �ƴϾ �����ؾ� �ϹǷ� Static

	public static void table() {
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("���������������������������������������������� ���� ���� ���α׷�����������������������������������������������������");
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("������������������������������������������������������  ��  Ver. 1.0.0��������������    ������������������������������");
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������������");
	}
	
	public void start() throws IOException {

		ManagementLoop: while (true) {
			System.out.println("������������ 1. �� �������� ���� 2. �� ����Ʈ ���� 9. ��ü ��� 0. ���� �޴�");
			System.out.print("������������ (����) > ");
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
					System.out.println("����������  �ٽ� �Է��ϼ���.");
					break;
				}
		}
	}

	private void Modify(String mode) throws IOException {
		System.out.println("������������ ������ �� �̸��� �Է��ϼ���");
		System.out.print("������������ (����/�̸�) > ");
		scanner.nextLine(); // ���⵵ ���� �ʱ�ȭ
		String find_name = scanner.nextLine();
		MemberInfo info = null;

		if (MemberList.containsKey(find_name)) {
			if (mode.equals("point"))
				info = ModifyPoint(find_name);
			else if (mode.equals("info"))
				info = ModifyInfo(find_name);
		} else
			System.out.println("����������  �ش� ���� �����ʹ� �������� �ʽ��ϴ�.");

		MemberList.put(find_name, info);
	}

	private MemberInfo ModifyPoint(String find_name) throws IOException {
		MemberInfo info = MemberList.get(find_name);
		pointPrint(find_name, info);

		System.out.println("������������ ������ ����Ʈ�� �Է��ϼ���.");
		System.out.println("����������   ex) +500, -500 =500");
		System.out.print("������������ (����/����Ʈ) > ");

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
		MemberInfo info = MemberList.get(find_name); // ������ ���� �ӽ� MemberInfo ��ü��
														// �����ϰ� �� �Է�
		infoPrint(find_name, info); // ������ ��� ������ ���

		ModifyInfoLoop: while (true) {
			System.out.println("������������ ������ �����͸� �Է��ϼ���.");
			System.out.println("����������   1. ���� 2. �ּ� 0. ���");
			System.out.println("������������ (����/����) > ");
			if (scanner.hasNextInt()) // �������� �޴� ���� Ȯ�� ��
				switch (scanner.nextInt()) { // ����. NoSuchElementException ����
				case 1:
					while (true) {
						System.out.println("������������ ������ ���� �Է����ּ���.");
						System.out.print("������������ (����/����/���� " + info.age + ") > ");

						if (scanner.hasNextInt()) {
							info.age = scanner.nextInt(); // �ӽ� �����Ϳ� �Է�
							break;
						} else
							System.out.println("����������  �ùٸ� ���� �Է��ϼ���.");
					}

					break ModifyInfoLoop;
				case 2:
					System.out.println("������������ ������ ���� �Է����ּ���.");
					System.out.print("������������ (����/����/�ּ� " + info.addr + ") > "); // ��°���� �̰��� println�ϸ� �Ʒ��� ���� �߻���.
					scanner.nextLine(); // ���� �ʱ�ȭ
					info.addr = scanner.nextLine();
					break ModifyInfoLoop;
				case 0:
					break ModifyInfoLoop;
				default:
					System.out.println("����������  �ùٸ� ����� �����ϼ���.");
					break;
				}
		}

		return info;

	}

	public static void Add() { // Create ���ص� �߰��� �� �ִ�.
		Scanner scanner = new Scanner(System.in); // scanner�� �� �޼ҵ忡�� ������ ��ü��
													// ���̻� scanner�� �� �� ����.
													// Warning ����.
		System.out.print("������������ (�̸�) > ");
		String name = scanner.nextLine();
		if (MemberList.containsKey(name)) {
			System.out.println("������������ Error(500): �̹� �����ϴ� ���Դϴ�.");
			View(name);
			return ;
		}

		System.out.print("����������   (����) > ");
		// byte age = scanner.nextByte();

		int age = scanner.nextInt(); // nextInt�� ���๮�ڸ� ���ۿ� �״�� ���ܵд�.
										// �׷��� �ڹٿ��� fflush ������ ����.
		scanner.nextLine(); // ���� ���๮�ڸ� �Է¹��� �� �ִ� �޼ҵ�� ���۸� ����� �Ѵ�.

		System.out.print("����������   (�ּ�) > "); // ��°���� println�� ���� ���� �Ʒ� nextLine�� ���õ�.
		String addr = scanner.nextLine();

		MemberList.put(name, new MemberInfo(age, addr, 0)); // Put
	}
	
	public static void search() {
		System.out.println("������������ �˻��� ������ �Է��ϼ���.");
		System.out.print("������������ (�˻�) > ");
		//scanner.nextLine(); // ���⵵ ���� �ʱ�ȭ
		String find_name = scanner.nextLine();

		View(find_name);

	}

	public static void View() {// Create ���ص� �� �� �ִ�.
		Iterator<String> it = MemberList.keySet().iterator();

		while (it.hasNext()) { // MemberList�� ������ŭ ����
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

	

	private static void infoPrint(String name, MemberInfo info) { // �� ��������� ���
																	// ������ ���� ����
																	// �޼ҵ�
		System.out.println("����������   ���� : " + name + ", ���� : " + info.age + ", ����Ʈ : " + info.point + ", �ּ� : " + info.addr);
	}

	private static void pointPrint(String name, MemberInfo info) { // �� ���������
																	// ��� ������ ����
																	// ���� �޼ҵ�
		System.out.println("����������   ���� : " + name + ", ���� : " + info.age + ", ����Ʈ : " + info.point);
	}

}
