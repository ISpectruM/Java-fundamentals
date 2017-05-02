package Exam_Retake_August_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class D_AshesOfRoses {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Long> totalRosesByRegion = new TreeMap<>();
        Map<String,Map<String,Long>> regions = new HashMap<>();

        String input;
        while (!"Icarus, Ignite!".equals(input=reader.readLine())){
            String inputRegex = "(^Grow)(\\s{1})<{1}(?<region>[A-z]{1}[a-z]+)>{1}(\\s{1}(<{1})(?<color>[A-Za-z0-9]+)>{1})\\s{1}(?<roses>\\d+)\\b(?!,|.)";
            Pattern inputPattern = Pattern.compile(inputRegex);
            Matcher inputMatcher = inputPattern.matcher(input);

            if (inputMatcher.find()){
                String regionName = inputMatcher.group("region");
                String colorName = inputMatcher.group("color");
                Long roseCount = Long.parseLong(inputMatcher.group("roses"));

                if (!totalRosesByRegion.containsKey(regionName)){
                    totalRosesByRegion.put(regionName,roseCount);
                    regions.put(regionName,new TreeMap<>());
                    regions.get(regionName).put(colorName,roseCount);
                } else {
                    Long currRoses = totalRosesByRegion.get(regionName);
                    totalRosesByRegion.put(regionName,roseCount+currRoses);

                    if (!regions.get(regionName).containsKey(colorName)){
                        regions.get(regionName).put(colorName,roseCount);
                    } else {
                        Long availableRoses = regions.get(regionName).get(colorName);
                        regions.get(regionName).put(colorName,availableRoses+roseCount);
                    }
                }
            }
        }

        Map<String, Long> sortedByValue = totalRosesByRegion.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        StringBuilder result = new StringBuilder();
        for (String region : sortedByValue.keySet()) {
            result.append(region).append(System.lineSeparator());

            if(regions.get(region).size()>1){
                Map<String, Long> colorsByValue = regions.get(region).entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (
                                        e1, e2) -> e1, LinkedHashMap::new));
                for (String currColor : colorsByValue.keySet()) {
                    result.append("*--")
                            .append(currColor).append(" | ")
                            .append(colorsByValue.get(currColor))
                            .append(System.lineSeparator());
                }
            } else {
                for (String color : regions.get(region).keySet()) {
                    result.append("*--")
                            .append(color).append(" | ")
                            .append(regions.get(region).get(color))
                            .append(System.lineSeparator());
                }
            }
        }
        System.out.println(result);
    }
}
