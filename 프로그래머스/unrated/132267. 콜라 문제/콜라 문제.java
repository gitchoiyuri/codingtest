class Solution {
    public int solution(int a, int b, int n) { // 2 1 20, 5 2 20
        int answer = 0;
   
        while(n>=a){
                answer+=n/a*b;
                n=n/a*b+n%a;
        }

        return answer;
    }
}