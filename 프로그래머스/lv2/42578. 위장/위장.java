import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        // 옷 구분
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] clothe : clothes){
            String type = clothe[1];
            map.put(type, map.getOrDefault(type,0)+1);
        }
        
        // 입지 않는 경우 추가
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        
        while(it.hasNext())
            answer *= it.next().intValue() + 1;

        // 아무 옷도 입지 않는 경우
        return answer - 1;

    }
}