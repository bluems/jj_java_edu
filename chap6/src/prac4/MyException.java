package prac4;

class MyException extends Exception {
	MyException(String errCode, String msg) {
		super(msg);
		
	}
	
	MyException (String msg) {
		this("ERR_00",msg);
	}
}

