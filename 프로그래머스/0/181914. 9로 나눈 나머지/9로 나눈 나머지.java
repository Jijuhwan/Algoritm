import java.util.Arrays;

class Solution {
    public int solution(String number) {
        int answer = 0;
        // 각 자리수를 합한다.
        for(char c : number.toCharArray()){
            answer += c - 48;
        }
        // 합한 값을 9로 나눈 후 나머지를 구한다.
        return answer % 9;
    }
}