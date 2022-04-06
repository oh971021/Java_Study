package programers;

// 배열 평균 구하기

public class level1_average {
    public double solution(int[] arr) {

        double result = 0;
        
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        
        result = result / arr.length;
        
        return result;
    }
}
