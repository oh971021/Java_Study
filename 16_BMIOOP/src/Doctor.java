public class Doctor {
	
	// 메인이 아닌 클래스에서 다른 클래스를 접근해서 사용하고 싶을 때,
	// 매개변수로 그 클래스를 받아주고 사용한다.
	
	public void act1(Guest g) {
		// 손님에게 정보를 물어보기 ( 검사를 위해서 )	
		g.act2();
		
		// 정보에 따라 BMI 수치 계산
		act3(g);
		
		// 계산 된 BMI 수치에 따라 판단해주는 것
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
			String Result = "비만";
			
			if(g.bmi < 20) {
				Result = "저체중";
			}else if(g.bmi < 25)   {
				Result = "정상";
			}else if(g.bmi < 30)  {
				Result = "과체중";
			}

			System.out.print("결과를 출력합니다");
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
			System.out.printf("BMI 수치 : %.2f\n", g.bmi);
			System.out.printf("%s님, 당신은 %s입니다\n", g.name, Result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
