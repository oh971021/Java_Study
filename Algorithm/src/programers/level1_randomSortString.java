package programers;

// ���ڿ� �� ����� �����ϱ�

// ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, 
// �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
// ���� ��� strings�� ["sun", "bed", "car"]�̰� n�� 1�̸� 
// �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"�� strings�� �����մϴ�.

import java.util.*;

public class level1_randomSortString {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings); // �⺻ ���� (�⺻ �迭 ����)
        ArrayList<String> strArr = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            strArr.add(strings[i].charAt(n) + strings[i]);
        } // ���ϴ� �ε����� ���� ������ ������
        
        Collections.sort(strArr); // ���ϴ� �ε��� ���� ���� (ArrayList ����)
        
        String[] answer = new String[strArr.size()];
        for (int i = 0; i < strArr.size(); i++) {
            answer[i] = strArr.get(i).substring(1, strArr.get(i).length());
        } // ���� ���ڸ��� ���� �� �� �ʱ�ȭ
        
        return answer;
    }
}
