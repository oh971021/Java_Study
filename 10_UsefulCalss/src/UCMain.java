import java.util.StringTokenizer;

public class UCMain {
	public static void main(String[] args) {
		
		String s = "안녕";
		String ss = new String("와우 곧 점심");
		//new 실제 매모리에 공간을 차지하게 해주는 것
		//new는 참조형으로 힙에 생긴다 스택에 주소가 생겨서 찾아감
		

		//이꼴은 주소값을 비교하는게 아니고 스트링자체를 비교
		System.out.println(s.equals(ss));

		// ss의 세번째 글차 출력
		System.out.println(ss.charAt(2));
		
		// ss의 전체 글자 수 출력
		System.out.println(ss.length());
		
		System.out.println("------------------");

	   // ss에서 '곧' 이라는 글자가 몇 번째에 있는가
        System.out.println(ss.indexOf("곧"));
     // ss가 '와' 로 시작하는가?
        System.out.println(ss.startsWith("와"));
     // ss가 '음' 으로 끝나는가?
        System.out.println(ss.endsWith("음"));
     // ss가 '심' 으로 끝나는가?
        System.out.println(ss.endsWith("심"));
        
     // ss에 '곧'을 '이제'로 바꾸기
       String c = ss.replace("곧", "이제");
    		   System.out.println(c);
     // ss에 2~4번째 글자 까지 출력 (우 이)
        System.out.println(c.substring(1,4));
        
        System.out.println("---------------------------");
        
        String sss = "사과,딸기,바나나";
        
        //문자열 분리 
        String[] sss2 = sss.split(",");
        for (String sss3 : sss2) {
			System.out.println(sss3);
		}
        		
        System.out.println("---------------------------");
        
        StringTokenizer st = new StringTokenizer(sss,",");
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        
        System.out.println("---------------------------");
        
        StringTokenizer st2 = new StringTokenizer(sss,",");
        
        while(st2.hasMoreTokens()) {
        	System.out.println(st2.nextToken());
        }
        
        System.out.println("---------------------------");
        //안좋은방법. 계속 heap영역에 새로운 string값 생성
        String s1 = "곧";
         s1+="끝";
         s1+="나";
         s1+="네";
         s1+="요";
         System.out.println(s1);
         //좋은방법. 수정 가능한 문자열 객채
         StringBuffer sb = new StringBuffer();
          String s2 = "곧";
          sb.append(s2);
          sb.append("끝");
          sb.append("나");
          sb.append("네");
          sb.append("요");
         System.out.println(sb);
         
         String s3 = sb.toString();
         System.out.println(sb.charAt(1));
         System.out.println(s3);
        
        
	}
}
