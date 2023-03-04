import java.util.Arrays;

public class 전화번호부 {


    static boolean Solution(String[] arr){

        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1].startsWith(arr[i]))
                return false;
        }

        return true;
    }
    public static void main(String[] args){
        String abc = "123";
    }
}
