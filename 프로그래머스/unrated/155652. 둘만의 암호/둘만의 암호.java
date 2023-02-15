class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] chara = s.toCharArray();
        for(int i=0;i<chara.length;i++){
            for(int j=0;j<index;j++){
                do{
                    chara[i]++;
                    if(chara[i]>'z') chara[i]-=26;
                }while(skip.contains(String.valueOf(chara[i])));
            }
        }
        answer = String.valueOf(chara);
        return answer;
    }
}