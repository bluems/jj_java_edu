package ex6_7;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query = "nam=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens();
		System.out.println("��ū ���� = " + n);
		
		while( st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
