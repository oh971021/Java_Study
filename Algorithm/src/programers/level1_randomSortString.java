package programers;

// 문자열 내 맘대로 정렬하기

// 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 
// 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
// 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 
// 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

import java.util.*;

public class level1_randomSortString {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings); // 기본 정렬 (기본 배열 정렬)
        ArrayList<String> strArr = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            strArr.add(strings[i].charAt(n) + strings[i]);
        } // 원하는 인덱스의 값을 앞으로 붙혀줌
        
        Collections.sort(strArr); // 원하는 인덱스 기준 정렬 (ArrayList 정렬)
        
        String[] answer = new String[strArr.size()];
        for (int i = 0; i < strArr.size(); i++) {
            answer[i] = strArr.get(i).substring(1, strArr.get(i).length());
        } // 앞의 한자리를 제거 후 값 초기화
        
        return answer;
    }
}
