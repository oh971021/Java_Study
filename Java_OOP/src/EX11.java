interface Car11 {
	void work();
}

interface Cannon {
	void fire();
}

interface MachineGun {
	void shoot();
}

class Tank implements Car11, Cannon, MachineGun {
	
	@Override
	public void work() {
		System.out.println("ÅÊÅ©°¡ ±¼·¯°©´Ï´Ù");
	}
	
	@Override
	public void fire() {
		System.out.println("´ëÆ÷ ¹ß»ç");
	}
	
	@Override
	public void shoot() {
		System.out.println("±â°üÃÑ ¹ß»ç");
	}
}

public class EX11 {
	public static void main(String[] args) {
		
		Tank tank = new Tank();
		tank.work();
		tank.fire();
		tank.shoot();
		
	}
}
