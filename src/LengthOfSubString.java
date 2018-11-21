import java.util.Arrays;
import java.util.List;

public class LengthOfSubString {

    public static void main(String[] args){

        System.out.println(lengthOfSub(Arrays.asList(1,2,3,1,2)));

    }

    /**
     * Write a function to find the length of the largest sub-sequence of increasing integers in a list e.g.
     * [1, 2, 3] -> 3
     * [1, 2, 3, -4] -> 3
     * [1, 2, 1, 2, 3] -> 3
     * [1, 2, 3, 1, 2] -> 3
     *
     * @param input
     * @return
     */
    public static Integer lengthOfSub(List<Integer> input) {

        int count = 1, max = 1;

        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) >= input.get(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

}
