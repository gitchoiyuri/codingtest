class Solution {
    public long solution(int n) {
      int[] answer = new int[2001];
      answer[1] = 1;
      answer[2] = 2;
      for(int i=3; i<2001; i++){
          answer[i] = (answer[i-2] + answer[i-1]) % 1234567;
      }
      return answer[n];
    }
}