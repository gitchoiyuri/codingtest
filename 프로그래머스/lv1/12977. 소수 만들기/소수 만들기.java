class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean chk = false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum>=2) chk = sosu(sum);
                    if(chk == true) answer++;                        
                }
            }
        }
        return answer;
    }
    
    
    public boolean sosu(int num){
        boolean chk2 = true;

        if(num==2) chk2 = true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                chk2 = false;
            }    
        }
        return chk2;        
    }
    
}