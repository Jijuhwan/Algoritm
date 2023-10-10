class Solution {
    public int solution(int chicken) {
        int answer = 0; // 서비스 치킨 수
        int service = chicken; // 새로 생길 쿠폰
        int add = 0; // 사용하고 남은 쿠폰
            
        while((service + add) > 9){
            int temp1 = (service + add) / 10;
            int temp2 = (service + add) % 10;
            
            service = temp1;
            add = temp2;
            answer += temp1;
        }
        return answer;
    }
}