import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<array.length; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) +1);
            max = Math.max(map.get(array[i]), max);
        }
        
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(max == m.getValue()){
                if(answer != 0) return -1;
                answer = m.getKey();
            }
        }
        
        return answer;
    }
}