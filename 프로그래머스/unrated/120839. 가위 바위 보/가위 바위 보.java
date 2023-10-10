class Solution {
    public String solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        
        for(String s : rsp.split("")){
            if(s.equals("2")) answer.append("0");
            else if(s.equals("0")) answer.append("5");
            else answer.append("2");
        }
        
        return answer.toString();
    }
}