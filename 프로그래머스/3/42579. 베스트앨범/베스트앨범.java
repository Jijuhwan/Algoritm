import java.util.*;

class Solution {
    static class Music{
        String genre;
        int play;
        int idx;
        
        public Music(String genre, int play, int idx){
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map =new HashMap<>();
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // 1. 장르 선정
        ArrayList<String> genres_ordered = new ArrayList<>();
        while(map.size() != 0){
            int max = -1;
            String max_key = "";
            for(String key : map.keySet()){
                int tmp_cnt = map.get(key);
                if(tmp_cnt > max){
                    max = tmp_cnt;
                    max_key = key;
                }
            }
            genres_ordered.add(max_key);
            map.remove(max_key);
        }
        
        // 2. 장르 내 노래 선정
        ArrayList<Music> res = new ArrayList<>();
        for(String g : genres_ordered){
            ArrayList<Music> list = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(g)){
                    list.add(new Music(g, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play);
            res.add(list.get(0));
            if(list.size() != 1){
                res.add(list.get(1));
            }
        }
        
        int[] answer = new int[res.size()];
        for(int i=0; i<res.size(); i++) answer[i] = res.get(i).idx;
        return answer;
    }
}