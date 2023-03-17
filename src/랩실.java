import java.util.ArrayList;
import java.util.Scanner;

public class 랩실 {

    static int solution(int[] papers,int n,int m){
        int[] arr = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i] = 0;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<papers.length;j++){
                arr[papers[j]-1] = 1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                arrayList.add(i);
            }
        }
        //1 , 2 => 14 / 9
        //1 , 3 => 14 / 11
        // 1, 4 => 14 / 13
        // 1, 5 => 14 / 15
        //차이가 4이상 나면 그냥 뽑는게 각각뽑는게 이득
        // 1 3 5 (2,1) 11 + 7 = 18 // 5+10 = 15
        // 1 3 7 = (2,1) 11 + 7 = 18 5 + 14 = 19
        // 1 4 8 11 (2,2) 26  27
        // 1 4 7 10 (2,2) 26 25
        // 1 4 7 11 (2,2) 13 + 15 = 28 5+22/27 5+14 + 7 = 26

        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<arrayList.size()-1;i++){
            arr2.add(arrayList.get(i+1) -arrayList.get(i));
        }
        int sum = 0;
        int count = 1;
        for(int a : arr2){
            if(a >= 4){
                if(count!=0){
                    sum += 5+count*2;
                    count= 1;
                }else{
                    sum+=7;
                }
            }else{
                count+=a;
            }
        }
        sum+= 5+count*2;
        return sum;

//5 7 8 9 10 (3,2,2,2)
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] papers = new int[m];
        for(int i=0;i<m;i++){
            papers[i] = sc.nextInt();
        }
        System.out.println(solution(papers,n,m));
    }
}
