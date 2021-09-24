
public class Programer {
	
	private String name;
	private int age;
	private boolean overtime;
	
	public Programer() {
		
	}
	//값을 어떻게 세팅 ?
	//1.setter
	//2.오버로딩 생성자
	public Programer(String name, int age, Boolean overtime) {
		super();
		this.name = name;
		this.age = age;
		this.overtime = overtime;
	}
	
	public void Work(){
		
	}
	
	public void Work(String work){
		if(work.equals("일")) {
			System.out.println(name + "는 코딩하기");
		}else if(work.equals("퇴근")) {
			System.out.println("감사요");
		}else {
			System.out.println("뭐하냐");
		}
		
	}
	
//	 public String work(String str) {
//		if(str.equals("일")) {
//			return "코딩하기";
//		}else if (str.equals("퇴근")) {
//			return "감사요";
//		}
//		return"";
//	}
	

	
	
	
	
	
	
	
	
}
