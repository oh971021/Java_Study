package programers;

// 하샤드 수 찾기

import java.util.Arrays;

public class level1_harshadNumber {
    public boolean solution(int x) {
        
        String str = Integer.toString(x); // String 변환
        char[] ca = str.toCharArray(); // char[] 변환 (원소 각각 사용)
        int[] ia = new int[ca.length];
        
        for (int i = 0; i < ia.length; i++) {
            ia[i] = (ca[i] - '0');
            System.out.println(ia[i]);
        } // int[] 에 char[] 담기
        
        int result = 0;
        
        for (int i =0; i < ia.length; i++) {
            result = Arrays.stream(ia).sum();
        } // 하샤드 수 계산 값
        
        boolean answer = false;
        
        if (x % result == 0) {
            answer = true;
        } // 나눠지면 answer == true 로 변경
        
        return answer;
    }
}
