public class 카드뭉치 {

        public static String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "";
            int indexCount1 = 0;
            int max1 = cards1.length;
            int indexCount2= 0;
            int max2 = cards2.length;

            for(String str : goal){
                if(indexCount1 != max1){
                    if(str.equals(cards1[indexCount1])){
                        indexCount1++;
                        System.out.println(indexCount1);
                        continue;
                    }
                }
                if(indexCount2 != max2){
                    if(str.equals(cards2[indexCount2])){
                        indexCount2++;
                        System.out.println(indexCount2);
                        continue;
                    }
                }

                return "No";
            }
            return "Yes";
        }

    public static void main(String[] args){
            String[] cards1 = {"i", "drink", "water"};
            String[] cards2 = {"want", "to"};
            String[] answer = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1,cards2,answer));
    }
}
