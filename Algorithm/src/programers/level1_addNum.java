package programers;

// 자릿수 더하기

// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

public class level1_addNum {
    public int solution(int n) {
        int length = (int)(Math.log10(n)+1); // 길이 구하기
        int[] intArr = new int[length];
        int answer = 0;
        
        for (int i = 0; i <= length-1; i++) {
            intArr[i] = n % 10;
            n /= 10;
        } // 각각의 자릿수 뽑아내기
        
        for (int i : intArr) {
            answer += i;
        } // 합계구하기

        return answer;
    }
    
    /*
     - 참고 풀이
     
	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	
	        while(true){
	            answer+=n%10;
	            if(n<10)
	                break;
	
	            n=n/10;
	        }
	
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("Hello Java");
	
	        return answer;
	    }
	}
    */
}
