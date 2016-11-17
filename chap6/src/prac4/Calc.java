package prac4;

import java.util.StringTokenizer;

class Calc {
	private int result = 0;
	
	
	public int sum(String token) {
		StringTokenizer st = new StringTokenizer(token, "+");
		int sum = 0;
		
		int buf[] = {0,0};
		boolean b = true;
		
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			if (b == true) {
				buf[0] = OutputReverse(tmp);
				b = false;
			}
			else {
				buf[1] = OutputForward(tmp);
				sum = buf[0] + buf[1];
				buf[0] = sum;
				
			}
		}
		
		return sum;
		
		
	}
	
	public int sub(String token) {
		StringTokenizer st = new StringTokenizer(token, "-");
		int sub = 0;
		
		int buf[] = {0,0};
		boolean b = true;
		
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			if (b == true) {
				buf[0] = OutputReverse(tmp);
				b = false;
			}
			else {
				buf[1] = OutputForward(tmp);
				sub = buf[0] - buf[1];
				buf[0] = sub;
				
			}
		}
		
		return sub;
	}
	
	public int getResult() {
		return result;
	}
	
	private int OutputReverse(String token) {
		int stack = 0;
		int buf = 0;
		
		for(int i = 0; i<token.length();i++) {
			buf = token.charAt(token.length()-1);

			if (57>buf && buf>48) {
				stack = (buf-48) * (int)Math.pow(10, i);
			} else break;
		}
		return stack;
	}
	
	private int OutputReverse(int token) { 
		return OutputReverse(Integer.toString(token));
	}
	
	private int OutputForward(String token) {
		int stack = 0;
		StringTokenizer st = new StringTokenizer(token, "+-*/"); //다른 아무 연산자 추출 
		
		if (st.hasMoreTokens()) { //첫번째 토큰만 추출
			
			String buf = st.nextToken();
			stack = Integer.parseInt(buf); //첫번째 숫자 정수 반환
		} else {
			stack = Integer.parseInt(token);
		}
		
		System.out.println("stack : " + stack);
		return stack;
	}
	
	private int OutputForward(int token) {
		return OutputForward(Integer.toString(token));
	}
}
