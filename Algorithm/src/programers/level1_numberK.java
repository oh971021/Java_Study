package programers;

// K번째 수

// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

// 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
// array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
// 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
// 2에서 나온 배열의 3번째 숫자는 5입니다.

// 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
// commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 
// return 하도록 solution 함수를 작성해주세요.a

import java.util.*;

public class level1_numberK {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int j = 0; j < commands[i].length; j++) {
                al.add(commands[i][j]); // int[] to ArrayList
            }
            int[] array1 = Arrays.copyOfRange(array, al.get(0).intValue()-1, al.get(1).intValue()); // 인덱스 자르기
            Arrays.sort(array1); // 오름차순 정렬
            answer.add(array1[al.get(2).intValue()-1]); // 해당 인덱스 값 추출 후 List add
        }
        
        int[] answer1 = new int[answer.size()]; // ArrayList to int[]
        
        for (int i = 0; i < answer1.length; i++) {
            answer1[i] = answer.get(i).intValue();  
        }
        
        return answer1;
    }
}
