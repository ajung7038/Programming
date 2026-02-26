class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        // 출근 희망 시각 + 10분 => return count
        // 시에 100을 곱하고 분을 더한 정수로 표현
        // 일주일동안 이벤트 진행, startday부터. (int로 포함) => 토, 일 배제
        int people = schedules.length;
        int result = 0;
        
        for (int i=0; i<people; i++) {
            int hopeTime = schedules[i]+10; // schedules
            if (hopeTime % 100 >= 60) { // 만약 더했는데 60분이 된 경우
                hopeTime = hopeTime +40;
            }
            int dayOf = startday; // 요일
            boolean eventFlag = true;
            int modDayOf = dayOf % 7;
            
            for (int time : timelogs[i]) {
                modDayOf %= 7;
                if (modDayOf == 6 || modDayOf == 0) {
                    modDayOf++;
                    continue;
                }
                if (hopeTime < time) {
                    eventFlag = false;
                    break;
                }
                modDayOf++;
            }
            if (eventFlag) {
                result++;
            }
        }
        
        return result;
    }
}
