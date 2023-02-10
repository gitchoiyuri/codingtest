class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correct = 0;
        int zero = 0;
        
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(lottos[i]==win_nums[j]) correct++;
            }
            if(lottos[i]==0) zero++;
        }
        
        answer[0] = correct+zero;
        answer[1] = correct;
        
        for(int i=0;i<2;i++){
            if(answer[i] ==6) answer[i] = 1; 
            else if(answer[i] ==5) answer[i] = 2; 
            else if(answer[i] ==4) answer[i] = 3; 
            else if(answer[i] ==3) answer[i] = 4; 
            else if(answer[i] ==2) answer[i] = 5; 
            else answer[i] = 6; 
        }
        return answer;
    }
}