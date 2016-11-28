package ex13_1;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) throws IOException{
		FileReader in = new FileReader("e:\\test.txt");
		int readCharNo;
		char[] cbuf = new char[5];
		String data = "";
			
		while(true){
			readCharNo = in.read(cbuf, 1, 3);
			if (readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo);
		}
		
		System.out.print(data);
		in.close();
	}

}
