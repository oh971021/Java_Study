public class Teacher extends Person {
	private String subject;

	public Teacher() {}
	
	public Teacher(String subject) {
		super();
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void info() {
		super.info();
		System.out.println("��� ������ "+subject+"�� ����ϰ� �ֽ��ϴ�.");
	}
}