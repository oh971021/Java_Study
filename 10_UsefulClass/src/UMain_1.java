import java.util.Scanner;
import java.util.StringTokenizer;

public class UMain_1 {
	public static void main(String[] args) {
		
		String s = "안녕";
		String ss = new String("와우 곧 점심");
		
		//ss의 두번 째 글자를 출력 : 인덱스에 따른 출력 (charat)
		System.out.println(ss.charAt(0));
		
		//ss의 세번 째 글자를 출력
		System.out.println(ss.charAt(2));

		//ss의 전체 글자 수를 출력
		System.out.println(ss.length());
		
		System.out.println("=============");
		
		// ss에서 '곧' 이라는 글자가 몇 번째에 있는가
			System.out.println(ss.indexOf("곧"));
		// ss가 '와' 로 시작하는가?
			System.out.println(ss.startsWith("와"));
		// ss가 '음' 으로 끝나는가?
			System.out.println(ss.endsWith("음"));
		// ss가 '심' 으로 끝나는가?
			System.out.println(ss.endsWith("심"));
			
		// ss에 '곧' 을 '이제' 로 바꿔보기
			String string = ss.replace("곧", "이제");
				System.out.println(string);
		// ss에 2~4번째 글짜 출력
			System.out.println(string.substring(1, 4));
			
		System.out.println("============");
		
		String sss = "사과,딸기,바나나";
		
		// 문자열 분리
		
		// 1. 배열로 구분하기
		String[] sss2 = sss.split(",");
		
		for (String sss3 : sss2) {
			System.out.println(sss3);
		}
		
		System.out.println("============");
		
		// 2. 새로운 객체로 분리하기 (knife)
		StringTokenizer st = new StringTokenizer(sss, ",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		System.out.println("============");	
		
		StringTokenizer st2 = new StringTokenizer(sss, ",");
		
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("============");	
		
		// 문자열 붙히기
		String st1 = "곧";
		st1 += "끝";
		st1 += "나";
		st1 += "네";
		st1 += "요";
		System.out.println(st1);
		
		System.out.println("===buffer===");	
		
		StringBuffer sb = new StringBuffer();
		
		String s2 = "곧";
		sb.append(s2);
		sb.append("끝");
		sb.append("나");
		sb.append("네");
		sb.append("요");
		System.out.println(sb);
		
		System.out.println("============");	
		
		System.out.println(sb.charAt(1));
	
		// String st3 = sb; >> stringbuffer 는 string 에 담을 수 없다.
		// 그래서 toString으로 타입을 바꿔줘야한다.
		String st3 = sb.toString();
		System.out.println(st3);
		
		
	}
}
