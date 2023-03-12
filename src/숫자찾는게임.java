public class 숫자찾는게임 {

    static int solution(String s){
       s = s.replaceAll("one","1");
        s = s.replaceAll("zero","0");
        s = s.replaceAll("two","2");
        s = s.replaceAll("three","3");
        s = s.replaceAll("four","4");
        s = s.replaceAll("five","5");
        s = s.replaceAll("six","6");
        s = s.replaceAll("seven","7");
        s = s.replaceAll("eight","8");
        s = s.replaceAll("nie","9");

        return Integer.parseInt(s);

    }
    public static void main(String[] args){

    }
}
