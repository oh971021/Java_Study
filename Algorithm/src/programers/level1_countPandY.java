package programers;

// 문자열 내 p와 y의 개수

// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
// s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
// 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
// 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

// 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

public class level1_countPandY {
    boolean solution(String s) {
        
        int pCnt = 0;
        int yCnt = 0;
        
        char[] charArr = s.toCharArray(); // 각자 비교하기 위해 char[]
        for (char c : charArr) {
            if (c == 'p' || c == 'P') { // p 혹은 P가 있으면 Cnt;
                pCnt++;
            } else if (c == 'y' || c == 'Y') { // y 혹은 Y가 있으면 Cnt;
                yCnt++;
            }
        }
        
        return pCnt == yCnt;
    }
}
