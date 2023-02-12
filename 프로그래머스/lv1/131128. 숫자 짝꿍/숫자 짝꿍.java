import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] cx = new int[10];
        int[] cy = new int[10];
        
        for (String tmpx : X.split("")) cx[Integer.parseInt(tmpx)]++;
        for (String tmpy : Y.split("")) cy[Integer.parseInt(tmpy)]++;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=9;i>=0;i--){
            while(cx[i]>0&&cy[i]>0){
                sb.append(i);
                cx[i]--;
                cy[i]--;
            }
        }
        if("".equals(sb.toString())) answer = "-1";
        else if("0".equals(sb.toString().substring(0,1))) answer = "0";
        else answer = sb.toString();
        
        return answer;
    }
}