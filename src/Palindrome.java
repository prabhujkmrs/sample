public class Palindrome {

    public static void main(String [] args){

        System.out.println(isPalindrome("MADAM"));
        System.out.println(isPalin_Recursioin("ABCD"));
        System.out.println(isPalin("MADAM"));
    }

    private static boolean isPalindrome(String input){
        int len = input.length();
        int j = 0;
        int i = len -1;
        while(i > 0){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    private static boolean isPalin_Recursioin(String input){
        if(input.equals(""))
            return false;
        if(input.length() == 1)
            return true;
        if(input.charAt(0) != input.charAt(input.length() -1))
            return false;
        input = input.substring(1, input.length() -1);
        return isPalin_Recursioin(input);
    }

    private static boolean isPalin(String input){
        String reverse = new StringBuilder(input).reverse().toString();
        return input.equals(reverse);

    }
}
