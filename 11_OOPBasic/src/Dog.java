
// ������ ��ü�� �����.
public class Dog {
	
	// field ����
	String name;	// member ����
	int age;		 
	double weight;  
	
	// ���
	void Bark() {
		System.out.println("�۸�");
	}
	
	void PrintInfo(String name, int age, double weight) {
		System.out.println("=========�ν�ǥ=========");
		System.out.println("�̸�:"+name+"  ����:"+age+"  ü��:"+weight);
	}
	
	void Sit(String a) {
		if (a.equals("�ɾ�")) {
			System.out.println("�н�");
		} else {
			System.out.println("�տ�!");
		}
	}
	
}
