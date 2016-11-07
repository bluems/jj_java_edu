package prac5;
interface StackInterface {
	int length();
	String pop();
	boolean push(String ob);
}
class StringStack implements StackInterface {
	private String[] Stack = new String[5];
	private int s = 0;
	public int length() {
		return Stack.length;
	}
	
	public String pop() {
		int sn = s;
		s--;
		return Stack[sn];
	}
	
	public boolean push(String ob) {
		try {
			
		}
		Stack[s] = ob;
		s++;
		return true;
	}
}
