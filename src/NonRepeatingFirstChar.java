import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingFirstChar {

    public static void main(String[] args){

        System.out.println(nonRepeatingFirstChar("XaapplleeY"));
    }

    public static String nonRepeatingFirstChar(String input){

        int len = input.length();
        char [] letter = input.toCharArray();
        Map<Character,Integer> c = new LinkedHashMap<>(); //maintains insertion order
        for (int i=0; i<len; i++){
            if(!c.containsKey(letter[i])){
                c.put(letter[i],1);
            }
            else {
                c.put(letter[i], c.get(letter[i]) + 1);
            }
        }
        // return the key which has got 1 as value
        for(Map.Entry<Character,Integer> entry : c.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey().toString();
            }
        }
        return "no duplicate";
    }
}
