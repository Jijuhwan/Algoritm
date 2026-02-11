class Solution {
    public int[] solution(int n, int k) {
        int total = n / k;
        int[] answer = new int[total];
        
        int idx = 0;
        for(int i=k; i<=n; i += k){
            answer[idx++] = i;
        }
        
        return answer;
    }
}