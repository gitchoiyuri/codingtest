class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String n_today = today.replace(".","");
        int year = Integer.parseInt(n_today.substring(0,4));
        int month = Integer.parseInt(n_today.substring(4,6));
        int day = Integer.parseInt(n_today.substring(6,8));
        
        int cnt = year*12*28 + month*28 + day;
        
        int[] answer = new int[privacies.length];
        
        for(int i=0;i<privacies.length;i++){
            // privacies를 날짜와 약관 종류로 나누기
            String[] p = privacies[i].split(" ");            
            // 유효기간 달 저장
            int m = 0;
            // terms를 약관 종류와 유효기간으로 나누기
            for(int j=0;j<terms.length;j++){
                String[] t = terms[j].split(" ");
                // terms의 약관 종류와 privacies의 약관 종류가 같다면
                if(p[1].equals(t[0])){
                    m = Integer.parseInt(t[1]);
                    break;
                }
            }
            // privacies의 유효기간 .으로 구분
            String[] pd = p[0].split("\\.");
            // 유효기간의 년, 월, 일 분리
            int pyear = Integer.parseInt(pd[0]);
            int pmonth = Integer.parseInt(pd[1]);
            int pday = Integer.parseInt(pd[2]);
            // 월에 유효기간 달 더하기
            pmonth+=m;
            
            int tcnt = pyear*12*28 + pmonth*28 + pday -1;
            // 유효기간이 지났다면 answer[i]에 더해주기
            if(cnt>tcnt) answer[i] = i+1;
            
        }
        int a = 0;
        for(int i=0;i<answer.length;i++){
            if(answer[i]>0) a++;
        }
        int[] arr = new int[a];
        
        int idx = 0;
        for(int i=0;i<answer.length;i++){
            if(answer[i]>0){
                arr[idx]=answer[i];
                idx++;
            }
        }
        return arr;
    }
}