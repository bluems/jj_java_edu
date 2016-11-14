package StringBufferEx;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("I");
		
		sb.append(" have a pen.");
		System.out.println(sb);
		
		//sb.insert(7,  " my");
		//System.out.println(sb);
		
		sb.replace(8, 13, "n apple.");
		System.out.println(sb);
		
		System.out.println("Uah~" );
		
		sb.setCharAt(12, 'P');
		System.out.println(sb);
		
		sb.delete(3, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
