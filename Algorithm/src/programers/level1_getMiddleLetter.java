package programers;

// ��� ���� ��������

// �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. 
// �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

public class level1_getMiddleLetter {
    public String solution(String s) {
        int len = s.length(); // �񱳸� ���� ��Ʈ�� ���� �̱�
        
        return len % 2 == 0 ? s.substring((len/2)-1, (len/2)+1) : s.substring((len/2+1)-1, (len/2+1));
    }
}
