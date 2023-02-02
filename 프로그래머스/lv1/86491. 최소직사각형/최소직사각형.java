import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxv = 0;
        int maxh = 0;
        for(int i=0;i<sizes.length;i++){
            int v = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            
            maxv = Math.max(v,maxv);
            maxh = Math.max(h,maxh);
        }
        
        return answer= maxv*maxh;
    }
}