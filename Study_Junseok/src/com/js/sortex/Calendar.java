package com.js.sortex;

import java.util.ArrayList;
import java.util.HashMap;

public class Calendar {
	public static void main(String[] args) {
		
		// ��-�� ���Ͽ� ���� �������� ������ �ϱ�

		HashMap<String, ArrayList<String>> cal = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> Mon = new ArrayList<String>();
		Mon.add("�Ͼ��");
		Mon.add("�����ϱ�");
		Mon.add("���ڱ�");
		
		ArrayList<String> tue = new ArrayList<String>();
		tue.add("�Ͼ��");
		tue.add("��Ա�");
		tue.add("���ڱ�");
		
		ArrayList<String> wed = new ArrayList<String>();
		wed.add("�Ͼ��");
		wed.add("�����ϱ�");
		wed.add("���ڱ�");
		
		ArrayList<String> thu = new ArrayList<String>();
		thu.add("�Ͼ��");
		thu.add("�����ϱ�");
		thu.add("���ڱ�");
		
		ArrayList<String> fri = new ArrayList<String>();
		fri.add("�Ͼ��");
		fri.add("��Ʃ�꺸��");
		fri.add("���ڱ�");
		
		cal.put("��", Mon);
		cal.put("ȭ", tue);
		cal.put("��", wed);
		cal.put("��", thu);
		cal.put("��", fri);
		
		System.out.println(cal.get("ȭ"));
		
	}
}

