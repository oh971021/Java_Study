package com.js.book;

interface Action {
	void work();
}

public class ActionEx {
	public static void main(String[] args) {
		
		// �͸� ���� ��ü : �������̽��� ����Ŭ������ ���� �������� �ʰ�, Main Ŭ�������� ����ϰ� ������ �̷��� �ؾ��Ѵ�.
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		};
		
		action.work();
		
	}
}
