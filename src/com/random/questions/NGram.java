package com.random.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class NGram {

    private String dictionary = "Mary had a little lamb its fleece was white as snow;\n" +
            "And everywhere that Mary went, the lamb was sure to go.\n" +
            "It followed her to school one day, which was against the rule;\n" +
            "It made the children laugh and play, to see a lamb at school.\n" +
            "And so the teacher turned it out, but still it lingered near,\n" +
            "And waited patiently about till Mary did appear.\n" +
            "\"Why does the lamb love Mary so?\" the eager children cry;\"Why, Mary loves the lamb, you know\" the teacher did reply.\"";

    private static double totalOccurrence = 0.0;

    public static void main(String[] args) throws IOException {

        NGram nGram = new NGram();
        String dictionary = nGram.dictionary.replaceAll(",","");
        dictionary = dictionary.replaceAll(";\n"," ");
        //String dictionary = "ONE TWO ONE TWO THREE TWO THREE";

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        String line;
        while ((line = in.readLine()) != null) {
            String [] token = line.split(",");
            //int length = Integer.parseInt(token[0].trim());
            String inputWord = token[1].trim();
            Map<String, Double> predictions = getPredictionsResults(inputWord, dictionary);
            StringBuilder output = new StringBuilder();
            for(Map.Entry<String, Double> entry : sort(predictions).entrySet()){
                output.append(entry.getKey()).append(",").append(String.format("%.3f",entry.getValue())).append(";");
            }
            System.out.print(output.substring(0,output.length()-1));
        }
    }

    private static Map<String, Double> sort(Map<String,Double> predictions){
        return predictions.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    private static Map<String, Double> getPredictionsResults(String input, String dictionary) {
        List<String> wordsList = dictionaryAsList(dictionary);
        Map<String, Double> wordsCount = getCountOfWords(input,wordsList);
        Map<String, Double> predictionResults = calculatePredictions(wordsCount);
        return predictionResults;
    }

    private static Map<String,Double> calculatePredictions(Map<String,Double> wordsCount) {
        for(Map.Entry<String, Double> entry : wordsCount.entrySet()){
            wordsCount.put(entry.getKey(), (entry.getValue()/totalOccurrence));
        }
        return wordsCount;
    }

    private static Map<String, Double> getCountOfWords(String input, List<String> wordsList){
        Map<String, Double> resultMap = new TreeMap<>();
        for (int i = 0; i < wordsList.size(); i++) {
            if (wordsList.get(i).equals(input)) {
                totalOccurrence++;
                if (!resultMap.containsKey(wordsList.get(i + 1))) {
                    resultMap.put(wordsList.get(i + 1), 1.0);
                } else {
                    Double count = resultMap.get(wordsList.get(i + 1));
                    resultMap.put(wordsList.get(i + 1), ++count);
                }
            }
        }
        return resultMap;
    }

    private static List<String> dictionaryAsList(String dictionary){
        List<String> wordsList = new ArrayList<>();
        String[] str = dictionary.split(" ");
        wordsList.addAll(Arrays.asList(str));
        return wordsList;
    }

}


// provide support for more than one char
// handle exceptions