package programers;

// ���ڿ� ������������ ��ġ�ϱ�

// ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
// s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

public class level1_sortString {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i+1; j < charArr.length; j++) {
                while (charArr[i] < charArr[j]) {
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
            answer += charArr[i];
        }

        return answer;
    }
}
