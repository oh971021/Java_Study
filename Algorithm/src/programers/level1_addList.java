package programers;

// ����� ����

public class level1_addList {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
                                // 1����        2����
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] += arr1[i][j];
            }
        }
        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        
        return answer;
    }
}
