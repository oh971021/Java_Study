package com.js.book;

interface Action {
	void work();
}

public class ActionEx {
	public static void main(String[] args) {
		
		// 익명 구현 객체 : 인터페이스를 구현클래스를 통해 구현하지 않고, Main 클래스에서 사용하고 싶으면 이렇게 해야한다.
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();
		
	}
}
