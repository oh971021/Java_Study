package programers;

// 두 개 뽑아서 더하기

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList로 계산값을 받음
        
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = 1; j <= numbers.length -1; j++) {
                if (i != numbers.length-1) {
                    if (i != j) {
                        list.add(numbers[i] + numbers[j]); 
                        // 해당 원소(i) 외 모든 원소들(j)과 더해줌
                    }    
                } else {
                    break;
                    // 마지막 값은 계산하지않음
                }   
            }
        }
        
        HashSet<Integer> listData = new HashSet<Integer>(list);
        list = new ArrayList<Integer>(listData); // 중복값 처리
        
        int[] answer = new int[list.size()]; // 답이 들어갈 공간 
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).intValue();
            System.out.println(answer[i]);
        } // ArrayList 값을 기본 배열로 변경 
        
        return answer;
    }
}