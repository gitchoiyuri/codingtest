class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int open = 0;

        for(int i=0;i<s.length();i++){        
            if(s.charAt(i)=='(') open++;
            else if(s.charAt(i)==')') open--;
            if(open<0) break;
        }
        if(open==0) answer = true;
        return answer;
    }
}