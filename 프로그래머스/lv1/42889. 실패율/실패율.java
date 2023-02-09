import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // 스테이지에 있는 사용자 수, 스테이지 수와 배열을 동일하게 하려고 N+1 사용
        double[] stage = new double[N+1];
        
        // stage[] 배열에 있는 사용자 수 담기
        for(int i:stages){
            if(i==N+1) continue;
            stage[i]++;
        }
        
        // 실패율
        ArrayList<Double> fail = new ArrayList<Double>();
        
        // 스테이지에 있는 사용자 수 담기
        double num = stages.length;
        
        // 스테이지 올라갈 때 줄어드는 사용자
        double tmp = 0;
        
        // 실패율 구하기
        for(int i=1;i<stage.length;i++){
            tmp = stage[i];
            if(num==0) stage[i] = 0;
            else{
                stage[i]=stage[i]/num;
                num-=tmp;
            }
            fail.add(stage[i]);
        }
        Collections.sort(fail,Collections.reverseOrder());
        
        // 실패율이 높은 순으로 정렬
        for(int i=0;i<fail.size();i++){
            for(int j=1;j<stage.length;j++){
                if(fail.get(i)==stage[j]){
                    answer[i] = j;
                    stage[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}