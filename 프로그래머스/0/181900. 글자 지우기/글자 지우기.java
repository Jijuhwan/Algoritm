class Solution {
    public String solution(String my_string, int[] indices) {
        int total = my_string.length();
        boolean[] remove = new boolean[total];
        
        for (int idx : indices) {
            remove[idx] = true;
        }
        
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<total; i++) {
            if(!remove[i]){
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}