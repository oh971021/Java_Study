
public class SPMain_1 {
	public static void main(String[] args) {
		
		// �ڱ��ڽ� : �̸�, ����
		Me.getMe().info();
		Me me = Me.getMe();
		me.info();
		System.out.println(me);
		
		Me me2 = Me.getMe();
		me.info();
		System.out.println(me2);
		
		System.out.println("=============");
		
		// ���̾�� : �̸�, ���� -> �������
		IronMan tony = IronMan.getTony();
		tony.info();
		
	}
}
