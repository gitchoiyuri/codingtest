import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> tmpList = new ArrayList<>();
        
        // 3진법으로 변환
        while(n>0){
            tmpList.add(n % 3);
            n /= 3;
        }
        
        // 10진법으로 변환
       int tmp = 1;
        for (int i = tmpList.size()-1;i>=0;i--){
            answer += tmpList.get(i)*tmp;
            tmp*=3;
        }
        return answer;
    }
}