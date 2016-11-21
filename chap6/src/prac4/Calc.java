package prac4;

import java.util.StringTokenizer;

class Calc {
	private String result = "";
	
	public String getResult() {
		return this.result;
	}
	
	public void calculator(String str) {
		result = sum(sub(div(mul(str))));
	}
	private String mul(String token) {
		System.out.println("mul 넘어온 토큰 : " + token);
		if ( token.indexOf('*') == -1)
			return token;
		
		StringTokenizer st = new StringTokenizer(token, "*");
		
		String mul = "";
		String tmp[] = new String[2];
		tmp[1] = "";
		
		
		String buf[] = new String[2];
		boolean b = true;
		
		while(st.hasMoreTokens()) {
			
			tmp[0]= st.nextToken();
			
			if (b == true) {
				buf[0] = Integer.toString(OutputReverse(tmp[0]));
				b = false;
			}
			else {
					tmp[1] = tmp[0];
					System.out.println("tmp[1] : " + tmp[1]);
					buf[1] = Integer.toString(OutputForward(tmp[0]));

					mul = Integer.toString(Integer.parseInt(buf[0]) * Integer.parseInt( buf[1]));
					
					if( st.countTokens() == 0 /*(tmp[1].indexOf("+") == -1) && (tmp[1].indexOf("-") == -1) && (tmp[1].indexOf("/") == -1)*/ ) {
						mul = LastComp(tmp[1],mul,'*');
						System.out.println("돌긴도냐");
					}
					else {
						tmp[1] = FirstComp(tmp[0],mul,'*');
						buf[0] = Integer.toString(OutputReverse(tmp[1]));
					}
				
			}
		}
		System.out.println(mul);
		return mul;
	}
	
	private String div(String token) {
		//System.out.println("div 넘어온 토큰 : " +token);
		if (token.indexOf('/') == -1)
			return token;
		
		StringTokenizer st = new StringTokenizer(token, "/");
		
		String div = "";
		String tmp[] = new String[2];
		
		
		String buf[] = new String[2];
		boolean b = true;
		System.out.println("1");
		while(st.hasMoreTokens()) {
			
			tmp[0]= st.nextToken();
			
			if (b == true) {
				buf[0] = Integer.toString(OutputReverse(tmp[0]));
				b = false;
			}
			else {
					tmp[1]=tmp[0];
					buf[1] = Integer.toString(OutputForward(tmp[0]));

					div = Integer.toString(Integer.parseInt(buf[0]) / Integer.parseInt( buf[1]));
					
					if((tmp[0].indexOf("+") == -1) && (tmp[0].indexOf("-") == -1) && (tmp[0].indexOf("*") == -1) ) {
						System.out.println("top tmp[1] : " + tmp[1]);
						div = LastComp(tmp[1],div,'/');
					}
					else {
						tmp[1] = FirstComp(tmp[0],div,'/');
						buf[0] = Integer.toString(OutputReverse(tmp[1]));
						System.out.println("div : " + div + ", tmp[1] : " + tmp[1] + ", buf[0] : " + buf[0] + ", countToken : " + st.countTokens() );
					}
				
			}
		}
		
		return div;
	}
	
	private String FirstComp(String str, String first, char comp) {
		StringBuffer sb = new StringBuffer(str);
		
		if (comp == '*') {
			sb.replace(0, FirstCompMulti(str) , first);
			str = sb.toString();
		}
			
		else if (comp == '/') {
			sb.replace(0, FirstCompDiv(str) , first);
			str = sb.toString();
		}
		else return ErrCode.ERR_02.getErrMsg();
		
		
		return str;
	}
	
	private int FirstCompMulti(String str) {
		int arg[] = {0,0,0};
		int rep = 0;
		arg[0] = str.indexOf("+");
		
		if (arg[0] == -1)
			arg[0] = 99;
		
		arg[1] = str.indexOf("-");
		
		if (arg[1] == -1)
			arg[1] = 99;
		
		arg[2] = str.indexOf("/");
		
		if ( arg[2] == -1)
			arg[2] = 99;
		
		
		
		if ( arg[0] < arg[1])
			if (arg[0] < arg[2])
				rep = arg[0];
			else
				rep = arg[2];
		else
			if(arg[1] < arg[2])
				rep = arg[1];
			else
				rep = arg[2];
		
		return rep;
	}
	
