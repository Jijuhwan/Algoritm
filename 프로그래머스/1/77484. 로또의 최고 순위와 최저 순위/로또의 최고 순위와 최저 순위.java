class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 7;
        int zero = 0;
        
        for(int i=0; i<win_nums.length; i++){
            for(int j=0; j<lottos.length; j++){
                if(win_nums[i] == lottos[j]) cnt--;
            }
            if(lottos[i] == 0) zero++;
        }
        
        if(zero > 5) zero--;        
        if(cnt > 6) cnt--;
        
        answer[0] = cnt - zero;
        answer[1] = cnt;
        
        return answer;
    }
}