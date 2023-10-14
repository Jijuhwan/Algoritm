import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> mbti = new HashMap<>(){{
            put("R", 0);
            put("T", 0);
            put("C", 0);
            put("F", 0);
            put("J", 0);
            put("M", 0);
            put("A", 0);
            put("N", 0);
        }};
        
        for(int i=0; i<survey.length; i++){
            int choice = choices[i];
            String[] s = survey[i].split("");
            if(choice < 4) mbti.put(s[0], mbti.getOrDefault(s[0], 0) + Math.abs(choice-4));
            else mbti.put(s[1], mbti.getOrDefault(s[1], 0) + Math.abs(choice-4));
        }
   
        if(mbti.get("T") > mbti.get("R")) answer.append("T");
        else answer.append("R");
        
        if(mbti.get("F") > mbti.get("C")) answer.append("F");
        else answer.append("C");
        
        if(mbti.get("M") > mbti.get("J")) answer.append("M");
        else answer.append("J");
        
        if(mbti.get("N") > mbti.get("A")) answer.append("N");
        else answer.append("A");
        
        return answer.toString();
    }
}