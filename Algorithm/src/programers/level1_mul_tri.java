package programers;

// �ִ������� �ּҰ����

public class level1_mul_tri {
    public int[] solution(int n, int m) {
        int tri = 0; // �ִ�����
        int mul = 0; // �ּҰ����
        
        int i = 1;
        
        while (i <= n && i <= m) {
            if (n % i == 0 && m % i == 0) { // 0���� ��������
                tri = i; // �ִ������� i���� �����Ѵ�
            }
            i++; // i�� �������� �ִ����� �� ã��
        }
        
        mul = (n*m) / tri;
        
        int[] answer = {tri, mul};
        return answer;
    }
}
