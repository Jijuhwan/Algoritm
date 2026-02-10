class Solution {
    public int[] solution(String my_string) {
        // 1. answer을 A-Z, a-z 개수로 선언
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else { 
                // 문제에서 알파벳만 주어진다고 했으므로 else는 소문자
                answer[26 + (c - 'a')]++;
            }
        }

        return answer;
    }
}