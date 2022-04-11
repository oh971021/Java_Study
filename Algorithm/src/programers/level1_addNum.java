package programers;

// �ڸ��� ���ϱ�

// �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
// ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

public class level1_addNum {
    public int solution(int n) {
        int length = (int)(Math.log10(n)+1); // ���� ���ϱ�
        int[] intArr = new int[length];
        int answer = 0;
        
        for (int i = 0; i <= length-1; i++) {
            intArr[i] = n % 10;
            n /= 10;
        } // ������ �ڸ��� �̾Ƴ���
        
        for (int i : intArr) {
            answer += i;
        } // �հ豸�ϱ�

        return answer;
    }
    
    /*
     - ���� Ǯ��
     
	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	
	        while(true){
	            answer+=n%10;
	            if(n<10)
	                break;
	
	            n=n/10;
	        }
	
	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("Hello Java");
	
	        return answer;
	    }
	}
    */
}
