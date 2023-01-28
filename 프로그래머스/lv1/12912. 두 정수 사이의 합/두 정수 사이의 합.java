class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (b-a<0){
            for(long i=0; i<a-b; i++){
                answer += b + i;
            }     
             answer += a;
        }
        else if(b==a){
            answer = a;
        }
        else{
            for(long i=0; i<b-a; i++){
                answer += a + i;
            }     
             answer += b;

        }      
        return answer;
    }
}