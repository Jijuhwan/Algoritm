class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] chk = String.valueOf(n).split("");
        for(String c : chk){
            answer += Integer.valueOf(c);
        }
        return answer;
    }
}