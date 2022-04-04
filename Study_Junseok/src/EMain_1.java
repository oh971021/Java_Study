public class EMain_1 {
	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
		// ��ü�� Ÿ�� �����ϴ� ������
		boolean result = child instanceof Parent;
		System.out.println(result);
		
		
		for (String string : args) {
			
		}
		
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
	
	public void method3() {
		System.out.println("P-method3()");
	}
	
}

class Child extends Parent {
	public String field2;
	
	@Override
	public void method3() {
		System.out.println("C-method3()");
	}
}