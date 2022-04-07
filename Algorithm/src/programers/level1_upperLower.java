package programers;

// 이상한 문자 만들기

// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
// 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
// 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

public class level1_upperLower {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ", -1); // 공백으로 나누는데, 문자열 사이를 제외하곤 공백 포함함
        
        for (String str : strArr) {
            char[] charArr = str.toCharArray(); // String to char[]
            
            for (int i = 0; i < str.length(); i++) {
                charArr[i] = Character.toLowerCase(charArr[i]); // 전부 소문자로 변경
                if (i % 2 == 0) {
                    charArr[i] = Character.toUpperCase(charArr[i]); // 짝수번째는 대문자로 변경
                }  
                answer += charArr[i]; // 변경된 char[] 변수에 담기   
            }
            answer += " "; // 새로운 char[] 작업마다 " " 넣어줌
        }
        return answer.substring(0, answer.length()-1); // 문자열 마지막 공백 제거
    }
}
