class Solution {
    String[] words;
    String target;
    int answer;
    boolean[] visited;
    
    public int solution(String begin, String target, String[] words) {
        this.words = words;
        this.target =target;
        visited = new boolean[words.length];
        
        dfs(begin, 0);
        
        return answer;
    }
    
    public void dfs(String begin, int sum){
        if(begin.equals(target)){
            this.answer = sum;
            return;
        }
        
        for(int i=0; i<words.length; i++){
            if(visited[i]) continue;
            int cnt = 0;
            for(int j=0; j<begin.length(); j++)
                if(begin.charAt(j) == words[i].charAt(j)) cnt++;
            
            if(cnt == words[i].length() -1){
                visited[i] = true;
                dfs(words[i], sum +1);
                visited[i] = false;
            }
        }
    }
}