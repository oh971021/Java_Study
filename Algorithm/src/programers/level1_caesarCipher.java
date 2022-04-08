package programers;

// ������ȣ

// � ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
// ���� ��� "AB"�� 1��ŭ �и� "BC"�� �ǰ�, 3��ŭ �и� "DE"�� �˴ϴ�. "z"�� 1��ŭ �и� "a"�� �˴ϴ�. 
// ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

public class level1_caesarCipher {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        String answer = "";
        
        for (char c : charArr) {  // �ϳ��� ��������
            for (int i = 1; i <= n; i++) { // 1�� ������Ű�鼭 ����
                if (c != ' ') { // ������ ������ ���·�
                    if (c == 'z' || c == 'Z') { 
                        c = (char)((int)c - 26);   
                    } // z or Z�� ���ĺ� �������� ���ư���.
                    c = (char)((int)c+1); // 1�� ����
                }
            }
            answer += c; // �ϼ��� c �� answer ������ ����
        }
        return answer;
    }
}