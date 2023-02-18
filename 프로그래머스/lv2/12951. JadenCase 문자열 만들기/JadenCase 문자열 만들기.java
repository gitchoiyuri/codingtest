import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()==0) answer+= " ";
            else {
                answer += arr[i].substring(0,1).toUpperCase();
                answer += arr[i].substring(1,arr[i].length()).toLowerCase();
                answer += " ";
            }        
        }
        // s의 마지막 문자가 공백일 경우 바로 answer 반환 (for문에서 공백 넣어줬기 때문)
        if(s.substring(s.length()-1,s.length()).equals(" ")) return answer;
        return answer.substring(0,answer.length()-1);
    }
}