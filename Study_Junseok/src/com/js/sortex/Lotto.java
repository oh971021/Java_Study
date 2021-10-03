package com.js.sortex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {

		// 해시셋? 으로 복권만들기
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		while (true) {

			HashSet<Integer> lotto = new HashSet<Integer>();

			while (true) {
				// 랜덤 숫자 1 ~ 45 를 넣기.
				lotto.add(r.nextInt(45)+1);

				// 6개를 뽑으면 탈출 시키자.
				if (lotto.size() == 6) {
					break;
				}

			}

			// 복권 출력 ( 순서대로 만들어보자 )
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

			System.out.print("태어난 월을 적어주세요 : ");
			birth = s.nextInt();

			if (birth > 12 || birth < 1) {
				System.out.println("다시 입력 해주세요.");
				continue;
			}
			
			// 해시맵으로 조건에 맞는 값출력하기 ( 운세 1~12월 (날짜에 따른 값 뽑기) 복권으로 해봅시다. )
			HashMap<Integer, ArrayList<Integer>> lottos = new HashMap<Integer, ArrayList<Integer>> (); {
				for (int i = 1; i <= 12; i++) {
					lottos.put(i, lottoS);
				}
				
				System.out.println(birth + "월의 행운의 번호 : " + lottos.get(birth));
				break;
			}
		}
		
	}
}
