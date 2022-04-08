package programers;

// 시저암호

// 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
// 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

public class level1_caesarCipher {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        String answer = "";
        
        for (char c : charArr) {  // 하나씩 돌려보기
            for (int i = 1; i <= n; i++) { // 1씩 증가시키면서 변경
                if (c != ' ') { // 공백은 공백인 상태로
                    if (c == 'z' || c == 'Z') { 
                        c = (char)((int)c - 26);   
                    } // z or Z는 알파벳 시작으로 돌아간다.
                    c = (char)((int)c+1); // 1씩 증가
                }
            }
            answer += c; // 완성된 c 는 answer 변수에 대입
        }
        return answer;
    }
}