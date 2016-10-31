package downcasting;

class Parent {
	public String field1;
	
	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent {
	public String field2;
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}

public class Downcasting {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		

	}

}
