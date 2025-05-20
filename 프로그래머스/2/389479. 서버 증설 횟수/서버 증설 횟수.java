class Solution {
    public int solution(int[] players, int m, int k) {
        int count = 0; // 증설 횟수
        int[] server = new int[24]; // 증설된 서버 수 저장 배열
        
        // m=3, k=5
        for (int i=0; i<players.length; i++) {
            int n=server[i];  // 현재 서버 수
            if (players[i] >= (n+1) * m) {
                // 증설
                int add = (players[i]-(m*n)) / m;
                n += add;
                
                // 시간이 지나면 증설한 서버가 사라짐
                for (int j=i; j<i+k && j<24; j++) {
                    server[j] += add;
                }
                count += add;
            }
        }
        
        return count;
    }
}