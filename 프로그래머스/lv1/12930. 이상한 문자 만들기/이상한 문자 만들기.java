class Solution {
    public String solution(String s) {
        String answer = "";
        
        int cnt = 0;
        String[] arr = s.split("");
        
        for(String a : arr){
            cnt = a.contains(" ")? 0 : cnt +1;
            answer += cnt%2==0? a.toLowerCase() : a.toUpperCase();
        }
        
        return answer;
    }
}

