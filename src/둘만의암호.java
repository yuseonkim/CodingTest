public class 둘만의암호 {

    public StringBuilder solution(String s, String skip, int index) {
        String arr = "abcdefghijklnmopqrstuvwxyz";
        for(int i=0;i<skip.length();i++){
            arr = arr.replaceAll(String.valueOf(skip.charAt(i)),"");
        }
        arr = arr + arr;
        arr = arr + arr;
        System.out.println(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            for(int j=0;j<arr.length();j++){
                if(a == arr.charAt(j)) {
                    sb.append(arr.charAt(j + index));
                    System.out.println(sb);
                    break;
                }
            }
        }

        return sb;
    }
    public static void main(String[] args){
        둘만의암호 a = new 둘만의암호();
        a.solution("z",	"abcdefghij",	1);
    }
}
