class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        // 1. 2중 for문을 사용하여, 계산한다.
        for(int[] arr : queries){
            StringBuffer temp = new StringBuffer();
            // 2. e부터 s까지 각 문자열을 answer에 더한다.
            for(int i=arr[1]; i>=arr[0]; i--){
                temp.append(answer.charAt(i));
            }
            // 3. temp 값과 e부터 끝까지 문자열을 계산된 answer에 더한다.
            answer = answer.substring(0, arr[0]) + 
                temp.toString() + 
                answer.substring(arr[1]+1, answer.length());
        }
        return answer;
    }
}