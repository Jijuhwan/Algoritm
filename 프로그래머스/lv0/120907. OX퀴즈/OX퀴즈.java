class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            int q_ans = 0;
            String[] q = quiz[i].split(" ");
            if(q[1].equals("+")) q_ans = Integer.valueOf(q[0]) + Integer.valueOf(q[2]);
            else q_ans = Integer.valueOf(q[0]) - Integer.valueOf(q[2]);
            
            if(q_ans == Integer.valueOf(q[4])) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }
}