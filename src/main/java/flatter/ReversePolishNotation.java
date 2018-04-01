package flatter;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReversePolishNotation {

    static private HashMap<String, Integer> priority = new HashMap()
    {{
        put("(", 0);
        put("+", 1);
        put("-", 1);
        put(")", 1);
        put("*", 2);
        put("/", 2);
        put("%", 2);
        put("^", 3);
        put("~", 4);
    }};

    public static String convertToPostfix(String quantification) {

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        List<String> infix = getInfixInSequence(quantification);

        for (String sign: infix) {

            //ALGORYTHM!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        }

        return postfix.toString();
    }

    private static List<String> getInfixInSequence(String quantification) {

        List<String> infix = new ArrayList<>();
        List<Integer> indexes = indexesOfNumbers(quantification);

        infix.add(quantification.substring(0,indexes.get(0)));

        for (int i=0; i<indexes.size()-1; i++) {
            int startIndex = indexes.get(i);
            int endIndex = indexes.get(i+1);
            infix.add(quantification.substring(startIndex, endIndex));
        }

        infix.add(quantification.substring(indexes.get(indexes.size()-1)));

        return infix;
    }

    private static List<Integer> indexesOfNumbers(String quantification) {

        List<Integer> indexes = new ArrayList<>();
        Matcher numbers = Pattern.compile("\\d+").matcher(quantification);

        while (numbers.find()) {

            indexes.add(numbers.regionStart());
            indexes.add(numbers.regionEnd());
        }
        return indexes;
    }
}
