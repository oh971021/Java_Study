package programers;

// 자연수 뒤집어 배열로 만들기

// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

public class level1_longToIntArray {
    public int[] solution(long n) {
        int len = (int)(Math.log10(n) + 1); // 길이 구하기
        int[] intArr = new int[len];
        
        for (int i=0; i <= len-1; i++) {
            intArr[i] = (int)(n % 10); // int에 담기지 않을 수 있으니 밖에서 int파싱
            n /= 10;
        }
     
        return intArr;
    }
}
