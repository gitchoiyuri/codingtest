class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        int RTnum = 0, CFnum = 0, JMnum = 0, ANnum = 0;
        
        for(int i=0;i<survey.length;i++){
            String arr = survey[i];
            
            int score = 0;
            switch(choices[i]){
                case 1 : score = -3; break;
                case 2 : score = -2; break;
                case 3 : score = -1; break;
                case 4 : score = 0; break;
                case 5 : score = 1; break;
                case 6 : score = 2; break;
                case 7 : score = 3; break;
                
            }
            switch(arr){
                case "RT" : RTnum += score; break;
                case "TR" : RTnum -= score; break;
                
                case "CF" : CFnum += score; break;
                case "FC" : CFnum -= score; break;
                
                case "JM" : JMnum += score; break;
                case "MJ" : JMnum -= score; break;
                    
                case "AN" : ANnum += score; break;
                case "NA" : ANnum -= score; break;
                    
            }
        }
        
        String a = "R";
        String b = "C";
        String c = "J";
        String d = "A";
        
        if(RTnum>0) a = "T";        
        if(CFnum>0) b = "F";        
        if(JMnum>0) c = "M";        
        if(ANnum>0) d = "N";
        
        return a+b+c+d;
    }
}