class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String chk = A;
        
        for(int i=0; i<A.length(); i++){
            if(chk.equals(B)) return answer;
            
            String temp = chk.substring(chk.length()-1);
            chk = temp + chk.substring(0, chk.length()-1);
            answer++;
        }
        
        return -1;
    }
}
