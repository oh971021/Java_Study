package com.js.sortex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {

		// �ؽü�? ���� ���Ǹ����
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		while (true) {

			HashSet<Integer> lotto = new HashSet<Integer>();

			while (true) {
				// ���� ���� 1 ~ 45 �� �ֱ�.
				lotto.add(r.nextInt(45)+1);

				// 6���� ������ Ż�� ��Ű��.
				if (lotto.size() == 6) {
					break;
				}

			}

			// ���� ��� ( ������� ������ )
			// System.out.println(lotto);

			Comparator<Integer> lottoSort = new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2);
				}
			};

			ArrayList<Integer> lottoS = new ArrayList<Integer>(lotto);
			lottoS.sort(lottoSort);

			// System.out.println(lottoS);

			int birth;

			System.out.print("�¾ ���� �����ּ��� : ");
			birth = s.nextInt();

			if (birth > 12 || birth < 1) {
				System.out.println("�ٽ� �Է� ���ּ���.");
				continue;
			}
			
			// �ؽø����� ���ǿ� �´� ������ϱ� ( � 1~12�� (��¥�� ���� �� �̱�) �������� �غ��ô�. )
			HashMap<Integer, ArrayList<Integer>> lottos = new HashMap<Integer, ArrayList<Integer>> (); {
				for (int i = 1; i <= 12; i++) {
					lottos.put(i, lottoS);
				}
				
				System.out.println(birth + "���� ����� ��ȣ : " + lottos.get(birth));
				break;
			}
		}
		
	}
}
