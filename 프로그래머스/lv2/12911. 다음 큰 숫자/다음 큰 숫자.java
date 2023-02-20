class Solution {
    public int solution(int n) {
        int answer = 0;
        int cntn = 0;
        String str = Integer.toBinaryString(n);
        for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1') cntn++;
            }
        for(int i=n+1;i<=1000000;i++){
            int cntj = 0;
            String str2 = Integer.toBinaryString(i);
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(j)=='1') cntj++;
            }
            if(cntn==cntj) {
                answer = i; 
                break;
            }
        }
        return answer;
    }
}