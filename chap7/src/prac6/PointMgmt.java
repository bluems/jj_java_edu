package prac6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PointMgmt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HashMap<String, MemberInfo> MemberList = new HashMap<String,MemberInfo>();
		Scanner scanner = new Scanner(System.in);
		
		MainLoop:while(true) {
			System.out.println("1. �� ��� 2. �� ���� 3. ����Ʈ ��ȸ");
			if (scanner.hasNextInt())
				switch (scanner.nextInt()) {
					
					case 1:
						Add(MemberList);
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 0:
					default:
						break MainLoop;
				}
		}
		
		scanner.close();
	}
	
	public static void Add(HashMap<String, MemberInfo> MemberList) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("(�̸�) > ");
		String name = scanner.nextLine();
		
		System.out.print("(����) > ");
		//byte age = scanner.nextByte();
		String s_age = scanner.next();
		int age = Integer.parseInt(s_age);
		
		//scanner.skip("[\\r\\n]+");
		
		System.out.println("(�ּ�) > ");
		scanner.nextLine();
		String addr = scanner.nextLine();
		
		MemberList.put(name, new MemberInfo(age, addr, 0));
	}
	
	public static void View(HashMap<String,MemberInfo> MemberList) {
		Iterator<String> it = MemberList.keySet().iterator();
		
		while(it.hasNext()) {
			String name = (String)it.next();
			MemberInfo info = MemberList.get(name);
			System.out.println("���� : " + name + "���� : " + info.age + ", ����Ʈ : " + info.point + ", �ּ� : " + info.addr);
			
		}
		
	}

}
