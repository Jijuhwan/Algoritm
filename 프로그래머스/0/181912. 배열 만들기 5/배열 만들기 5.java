import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String str : intStrs){
            int temp = Integer.parseInt(str.substring(s, l+s));
            if(temp > k) list.add(temp);
        }
        
        int idx = 0;
        int[] answer = new int[list.size()];
        for(int i : list) answer[idx++] = i;
        return answer;
    }
}