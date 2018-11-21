import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacterCount {

    public static void main(String [] args){

        System.out.println(duplicateCharacterCount("aapple"));

    }

    public static Map duplicateCharacterCount(String str){
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i= 0; i < str.length();i++){
            char c=str.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                map.put(c,++count);
            }
            else{
                map.put(c,1);
            }
        }
        return map;
    }
}
