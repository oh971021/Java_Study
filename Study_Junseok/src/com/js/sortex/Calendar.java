package com.js.sortex;

import java.util.ArrayList;
import java.util.HashMap;

public class Calendar {
	public static void main(String[] args) {
		
		// 월-금 요일에 따라 스케줄이 나오게 하기

		HashMap<String, ArrayList<String>> cal = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> Mon = new ArrayList<String>();
		Mon.add("일어나기");
		Mon.add("샤워하기");
		Mon.add("잠자기");
		
		ArrayList<String> tue = new ArrayList<String>();
		tue.add("일어나기");
		tue.add("밥먹기");
		tue.add("잠자기");
		
		ArrayList<String> wed = new ArrayList<String>();
		wed.add("일어나기");
		wed.add("게임하기");
		wed.add("잠자기");
		
		ArrayList<String> thu = new ArrayList<String>();
		thu.add("일어나기");
		thu.add("공부하기");
		thu.add("잠자기");
		
		ArrayList<String> fri = new ArrayList<String>();
		fri.add("일어나기");
		fri.add("유튜브보기");
		fri.add("잠자기");
		
		cal.put("월", Mon);
		cal.put("화", tue);
		cal.put("수", wed);
		cal.put("목", thu);
		cal.put("금", fri);
		
		System.out.println(cal.get("화"));
		
	}
}

