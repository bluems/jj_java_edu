package ex5_3;

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor");
		System.out.println();
			
	}
	
	public static void main(String[] args) {
		System.out.println("new Student() -> "); print(new Student());
		System.out.println("new Researcher() -> "); print(new Researcher());
		System.out.println("new Professor() -> "); print(new Professor());
	}

}
