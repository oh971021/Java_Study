package programers;

// �ڵ��� ��ȣ ������

public class level1_phoneNumber {
    public String solution(String phone_number) {
        int start = phone_number.length() - 4; // * �� �� �ڸ��� ����
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < start; i ++) {
            sb.append("*"); // -4 ������ * �־���
        }
        sb.append(phone_number.substring(start,phone_number.length())); // �߶� ���� 4�� ���� �Է�
    
        return sb.toString();
    }
    
    // �ٸ� ��� Ǯ�� (�迭�� ���� �ϳ��� �����ϴ� ���)
//    public String solution(String phone_number) {
//        char[] ch = phone_number.toCharArray();
//        for(int i = 0; i < ch.length - 4; i ++){
//            ch[i] = '*';
//        }
//        return String.valueOf(ch);
//    }
}
