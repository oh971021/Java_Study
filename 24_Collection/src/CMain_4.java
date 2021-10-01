import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class CMain_4 {
	public static void main(String[] args) {
		
		// List 아래 Array 가 존재함.
		
		// Set 계열 : 가변사이즈, 중복데이터 처리(자동제거), 순서 랜덤배치
		// HashSet은 잘 안씀.
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(20);
		hs.add(30);

		// 사용하려면 Set -> List로 변경해서 사용
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		
		System.out.println(hs.size());
		for (Integer i : hs) {
			System.out.println(i);
		}
		
		System.out.println(al.get(0));
		
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("준석", 25, 20, 10, 80));
		students.add(new Student("솔리", 28, 40, 52, 92));
		students.add(new Student("솔리", 28, 40, 52, 92));
		// 데이터는 같지만 현재 두번째 솔리와 세번째 솔리는 다른 사람이다.
		
		System.out.println(students.size());
		
		Student s = new Student("혜수", 20, 30, 40, 50);
		students.add(s);
		students.add(s);
		students.add(s);
		// 하나의 객체 s를 여러번 넣은거라 중복데이터로 처리됨
		
		System.out.println(students.size());
		
		// 로또
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while (true) {
			lotto.add(r.nextInt(45)+1);
			
			if (lotto.size() == 6) {
				break;
			}
		}
		
		System.out.println(lotto);
		
		// 위에꺼 바꿔서 사용
		ArrayList<Integer> lotto2 = new ArrayList<Integer>(lotto);
		for (Integer i : lotto2) {
			System.out.print(i+" ");
		}
		
	}
}
