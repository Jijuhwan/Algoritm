class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] temp = String.valueOf(order).split("");
        
        
        for(int i=0; i<temp.length; i++){
            String a = temp[i];
            if(a.equals("3") ||
               a.equals("6") ||
               a.equals("9")) answer++;
        }
        
        return answer;
    }
}