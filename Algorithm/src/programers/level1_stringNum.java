package programers;

// ���ڿ� �ٷ�� �⺻

// ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. 
// ���� ��� s�� "a234"�̸� False�� �����ϰ� "1234"��� True�� �����ϸ� �˴ϴ�.

public class level1_stringNum {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        
        try {
            int i = Integer.parseInt(s);
        } catch (Exception e) {
            answer = false;
        }
        
        return answer;
    }
}
