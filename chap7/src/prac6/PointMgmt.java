package prac6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PointMgmt {
<<<<<<< HEAD
	static Scanner scanner = new Scanner(System.in);
=======
>>>>>>> parent of b5fe26a... 16.12.02 ì‹¤ìŠµ 7-6 ê¸°ëŠ¥ ìµœì¢…

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

<<<<<<< HEAD
		MainLoop: while (true) {
			System.out.println("1. µî·Ï 2. Á¶È¸ 3. °ü¸®");
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
=======
		HashMap<String, MemberInfo> MemberList = new HashMap<String,MemberInfo>();
		Scanner scanner = new Scanner(System.in);
		
		MainLoop:while(true) {
			System.out.println("1. °í°´ µî·Ï 2. °í°´ °ü¸® 3. Æ÷ÀÎÆ® Á¶È¸");
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
>>>>>>> parent of b5fe26a... 16.12.02 ì‹¤ìŠµ 7-6 ê¸°ëŠ¥ ìµœì¢…
				}
		}

		scanner.close();
	}
<<<<<<< HEAD

	public static void MainCaseInQuery() {
		InQueryLoop: while (true) {
			System.out.println("1. ÀüÃ¼ ¸í´Ü 2. È¸¿ø Á¤º¸ °Ë»ö 0.ÀÌÀü ¸Þ´º");

			if (scanner.hasNextInt())
				switch (scanner.nextInt()) {
				case 1:
					Management.View();
					break InQueryLoop;
				case 2:
					Management.search();
					break InQueryLoop;
				case 0:
				default:
					break InQueryLoop;
				}
=======
	
	public static void Add(HashMap<String, MemberInfo> MemberList) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("(ÀÌ¸§) > ");
		String name = scanner.nextLine();
		
		System.out.print("(³ªÀÌ) > ");
		//byte age = scanner.nextByte();
		String s_age = scanner.next();
		int age = Integer.parseInt(s_age);
		
		//scanner.skip("[\\r\\n]+");
		
		System.out.println("(ÁÖ¼Ò) > ");
		scanner.nextLine();
		String addr = scanner.nextLine();
		
		MemberList.put(name, new MemberInfo(age, addr, 0));
	}
	
	public static void View(HashMap<String,MemberInfo> MemberList) {
		Iterator<String> it = MemberList.keySet().iterator();
		
		while(it.hasNext()) {
			String name = (String)it.next();
			MemberInfo info = MemberList.get(name);
			System.out.println("°í°´¸í : " + name + "³ªÀÌ : " + info.age + ", Æ÷ÀÎÆ® : " + info.point + ", ÁÖ¼Ò : " + info.addr);
			
>>>>>>> parent of b5fe26a... 16.12.02 ì‹¤ìŠµ 7-6 ê¸°ëŠ¥ ìµœì¢…
		}
		
	}

}
