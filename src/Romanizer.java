public class Romanizer {

    public static void main(String [] args){

        int size[] = {0,1,2,3,2,1,2,3,4,2};
        System.out.println(romanizer(size));

    }

    /**
     * Romainzer
     * @param numbers
     * @return
     */

    public static String[] romanizer(int[] numbers) {
        String result = "";
        String hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String ones[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        //int size[] = {0,1,2,3,2,1,2,3,4,2};
        String[] resultSet = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            while (value >= 1000) {
                result = result + 'M';
                value = value - 1000;
            }
            result = result + hundreds[value / 100];
            value = value % 100;
            result = result + tens[value / 10];
            value = value % 10;
            result = result + ones[value];
            resultSet[i] = result;
            result = "";
        }
        return resultSet;
    }


}
