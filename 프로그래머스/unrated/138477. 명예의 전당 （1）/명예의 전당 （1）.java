import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> tmp = new ArrayList<>();
        
        for(int i=0;i<score.length;i++){
            if(tmp.size()<k){
                tmp.add(score[i]);
                Collections.sort(tmp);
                answer[i] = tmp.get(0);
                continue;
            }
            if(tmp.size()==k){
                int min = tmp.get(0);
                
                if(min<score[i]){
                    tmp.remove(0);
                    tmp.add(score[i]);
                    Collections.sort(tmp);
                }
                answer[i] = tmp.get(0);
            }
        }
        
        return answer;
    }
}