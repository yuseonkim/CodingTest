import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 셔틀버스 {

    static String solution(int n, int t, int m, String[] timetable) {

        int firstBus = 540;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < timetable.length; i++) {
            int hourTen = timetable[i].charAt(0);
            int hourOne = timetable[i].charAt(1);
            int MinuteTen = timetable[i].charAt(3);
            int MinuteOne = timetable[i].charAt(4);
            arrayList.add(60 * (hourTen * 10 + hourOne) + MinuteTen * 10 + MinuteOne);
        }

        for (int j = 0; j < n-1; j++) {
                for (int time : arrayList) {
                    if (time < firstBus+t*j)
                        arrayList.remove(time);
                }
        }



        arrayList.sort(Comparator.naturalOrder());
        if (arrayList.size() < m)
            answer = firstBus+t*(n-1);
        else {
            answer = arrayList.get(m) - 1;
        }

        return answer / 60 + ":" + answer % 60;
    }

    public static void main(String[] args) {
        String a= solution(1,1,5, new String[]{"08:00", "08:01", "08:02", "08:03"});
        System.out.println(a);
    }
}
