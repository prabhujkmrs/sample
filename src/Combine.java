import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class Combine {

    private static List<String> alpha = new ArrayList<String>();
    private static List<Integer> num = new ArrayList<Integer>();

    public static void main(String[] args) {
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");

        num.add(1);
        num.add(2);
        num.add(3);
        combine();
    }

    /**
     * combine 2 list of different data type
     * @return
     */
    public static Object combine() {

        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < alpha.size(); i++) {
            result.add(alpha.get(i));
            result.add(num.get(i));
        }
        return result;
    }

}
