class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int len = num_list.length;
        int last = 0;
        
        for(int i=0; i<len; i++){
            answer[i] = num_list[i];
        }
        
        if(num_list[len-1] > num_list[len-2]) last = num_list[len-1] - num_list[len-2];
        else last = num_list[len-1] *2;
        
        answer[answer.length-1] = last;
        
        return answer;
    }
}