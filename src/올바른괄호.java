import java.util.Stack;

public class 올바른괄호 {

    static boolean solution(String arr){
        boolean answer = false;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i) == '(')
                stack.push('(');
            else{
                if(stack.empty())
                    return false;
                stack.pop();
            }
        }
        if(stack.empty()){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
    public static void main(String[] args){

    }

}
