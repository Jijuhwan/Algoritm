import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            String s = String.valueOf(i);
            int cnt = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == '5' || s.charAt(j) == '0') cnt++;
            }
            if(cnt == s.length()) list.add(i);
        }
        if(list.size() == 0) list.add(-1);
        answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}