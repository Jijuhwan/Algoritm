import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
                                                                
        for(int i=0; i<queries.length; i++){
            int chk = 1000000;
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(arr[j] > queries[i][2]) chk = Math.min(chk, arr[j]);
            }
            if(chk == 1000000) chk = -1;
            answer[i] = chk;
        }
        
        return answer;
    }
}