
public class Programer {
	
	private String name;
	private int age;
	private boolean overtime;
	
	public Programer() {
		
	}
	//���� ��� ���� ?
	//1.setter
	//2.�����ε� ������
	public Programer(String name, int age, Boolean overtime) {
		super();
		this.name = name;
		this.age = age;
		this.overtime = overtime;
	}
	
	public void Work(){
		
	}
	
	public void Work(String work){
		if(work.equals("��")) {
			System.out.println(name + "�� �ڵ��ϱ�");
		}else if(work.equals("���")) {
			System.out.println("�����");
		}else {
			System.out.println("���ϳ�");
		}
		
	}
	
//	 public String work(String str) {
//		if(str.equals("��")) {
//			return "�ڵ��ϱ�";
//		}else if (str.equals("���")) {
//			return "�����";
//		}
//		return"";
//	}
	

	
	
	
	
	
	
	
	
}
