package programers;

// �ڿ��� ������ �迭�� �����

// �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

public class level1_longToIntArray {
    public int[] solution(long n) {
        int len = (int)(Math.log10(n) + 1); // ���� ���ϱ�
        int[] intArr = new int[len];
        
        for (int i=0; i <= len-1; i++) {
            intArr[i] = (int)(n % 10); // int�� ����� ���� �� ������ �ۿ��� int�Ľ�
            n /= 10;
        }
     
        return intArr;
    }
}
