package prac1;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Vector<Double> v = new Vector<Double>();
		
		System.out.println("�Ǽ� �Է��ϼ���.");
		
		for(int i = 0; i <5  ; i++) {
			System.out.println("(Double) >> ");
			v.add(scanner.nextDouble());
		}
		
		//double big = v.get(0);
		
		Collections.sort(v); // Collections �ȿ��� ����, ����, üŷ �� �÷��� ���� ���� ����� �������.
		System.out.println(v.lastElement());
		
		scanner.close();
	}

}
