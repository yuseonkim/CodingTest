public class 비밀지도 {


    static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] StrArr1 = new String[n];
        String[] StrArr2 = new String[n];
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            StrArr1[i] = String.format("%"+n+"s",Integer.toBinaryString(arr1[i]).replace(" ","0"));
            StrArr2[i] = String.format("%"+n+"s",Integer.toBinaryString(arr2[i]).replace(" ","0"));
        }
        for(int i=0;i<n;i++){
            String k ="";
            for(int j=0;j<n;j++){

                if(String.valueOf(StrArr1[i].charAt(j)).equals("1") && String.valueOf(StrArr2[i].charAt(j)).equals("1")){
                 k =   k.concat("#");
                }else{
                   k=  k.concat(" ");
                }
            }
            answer[i] = k;
        }

        return answer;

    }
    public static void main(String[] args){
        int a = 3;
        System.out.println(String.format("%"+5+"s",Integer.toBinaryString(3)).replace(" ","0"));
//        System.out.println(String.format("%16s", Integer.toBinaryString(word)).replace(" ", "0"))
    }
}
