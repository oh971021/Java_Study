package programers;

// 제일 작은 수 제거하기

// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
// 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

import java.util.*;

public class level1_removeSmallestNumber {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        int min = 0;
        
        if (len != 0) {
            min = arr[0];
        }
        
        for (int i=1; i<len; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        } // 최소값 찾기

        List<Integer> al = new ArrayList<>(len);
        
        for (int i : arr) {
            al.add(i);
        } // int[] to ArrayList
        
        while(al.remove(Integer.valueOf(min))) { } // 최소값 제거하기
        
        if (al.size() < 1) {
            al.add(-1);
        } // 빈 배열에는 -1 대입시키기
        
        int[] answer = new int[al.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i).intValue();
        } // ArrayList to int[]
        
        return answer;
    }
}
