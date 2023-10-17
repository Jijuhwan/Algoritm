import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0; i<my_string.length(); i++){
            set.add(my_string.charAt(i));
        }
        
        for(Object o : set){
            answer.append(o);
        }
        return answer.toString();
    }
}