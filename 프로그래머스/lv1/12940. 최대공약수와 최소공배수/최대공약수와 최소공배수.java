class Solution {
    // 최대공약수 (유클리드 호제법)
    int gcd(int n, int m){
        int r;
        while(m > 0){
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        if (n < m){
            int tmp = n;
            n = m;
            m = tmp;
        }
        
        answer[0] = gcd(n, m);
        
        // 최소공배수
        answer[1] = n * m / answer[0];
        
        return answer;
    }
}