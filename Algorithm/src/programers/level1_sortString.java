package programers;

// 문자열 내림차순으로 배치하기

// 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
// s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

public class level1_sortString {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i+1; j < charArr.length; j++) {
                while (charArr[i] < charArr[j]) {
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
            answer += charArr[i];
        }

        return answer;
    }
}
