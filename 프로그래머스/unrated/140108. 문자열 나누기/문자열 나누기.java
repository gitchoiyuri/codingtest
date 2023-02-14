class Solution {
    public int solution(String s) {
        
        char x = s.charAt(0);
        int xcnt = 0;
        int ycnt = 0;
        int answer = 0;
        for(int i=0;i<s.length();i++){
            if(xcnt==ycnt){
                answer++;
                x=s.charAt(i);
            }
            if(s.charAt(i)==x) xcnt++;
            else ycnt++;
            
        }
        return answer;
    }
}