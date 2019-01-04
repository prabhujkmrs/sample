import java.util.*;

public class PopularDestinations {


    public static void main(String [] args) {

        List<String> input = Arrays.asList("Bar","Mai","Bar","Mai","Mai","Bar");
        System.out.println(popular_destinations(input));
    }

    private static Map popular_destinations(List<String> countries) {

        Map<String, Integer> destinationMap = new HashMap<>();
        for (String country: countries) {
            if(!destinationMap.containsKey(country)) {
                destinationMap.put(country, 1);
            }
            else {
                int c = destinationMap.get(country);
                destinationMap.put(country, c+1);
            }
        }
        Map<Integer,List<String>> resultMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry : destinationMap.entrySet()){
                if(!resultMap.containsKey(entry.getValue())){
                    resultMap.put(entry.getValue(),new ArrayList<>());
                }
                     resultMap.get(entry.getValue()).add(entry.getKey());
        }
        return resultMap;
    }
}
