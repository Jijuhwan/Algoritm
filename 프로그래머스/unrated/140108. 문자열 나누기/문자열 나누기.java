class Solution {
    public int solution(String s) {
        char chk = s.charAt(0);
        int same = 0;
        int diff = 0;
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            if(same == diff){
                answer++;
                chk = s.charAt(i);
            }

            if(s.charAt(i) == chk) same++;
            else diff++;
        }

        return answer;
    }
}