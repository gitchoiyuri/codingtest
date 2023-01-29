class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        
        int min = arr[0];
        
        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        int idx = 0; // 가장 작은 수가 여러개일 경우
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            answer[idx++] = arr[i];
        }        
        
        return answer;
    }
}