class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        for (int i = 0; i < t.length(); i++) {
            int endIdx = i + pLength;
            if (endIdx > t.length()) {
                break;
            }else {
                if (Long.valueOf(t.substring(i, endIdx)) <= Long.valueOf(p)) {
                answer++;
                }
            }
        }
        return answer;
    }
}