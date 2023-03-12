public class 전화번호 {

    static StringBuilder solution(String a){
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        for(int i=0;i<a.length()-4;i++){
            sb.replace(i,i+1,"*");
        }

        return sb;
    }
    public static void main(String[] args){
        System.out.println(solution("51234"));
    }
}
