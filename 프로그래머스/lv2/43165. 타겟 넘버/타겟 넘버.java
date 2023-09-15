class Solution {
    int answer;
    int target;
    int[] numbers;
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.target = target;
        this.numbers = numbers;
        
        // index, sum 값을 전달
        dfs(0, 0);
        
        return answer;
    }
    
    public void dfs(int cur, int sum){
        if(cur == numbers.length){
            if(sum == target) answer++;
            return;
        }
        
        dfs(cur+1, sum + numbers[cur]);
        dfs(cur+1, sum - numbers[cur]);
    }
}