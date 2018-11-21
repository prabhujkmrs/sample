import java.util.ArrayList;
import java.util.List;

public class MinMax {

    public static void main(String [] args){

        List<Double> values = new ArrayList<>();
        values.add(1.2);
        values.add(2.0);
        values.add(3.5);
        minmax(values);
    }

    public static double[] minmax(List<Double> values) {
        if (values.size() == 0) {
            return new double[2];
        }
        double min = values.get(0);
        double max = min;
        int length = values.size();
        for (int i = 1; i < length; i++) {
            double value = values.get(i);
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        return new double[] { min, max };
    }

}
