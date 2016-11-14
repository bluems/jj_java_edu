package prac5;

interface StackInterface {
	int length();
	String pop();
	boolean push(String ob);
}

class StringStack implements StackInterface {
	private String[] Stack = new String[5];
	private int index = 0;
	
	public int length() {
		return Stack.length;
	}
	
	public String pop() {
		return Stack[--index];
	}
	
	public boolean push(String ob) {
		if (index>=length()) {
			return false;
		}
		
		Stack[index] = ob;	

		index++;
		return true;
	}
}
