class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        
        for(int i=3;i<sum;i++){
            int y = i;
            int x = sum/y;
            
            if(y>x) continue;
            
            if((x-2)*(y-2)==yellow){
                answer[0] = x;
                answer[1] = y;
                break;
            }
        }
       
        return answer;
    }
}