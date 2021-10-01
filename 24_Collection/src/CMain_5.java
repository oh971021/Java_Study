import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CMain_5 {
	public static void main(String[] args) {
		
		// Map 계열 : 가변사이즈, 순서 시스템 X, key-value 쌍의 형태로 이루어짐
		
		// <> 안에는 데이터 타입을 넣는다.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		// HashMap 은 Set, Add 대신 Put을 사용한다.
		hm.put("탄수화물", 50);
		hm.put("단백질", 500);
		hm.put("지방", 5000);
		
		System.out.println(hm.get("단백질"));
		
		System.out.println("===========");
		
		// 찾을 학생 이름을 쓰면 내용을 볼 수 있도록 한다.
		
		// 학생을 이름으로 접근해서 찾겠다면 HashMap가 적절
		// HashMap : Key값으로 인덱스를 대신함.
		
		// 학생을 번호로 접근해서 찾겠다면 Array가 적절
		// Array : Index가 정해져 있어서 번호로 접근.
		
		// 주로 Array를 사용하지만 특수한 목적에 HashMap을 사용함.
		// ArrayList 는 무조건 암기스 하자!!
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		
		students.put("준석", new Student("준석", 20, 10, 20, 30));
		students.put("지호", new Student("지호", 30, 30, 30, 30));
		
		// 이름을 Key로 지정해서 검색할 수 있음.
		System.out.println(students.get("준석").getAge()); 
		
		// 누구 찍는건 좋은데 누가 있는지를 알고싶다.
		Set<String> sName = students.keySet();
		ArrayList<String> sName_ = new ArrayList<String>(sName);
		
		for (String s : sName_) {
			System.out.println(s);
		}
		
		Scanner k = new Scanner(System.in);
		System.out.print("누구 : ");
		String name = k.next();
		
		System.out.println(students.get(name)); // 입력한 사람 (객체주소)
		students.get(name).info();
		
	}
}
