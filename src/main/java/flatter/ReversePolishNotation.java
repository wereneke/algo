package flatter;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReversePolishNotation {

    private static StringBuffer sb = new StringBuffer();

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

        sb.setLength(0);
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        List<String> infix = getInfixInSequence(quantification);

        for (String sign: infix) {

            if (sign.matches("\\d+")) sb.append(sign);

        }

        return postfix.toString();
    }

    public static List<String> getInfixInSequence(String quantification) {

        List<String> infix = new ArrayList<>();
        String regex = "(" + "\\d+" + ")" + "|" +  "(" + "[\\+\\-\\(\\)\\*\\^/%~]" + ")";
        Matcher numeric = Pattern.compile(regex).matcher(quantification);

        while (numeric.find()) {
            infix.add(numeric.group());
        }

        return infix;
    }
}
