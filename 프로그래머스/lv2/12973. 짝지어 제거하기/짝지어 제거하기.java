import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            if(stack.isEmpty()) stack.push(c);
            else{
                if(stack.peek()==c) stack.pop();
                else stack.push(c);
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return stack.isEmpty()? 1:0;
    }
}