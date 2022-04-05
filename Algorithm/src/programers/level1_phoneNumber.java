package programers;

// 핸드폰 번호 가리기

public class level1_phoneNumber {
    public String solution(String phone_number) {
        int start = phone_number.length() - 4; // * 이 들어갈 자리를 구함
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < start; i ++) {
            sb.append("*"); // -4 전까지 * 넣어줌
        }
        sb.append(phone_number.substring(start,phone_number.length())); // 잘라 놓은 4개 숫자 입력
    
        return sb.toString();
    }
    
    // 다른 사람 풀이 (배열로 만들어서 하나씩 변경하는 방법)
//    public String solution(String phone_number) {
//        char[] ch = phone_number.toCharArray();
//        for(int i = 0; i < ch.length - 4; i ++){
//            ch[i] = '*';
//        }
//        return String.valueOf(ch);
//    }
}
