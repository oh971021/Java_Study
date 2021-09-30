package com.js.book;

interface DataAccessObject {
	
	// 다형성 : 하나의 틀을 만들어 놓고, 다양한 재료에 따라 다양한 결과가 나오는 성질
	// 인터페이스가 그 틀의 역할을 한다. (재료 제공)
	
	public void select(); // 검색
	public void insert(); // 삽입
	public void update(); // 수정
	public void delete();  // 삭제
	
}

class Oracle implements DataAccessObject {
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 검색");
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삽입");
	}
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 수정");
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삭제");
	}
}

class MySql implements DataAccessObject {
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB에서 검색");
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB에서 삽입");
	}
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB에서 수정");
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB에서 삭제");
	}
}

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		
		// 인터페이스의 구현 객체를 매개변수로 받는 메소드를 이용함.
		// 매개변수가 될 구현 객체를 new 연산자로 메소드의 인자안에 넣어준다.
		dbWork(new Oracle());
		dbWork(new MySql());
	}
}