	private int FirstCompDiv(String str) {
		int arg[] = {0,0,0};
		int rep = 0;
		arg[0] = str.indexOf("+");
		
		if (arg[0] == -1)
			arg[0] = 99;
		
		arg[1] = str.indexOf("-");
		
		if (arg[1] == -1)
			arg[1] = 99;
		
		arg[2] = str.indexOf("*");
		
		if ( arg[2] == -1)
			arg[2] = 99;
		
		
		
		if ( arg[0] < arg[1])
			if (arg[0] < arg[2])
				rep = arg[0];
			else
				rep = arg[2];
		else
			if(arg[1] < arg[2])
				rep = arg[1];
			else
				rep = arg[2];
		
		return rep;
	}
	
	private String LastComp(String str, String last,char comp) {
		StringBuffer sb = new StringBuffer(str);
		
		if (comp == '*') {
			sb.replace(LastCompMulti(str), str.length() , last);
			str = sb.toString();
		}
			
		else if (comp == '/') {
			sb.replace(LastCompDiv(str), str.length() , last);
			str = sb.toString();
		}
		else return ErrCode.ERR_02.getErrMsg();
		
		System.out.println("LastComp : " + str);
		
		return str;
	}
	
	private int LastCompMulti(String str) {
		int arg[] = {0,0,0};
		int rep = 0;
		
		System.out.println("LastCOmpmulti : "+str);
		arg[0] = str.indexOf("+");
		
		arg[1] =str.indexOf("-");
		
		arg[2] = str.indexOf("/");
		
		
		
		if ( arg[0] > arg[1])
			if (arg[0] > arg[2])
				rep = arg[0];
			else
				rep = arg[2];
		else
			if(arg[1] > arg[2])
				rep = arg[1];
			else
				rep = arg[2];
		
		return ++rep;
	}
	
	private int LastCompDiv(String str) {
		int arg[] = {0,0,0};
		int rep = 0;
		arg[0] = str.indexOf("+");
		
		arg[1] =str.indexOf("-");
		
		arg[2] = str.indexOf("*");
		
		
		
		if ( arg[0] > arg[1])
			if (arg[0] > arg[2])
				rep = arg[0];
			else
				rep = arg[2];
		else
			if(arg[1] > arg[2])
				rep = arg[1];
			else
				rep = arg[2];
		return ++rep;
	}
	
	
	
	private String sum(String token) {
		System.out.println("sum 넘어온 토큰 : " + token);
		if ( token.indexOf('+') == -1 )
			return token;
		
		StringTokenizer st = new StringTokenizer(token, "+");
		String sum = "";
		
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
				buf[0] = buf[0] + buf[1];
				sum = Integer.toString(buf[0]);
			}
		}
		
		return sum;
		
		
	}
	
	private String sub(String token) {
		System.out.println("sub 넘어온 토큰 : " + token);
		if ( token.indexOf('-') == -1 )
			return token;
		
		StringTokenizer st = new StringTokenizer(token, "-");
		String sub = "";
		
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
				buf[0] = buf[0] - buf[1];
				sub = Integer.toString(buf[0]);
			}
		}
		
		return sub;
	}
	
	
	
	private int OutputReverse(String token) {
		int stack = 0;
		int buf = 0;
		
		for(int i = 0; i<token.length();i++) {
			buf = token.charAt(token.length()-1-i);
			//System.out.println("buf : " + buf);
			if (58>buf && buf>47) {
				stack = stack + (buf-48) * (int)Math.pow(10, i);
			} else break;
		}
		
		//System.out.println("stack : " + stack);
		return stack;
	}
	
	/*private int OutputReverse(int token) { 
		return OutputReverse(Integer.toString(token));
	}*/
	
	private int OutputForward(String token) {
		int stack = 0;
		StringTokenizer st = new StringTokenizer(token, "+-*/"); //다른 아무 연산자 추출 
		
		if (st.hasMoreTokens()) { //첫번째 토큰만 추출
			
			String buf = st.nextToken();
			stack = Integer.parseInt(buf); //첫번째 숫자 정수 반환
		} else {
			stack = Integer.parseInt(token);
		}
		
		//System.out.println("stack : " + stack);
		return stack;
	}
	
	/*private int OutputForward(int token) {
		return OutputForward(Integer.toString(token));
	}*/
}
