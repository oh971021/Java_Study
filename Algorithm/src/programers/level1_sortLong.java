package programers;

// 정수 내림차순으로 배치하기
// 함수 solution은 정수 n을 매개변수로 입력받습니다. 
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
// 예를들어 n이 118372면 873211을 리턴하면 됩니다.

import java.util.*;

public class level1_sortLong {
    public long solution(long n) { 
        String str = Long.toString(n);   
        String[] strArray = new String[str.length()];
        // 원소 배치를 위해 배열객체 생성
        
        for (int i = 0; i < str.length(); i++) {
            strArray[i] = String.valueOf(str.charAt(i));
        } // 배열에 각 원소 대입
        str = ""; // 값이 들어갈 변수 비워주기
        Arrays.sort(strArray, Collections.reverseOrder());
        // 문자열 내림차순
        for (String s : strArray) {
            str += s; // 내림차순 된 각 원소들 str 변수에 대입
        }
        
        return Long.parseLong(str); // 리턴 값에 맞게 String to Long 파싱
    }
}
