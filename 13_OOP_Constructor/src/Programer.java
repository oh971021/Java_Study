public class Programer {
	private String name;
	private int age;
	private boolean OT;

	public Programer() {}
	
	// �� ������ �ϴ� �����ε� ������ or ���͸� �����Ѵ�.
	
	// �����ε� ������
	public Programer(String name, int age, boolean OT) {
		super();
		this.name = name;
		this.age = age;
		this.OT = OT;
	}
	
	public void work() {}
	
	public void work(String str) {
		if (str.equals("��")) {
		System.out.println("�ڵ��ϱ�");
		} else if (str.equals("���")) { 
			System.out.println("�����");
		} else {
			System.out.println("�߱�..");
		}
	}
	
	/*
	######### ����� ��� ##########
	
	 public String work(String str) {
	 	if (str.equals("��")) {
	 		return "�ڵ��ϱ�";
	 	} else if {
	 	 	return "�����";
	 	}
	 	return "";
	  }
	  
	 */
	
}