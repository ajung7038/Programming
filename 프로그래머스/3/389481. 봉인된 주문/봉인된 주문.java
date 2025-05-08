import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayDeque;

class Solution {
    public String solution(long n, String[] bans) {
        // 1. bans 정렬
        Queue<String> q = new ArrayDeque<>();
        Arrays.sort(bans, (o1, o2) -> {
            if (o1.length() == o2.length()) return o1.compareTo(o2);
            return o1.length() - o2.length();
        });
        for (int i=0; i<bans.length; i++) {
            q.add(bans[i]);
        }
        
        // 2. bans 원소 제거
        while (!q.isEmpty()) {
            String tmp = q.peek();
            String target = changeIntToString(n);
            if (tmp.length() < target.length() || 
                (tmp.length() == target.length() && tmp.compareTo(target) <= 0)) {
                n++;
                q.poll();
            } else break;
        }
        return changeIntToString(n);
    }
        
        // 3. 26진법으로 바꾸기
        private String changeIntToString(long n) {
            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                long re = n%26;
                n/=26;
                
                if (re == 0) {
                    n--;
                    sb.append('z');
                } else sb.append((char)('a' + re-1));
            }
            return sb.reverse().toString();
        }
}