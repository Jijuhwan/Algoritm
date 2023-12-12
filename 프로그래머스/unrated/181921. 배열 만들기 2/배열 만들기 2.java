import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        // l과 r 사이에 0과 5로만 만들 수 있는 정수들
        List<Integer> list = new ArrayList<>();
        for(int i=l; i<=r; i++){
            String s = i + "";
            int cnt = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == 48 || s.charAt(j) == 53){
                    cnt++;
                }
            }
            if(cnt == s.length()){
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        int[] empty = {-1};
        if(answer.length == 0) return empty;
        return answer;
    }
}