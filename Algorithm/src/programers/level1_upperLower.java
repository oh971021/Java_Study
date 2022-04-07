package programers;

// �̻��� ���� �����

// ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. 
// �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
// �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

public class level1_upperLower {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ", -1); // �������� �����µ�, ���ڿ� ���̸� �����ϰ� ���� ������
        
        for (String str : strArr) {
            char[] charArr = str.toCharArray(); // String to char[]
            
            for (int i = 0; i < str.length(); i++) {
                charArr[i] = Character.toLowerCase(charArr[i]); // ���� �ҹ��ڷ� ����
                if (i % 2 == 0) {
                    charArr[i] = Character.toUpperCase(charArr[i]); // ¦����°�� �빮�ڷ� ����
                }  
                answer += charArr[i]; // ����� char[] ������ ���   
            }
            answer += " "; // ���ο� char[] �۾����� " " �־���
        }
        return answer.substring(0, answer.length()-1); // ���ڿ� ������ ���� ����
    }
}
