package programers;

// 같은 숫자는 싫어

// 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
// 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
// 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 

// 예를 들면,
// arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
// arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
// 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

import java.util.*;

public class level1_removeTheSameNumber {
    public int[] solution(int []arr) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int x = 10; // 0 ~ 9 의 숫자가 들어오기 때문에 비교변수가 될 변수는 0 > x > 9 로 초기화한다.
        
        for (int i = 0; i < arr.length; i++) {
            if(x != arr[i]) { // 먼저 들어간 비교변수의 값과 해당 인덱스 변수와 같은 값이 아닌 경우 배열 추가
                al.add(arr[i]);    
            }
            x = arr[i]; // 먼저 들어간 비교변수 초기화
        }
        
        int[] answer = new int[al.size()]; // ArrayList to int[]
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i).intValue(); 
        }
        
        return answer;
    }
}
