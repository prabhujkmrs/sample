import java.util.ArrayList;

public class OddNumbers {

    public static void main(String[] args){

        System.out.println(oddNumbers(1,5).length);
    }

    /**
     * Odd numbers between l to r
     * @param l
     * @param r
     * @return
     */
    public static int[] oddNumbers(int l, int r) {

        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for(int i=l; i<=r; i++){
            if(i%2 == 1){
                resultList.add(i);
            }
        }

        int[] result = new int[resultList.size()];

        for(int j= 0; j < result.length; j++){
            result[j]=resultList.get(j);
        }

        return result;
    }

}
