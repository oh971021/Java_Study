package programers;

// �Ҽ� �����

// �־��� ���� �� 3���� ���� ������ �� �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. 
// ���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, 
// nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� �Ҽ��� �Ǵ� ����� ������ 
// return �ϵ��� solution �Լ��� �ϼ����ּ���.

import java.util.*;

public class level1_decimal {
    public int solution(int[] nums) {
        int answer = 0;
		
        // ���� ������ ������� ����
        ArrayList<Integer> list = new ArrayList<Integer>();
        // for���� �̿��Ͽ� �迭�� ���� ���Ѵ�.         
        for(int i = 0; i < nums.length; i++) {
        	if(i + 2 >= nums.length) break;
        	for(int j = i + 1; j < nums.length; j++) {
        		for(int h = j + 1; h < nums.length; h++) {
        			list.add(nums[i] + nums[j] + nums[h]);
        		}
        	}
        }
        
        // ����� ���� �Ҽ����� �Ǻ��Ѵ�.
        for(Integer i : list) {
        	int count = 2;
        	answer++;
        	while(count < i) {
			// ����� ���� count�� ������ �� �������� 0�̶�� �Ҽ��� �ƴϱ� ������ answer�� ���� ������ �ʴ´�.			
        		if(i % count == 0) {
        			answer--;
        			break;
        		}
        		count++;
        	}
        }
        return answer;
    }
}
