import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1){
            if(n%2 == 1){
                n = 3*n+1;
            }else{
                n /= 2;
            }
            list.add(n);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}