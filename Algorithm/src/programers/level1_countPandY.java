package programers;

// ���ڿ� �� p�� y�� ����

// �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. 
// s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
// 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. 
// ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

// ���� ��� s�� "pPoooyY"�� true�� return�ϰ� "Pyy"��� false�� return�մϴ�.

public class level1_countPandY {
    boolean solution(String s) {
        
        int pCnt = 0;
        int yCnt = 0;
        
        char[] charArr = s.toCharArray(); // ���� ���ϱ� ���� char[]
        for (char c : charArr) {
            if (c == 'p' || c == 'P') { // p Ȥ�� P�� ������ Cnt;
                pCnt++;
            } else if (c == 'y' || c == 'Y') { // y Ȥ�� Y�� ������ Cnt;
                yCnt++;
            }
        }
        
        return pCnt == yCnt;
    }
}
