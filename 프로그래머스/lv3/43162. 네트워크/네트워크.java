class Solution {
    int answer;
    int n;
    int[][] computers;
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        answer = 0;
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                answer++;
                dfs(i);                
            }
        }
        
        return answer;
    }
    
    public void dfs(int cur){
        visited[cur] = true;
        for(int i=0; i<n; i++){
            if(!visited[i] && computers[cur][i] == 1)
                dfs(i);
        }
    }
}