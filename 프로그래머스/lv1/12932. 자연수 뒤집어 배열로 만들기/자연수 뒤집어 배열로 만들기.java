class Solution {
    public int[] solution(long n) {
        int cnt = 0;
        long n2 = n;
        while (n2 != 0){
            n2/=10;
            cnt++;
        }
        int [] answer = new int [cnt];
        
        n2 = n;
        for(int i = 0; n2 != 0; i++){
            answer[i] = (int)(n2%10);
            n2 /= 10;
        }
        return answer;
    }
}