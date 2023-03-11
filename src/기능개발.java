import java.util.ArrayList;

public class 기능개발 {
    public static Integer[] Solution(int[] progresses, int[] speeds) {

        //남은 날짜 계산
        ArrayList<Integer> arr = new ArrayList<>();
        int[] days = new int[progresses.length];
        int startNum = 0;
        for (int i = 0; i < days.length; i++) {
            days[i] = (int) Math.ceil((100 - progresses[i]) / (double)speeds[i]);
        }
        // 100 - 30 = 70 20
        //2 , 1, 7
        boolean[] isFinished = new boolean[days.length];
        for (boolean a : isFinished) {
            a = false;
        }
        while (true) {
            for (int i = 0; i < days.length; i++) {
                days[i]--;
                if (days[i] <= 0) {
                    isFinished[i] = true;
                }
            }
            int count = 0;
            while (true) {
                if (startNum != isFinished.length && isFinished[startNum]) {
                    count++;
                    startNum++;
                } else {
                    if (count != 0) {
                        arr.add(count);
                    }
                    break;
                }
            }
            int sum = 0;
            for (int a : arr) {
                sum += a;
            }
            if (sum == days.length)
                break;
        }
        return arr.toArray(new Integer[0]);

    }

    public static void main(String[] args) {
        int[] progress = {100, 50, 99, 100};
        int[] speeds = {1, 1, 1, 1};

        Integer[] arr = Solution(progress, speeds);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
