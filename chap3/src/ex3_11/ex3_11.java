package ex3_11;

public class ex3_11 {

	public static void main(String[] args) {
		int n[] = new int[10];
		
		for (int i=0; i<n.length; i++)
			n[i] = i+1;
		
		int sum=0;
		
		for (int k : n)
			sum = sum + k;
		
		System.out.println("гую╨ " + sum);
		
	}

}
