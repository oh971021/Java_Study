package programers;

// 완주하지 못한 선수
// 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

// 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 
// 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
// 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

import java.util.HashMap;

public class level1_marathon {
    public String solution(String[] participant, String[] completion) {  

        String answer = "";
        HashMap<String, Integer> answerMap = new HashMap<>();
        for(int i=0; i<participant.length;i++) {
            String name = participant[i];
            if (answerMap.containsKey(name)) {
                int count = (int)answerMap.get(name);
                answerMap.put(name, ++count);                
            } else {    
                answerMap.put(name, 1);
            }
        }

        for(int i=0; i<completion.length;i++) {            
            int count = (int)answerMap.get(completion[i]);
            String name = completion[i];
            if (count == 1) {
                answerMap.remove(name);
            } else {                 
                answerMap.put(name, --count); 
            }  
        }    
        String temp = answerMap.keySet().toString();
        answer = temp.substring(1, temp.length()-1);

        return answer;
    }
}
