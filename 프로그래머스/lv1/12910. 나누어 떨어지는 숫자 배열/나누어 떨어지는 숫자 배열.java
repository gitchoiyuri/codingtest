import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0; // divisor로 나누어 떨어지는 값 개수
        int num = 0; // answer 배열 크기
        
        for (int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                cnt ++;
            }
        }
        if(cnt ==0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[cnt];
        for (int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[num] = arr[i];
                num ++;
            }
        }
        //arrays 함수로 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}