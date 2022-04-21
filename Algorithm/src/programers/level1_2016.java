package programers;

// 2016��

// 2016�� 1�� 1���� �ݿ����Դϴ�. 

// 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 
// 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 

// ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT �Դϴ�. 
// ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� "TUE"�� ��ȯ�ϼ���.

public class level1_2016 {
    public String solution(int a, int b) {
        String[] answer = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;
        
        if (a != 1) {
            for (int i = 0; i < a-1; i++) {
                result += days[i];
            } // 1 ~ �Է� ���� �������� ��¥ ���
        }
        
        result += b; // �Է� ���� ���� ��¥ �����ֱ�
        
        return answer[result % 7]; // �� �ϼ� / 7 �� �������� ���� �� ����
    }
}
