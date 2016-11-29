package prac4;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class TallManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Double> height = new Vector<Double>();
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("2000 ~ 2016 년까지 1년 단위로 키(cm)를 입력");
		for (int i = 2000; i<2017;i++) {
			System.out.print("(" + i + ") >> ");
			if (scanner.hasNextDouble())
				height.add(scanner.nextDouble());
			else
				if (scanner.next().equals("exit"))
					break;
		}
		scanner.close();
		
		Iterator<Double> it = height.iterator();
		
		double bigDistance = 0.0;
		int year = 0;
		double buf[] = {0.0,0.0};int i = 1;
		//for (int i = 0; i<height.size()-1; i++) {
		while(it.hasNext()) {
			if (buf[0] == 0.0)
				buf[0] = Double.parseDouble(String.format("%.1f",it.next()));
			else
				buf[0] = buf[1];
			
			buf[1] = Double.parseDouble(String.format("%.1f",it.next()));
			buf[0] = buf[1] - buf[0];
			
			bigDistance = (bigDistance<buf[0])?buf[0]:bigDistance;
			year = (bigDistance == buf[0])?i:year;
			i++;
		}
		
		System.out.println("가장 키가 많이 자란 년도는 " + (year+2000) + "년 " + 
				Double.parseDouble(String.format("%.1f",bigDistance))
				 + "cm");
	}

}
