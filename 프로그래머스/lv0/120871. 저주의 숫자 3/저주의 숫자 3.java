class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            while(true){
                answer++;
                int chk = answer % 3;
                if(chk % 3 != 0 && !String.valueOf(answer).contains("3")) break;
                chk = chk % 3;
            }
        }
        return answer;
    }
}