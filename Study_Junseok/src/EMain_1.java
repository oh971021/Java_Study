public class EMain_1 {
	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
	}
}

class Parent {
	public String field1;
	
	public void method1() {
		System.out.println("P-method1()");
	}
	
	public void method2() {
		System.out.println("P-method2()");
	}
}

class Child extends Parent {
	public String field2;
	
	public void method3() {
		System.out.println("C-method3()");
	}
}