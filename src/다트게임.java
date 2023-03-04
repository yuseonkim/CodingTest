import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class 다트게임 {

    static int solution(String result){
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int checkTen = 0;

        for(int i=0;i<result.length();i++){
            char a = result.charAt(i);
            if(a=='0'){
                if(checkTen==1) {
                    checkTen = 0;
                    continue;
                }
                else{
                    stack.push(0);
                }
            }
            if(a == '1'){
                if(result.charAt(i+1) == '0'){
                    stack.push(10);
                    checkTen = 1;
                }else{
                    stack.push(1);
                }

            }
            if(2<= a - '0' && a -'0' <=9){
                stack.push(a-'0');

            }

            if(a == 'S'){
                continue;
            }
            if(a == 'D'){
                int d = stack.pop();
                stack.push(d*d);
            }
            if(a == 'T'){
                int t = stack.pop();
                stack.push(t*t*t);
            }
            if(a=='*'){

                if(stack.size() == 1){
                    int b = stack.pop() * 2;
                    stack.push(b);
                }else{
                    int c = stack.pop()*2;
                    int d = stack.pop()*2;
                    stack.push(d);
                    stack.push(c);
                }
            }
            if(a=='#') {
                stack.push(stack.pop() * -1);
            }
        }

        while(!stack.empty()){
            sum += stack.pop();
        }

        return sum;
    }
    public static void main(String[] args){
        String result = "1S1S*2D#";
        System.out.println(solution(result));
    }
}
