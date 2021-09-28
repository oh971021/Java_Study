public class SmartPhone {
	public static void main(String[] args) {
		
		// 스마트폰
			// 모델명, 컬러, 가격, 무게
			// 정보 출력 (강제)
		
		// 일반
			// 기능 : 전화, SNS, 인터넷, 게임
		
		// 아이폰6S
		Iphone i = new Iphone("아이폰6S", "스페이스그레이", 150, 600);
		i.info();
		i.call();
		i.sns();
		
		// 겔럭시20
		Galaxy g = new Galaxy("겔럭시20", "용달블루", 130, 600);
		g.info();
		g.net();
		g.game();
	}
}

abstract class Phone {
	protected String model;
	protected String color;
	protected int price;
	protected double weight;
	
	public Phone() {}
	
	public Phone(String model, String color, int price, int weight) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
		this.weight = weight;
	}

	abstract void info();
	
	void call() {	System.out.println("전화를 겁니다");	}
	void sns() {	System.out.println("SNS를 합니다");	}
	void net() {	System.out.println("인터넷에 접속합니다");	}
	void game() {	System.out.println("게임을 합니다");	}	
}

class Iphone extends Phone {

	public Iphone() {}
	
	public Iphone(String model, String color, int price, int weight) {
		super(model, color, price, weight);
	}

	@Override
	void info() {	
		System.out.printf("%s는 %s색이고, %d원 입니다. 무게는 %dg입니다.\n",	
				this.model, this.color, this.price,this.weight);
		}	
}

class Galaxy extends Phone {

	public Galaxy() {}
	
	public Galaxy(String model, String color, int price, int weight) {
		super(model, color, price, weight);
	}
	
	@Override
	void info() {	
		System.out.printf("%s는 %s색이고, %d원 입니다. 무게는 %dg입니다.\n",	
				this.model, this.color, this.price,this.weight);
		}
	
}