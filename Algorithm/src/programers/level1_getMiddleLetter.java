package programers;

// 가운데 글자 가져오기

// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
// 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

public class level1_getMiddleLetter {
    public String solution(String s) {
        int len = s.length(); // 비교를 위한 스트링 길이 뽑기
        
        return len % 2 == 0 ? s.substring((len/2)-1, (len/2)+1) : s.substring((len/2+1)-1, (len/2+1));
    }
}
