package ex13_1;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) throws IOException{
		FileReader in = new FileReader("e:\\test.txt");
		int c;
			
		while((c = in.read()) != -1) {
			System.out.print((char)c);
		}
		in.close();
	}

}
