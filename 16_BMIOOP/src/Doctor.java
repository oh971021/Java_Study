public class Doctor {
	
	// ������ �ƴ� Ŭ�������� �ٸ� Ŭ������ �����ؼ� ����ϰ� ���� ��,
	// �Ű������� �� Ŭ������ �޾��ְ� ����Ѵ�.
	
	public void act1(Guest g) {
		// �մԿ��� ������ ����� ( �˻縦 ���ؼ� )	
		g.act2();
		
		// ������ ���� BMI ��ġ ���
		act3(g);
		
		// ��� �� BMI ��ġ�� ���� �Ǵ����ִ� ��
		act4(g);
	}
	
	public void act3(Guest g) {
		// bmi = weight / (height * height)
		
		if(g.height > 3) {
			g.height /= 100;
		}
		
		g.bmi = g.weight / (g.height * g.height);
	}
	
	public void act4(Guest g) {
	
		try {
			String Result = "��";
			
			if(g.bmi < 20) {
				Result = "��ü��";
			}else if(g.bmi < 25)   {
				Result = "����";
			}else if(g.bmi < 30)  {
				Result = "��ü��";
			}

			System.out.print("����� ����մϴ�");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".\n");
			System.out.printf("BMI ��ġ : %.2f\n", g.bmi);
			System.out.printf("%s��, ����� %s�Դϴ�\n", g.name, Result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
