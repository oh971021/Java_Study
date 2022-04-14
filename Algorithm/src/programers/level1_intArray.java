package programers;

// 나누어 떨어지는 숫자 배열

// array의 각 element 중 divisor로 나누어 떨어지는 값을 
// 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

import java.util.*;

public class level1_intArray {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> al = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                al.add(arr[i]);
            }
        }
        
        if (al.size() == 0) {
            al.add(-1);
        }
        
        int[] answer = al.stream().mapToInt(i -> i).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}
