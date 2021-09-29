package com.js.drive;

public class DMain {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		
		driver.drive(vehicle);
		
		System.out.println("===============");
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		System.out.println("===============");
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		System.out.println("===============");
		
		Circle circle = new Circle();
		driver.drive(circle);
		
		System.out.println("===============");
	}
}
