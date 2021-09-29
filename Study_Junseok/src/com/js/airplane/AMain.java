package com.js.airplane;

public class AMain {
	public static void main(String[] args) {
		supersonicAirplane sa = new supersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		sa.flyMode = supersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = supersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}
}