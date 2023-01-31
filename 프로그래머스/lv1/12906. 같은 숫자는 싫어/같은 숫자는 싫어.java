import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tmplist = new ArrayList<Integer>();
        int tmp = 10;
        
        for(int n : arr){
            if(tmp != n)
                tmplist.add(n);
            tmp = n;
        }
        
        int[] answer = new int[tmplist.size()];
        for (int i = 0 ; i<answer.length;i++){
            answer[i] = tmplist.get(i).intValue();
        }
       
        return answer;
    }
}
