import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class 호텔대실 {

    static public int solution(String[][] book_time) {
        int answer = 0;
        int startTime = 0;
        int endTime = 1439;
        int[][] book_minute = new int[book_time.length][2];

        for(int i=0;i< book_time.length;i++){
            int startMinuteTime;
            int endMinuteTime;
            //15:00,17:00
//            int tenHour1 = Integer.parseInt(String.valueOf(book_time[i][0].charAt(0)));
//            int oneHour1 = Integer.parseInt(String.valueOf(book_time[i][0].charAt(1)));
//            int tenMinute1 = Integer.parseInt(String.valueOf(book_time[i][0].charAt(3)));
//            int oneMinute1 = Integer.parseInt(String.valueOf(book_time[i][0].charAt(4)));
//            startMinuteTime = 60*(10*tenHour1+oneHour1)+(10*tenMinute1+oneMinute1);
//            int tenHour2 = Integer.parseInt(String.valueOf(book_time[i][1].charAt(0)));
//            int oneHour2 = Integer.parseInt(String.valueOf(book_time[i][1].charAt(1)));
//            int tenMinute2 = Integer.parseInt(String.valueOf(book_time[i][1].charAt(3)));
//            int oneMinute2 = Integer.parseInt(String.valueOf(book_time[i][1].charAt(4)));
//            int endMinuteTime = 60*(10*tenHour2+oneHour2)+(10*tenMinute2+oneMinute2)+10;

            String[] tmp_s = book_time[i][0].split(":");
            startMinuteTime = 60*(Integer.parseInt(tmp_s[0]))+Integer.parseInt(tmp_s[1]);
            String[] tmp_e = book_time[i][1].split(":");
            endMinuteTime =60*(Integer.parseInt(tmp_e[0]))+Integer.parseInt(tmp_e[1])+10;
            book_minute[i][0] = startMinuteTime;
            book_minute[i][1] = endMinuteTime;

            //split 이용해서 코드수정



        }
        Arrays.sort(book_minute, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=startTime;i<endTime;i++){
            for(int j=0;j< book_minute.length;j++){
                if(i == book_minute[j][0]){
                    answer ++;
                }
                if(i == book_minute[j][1]){
                    answer--;
                }
            }
            arr.add(answer);
        }

        arr.sort(Comparator.reverseOrder());

        return arr.get(0);
    }
    public static void main(String[] args){
        String[][] book_time = {{"09:10", "10:10"}, {"10:20", "12:20"}};
        System.out.println(solution(book_time));
    }
}
