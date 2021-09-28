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
		System.out.println("��ũ�� �������ϴ�");
	}
	
	@Override
	public void fire() {
		System.out.println("���� �߻�");
	}
	
	@Override
	public void shoot() {
		System.out.println("����� �߻�");
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
