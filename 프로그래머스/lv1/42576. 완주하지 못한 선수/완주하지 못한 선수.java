import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        // 동명이인이 있는 경우 고려 / .equals를 사용해서 값 비교
        int i;
        for(i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i]))
                break;
        answer = participant[i];       
        }
        answer = participant[i];       

        return answer;
    }
}