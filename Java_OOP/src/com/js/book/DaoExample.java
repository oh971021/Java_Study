package com.js.book;

interface DataAccessObject {
	
	// ������ : �ϳ��� Ʋ�� ����� ����, �پ��� ��ῡ ���� �پ��� ����� ������ ����
	// �������̽��� �� Ʋ�� ������ �Ѵ�. (��� ����)
	
	public void select(); // �˻�
	public void insert(); // ����
	public void update(); // ����
	public void delete();  // ����
	
}

class Oracle implements DataAccessObject {
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB���� �˻�");
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB���� ����");
	}
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB���� ����");
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB���� ����");
	}
}

class MySql implements DataAccessObject {
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB���� �˻�");
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB���� ����");
	}
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB���� ����");
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySql DB���� ����");
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
		
		// �������̽��� ���� ��ü�� �Ű������� �޴� �޼ҵ带 �̿���.
		// �Ű������� �� ���� ��ü�� new �����ڷ� �޼ҵ��� ���ھȿ� �־��ش�.
		dbWork(new Oracle());
		dbWork(new MySql());
	}
}