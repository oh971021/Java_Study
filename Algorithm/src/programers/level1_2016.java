package programers;

// 2016년

// 2016년 1월 1일은 금요일입니다. 

// 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 
// 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 

// 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다. 
// 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

public class level1_2016 {
    public String solution(int a, int b) {
        String[] answer = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;
        
        if (a != 1) {
            for (int i = 0; i < a-1; i++) {
                result += days[i];
            } // 1 ~ 입력 받은 월까지의 날짜 계산
        }
        
        result += b; // 입력 받은 월의 날짜 더해주기
        
        return answer[result % 7]; // 총 일수 / 7 의 나머지에 따라 값 셋팅
    }
}
