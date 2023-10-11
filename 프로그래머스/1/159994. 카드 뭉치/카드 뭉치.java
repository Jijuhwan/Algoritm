class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 순서대로 하나씩 사용해야 하며, cards1이 cards2보다 클 수 밖에 없다
        int cards1Index = 0;
        int cards2Index = 0;
        for(int i=0; i<goal.length; i++){
            String cusorString = goal[i];
            if(cards1Index < cards1.length && cusorString.equals(cards1[cards1Index])) cards1Index++;
            else if(cards2Index < cards2.length && cusorString.equals(cards2[cards2Index])) cards2Index++;
            else return "No";
        }
        
        return "Yes";
    }
}