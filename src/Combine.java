import java.util.ArrayList;
import java.util.List;

public class Combine {

    private static List<String> alpha = new ArrayList<>();
    private static List<Integer> num = new ArrayList<>();

    public static void main(String[] args) {
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");

        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(combine());
    }

    /**
     * combine 2 list of different data type
     * @return result
     */
    private static Object combine() {

        List<Object> result = new ArrayList<>();
        for (int i = 0; i < alpha.size(); i++) {
            result.add(alpha.get(i));
            result.add(num.get(i));
        }
        return result;
    }

}
