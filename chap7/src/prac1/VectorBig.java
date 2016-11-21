package prac1;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vector<Double> v = new Vector<Double>();
		
		System.out.println("실수 입력하세요.");
		
		for(int i = 0; i <5  ; i++) {
			System.out.println("(Double) >> ");
			v.add(scanner.nextDouble());
		}
		
		//double big = v.get(0);
		
		Collections.sort(v); // Collections 안에는 정렬, 역순, 체킹 등 컬렉션 관련 여러 기능이 들어있음.
		System.out.println(v.lastElement());
		
		scanner.close();
	}

}
