class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int nump = 0, numy = 0;
        String arr[] = s.toLowerCase().split("");
        
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals("p")){
                nump++;
            } else if(arr[i].equals("y")){
                numy++;
            }
        }
        if(nump!=numy){
            return false;
        }
        return true;
    }
}