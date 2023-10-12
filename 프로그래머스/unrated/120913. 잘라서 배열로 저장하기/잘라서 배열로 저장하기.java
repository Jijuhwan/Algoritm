class Solution {
    public String[] solution(String my_str, int n) {
        int max = my_str.length();
        int cnt = max/n;
        if(max%n != 0) cnt++;
        String[] answer = new String[cnt];
        
        for(int i=0; i<cnt; i++){
            int last = (i+1)*n;
            if(last > max) last = max;
            answer[i] = my_str.substring(i*n, last);
        }
        
        return answer;
    }
}