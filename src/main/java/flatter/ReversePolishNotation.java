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

    private static String operatorRegex = "[\\+\\-\\*\\^/%~]";

    public static String convertToPostfix(String quantification) {


        Stack<String> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        List<String> infix = getInfixInSequence(quantification);

        for (String sign: infix) {

            if (sign.matches("\\d+")) {
                postfix.append(sign);
                postfix.append(" ");
            }
            if (sign.equals("(")) stack.push(sign);
            if (sign.equals(")")) {
                while (!stack.peek().equals("(")) {
                    postfix.append(stack.pop());
                    postfix.append(" ");
                }
                stack.pop();
            }
            if (sign.matches(operatorRegex)) {
                if (!stack.isEmpty()) {
                    for (String signOnStack : stack) {
                        if (priority.get(signOnStack) > priority.get(sign)) {
                            while (!stack.peek().equals("(") && !stack.isEmpty()) {
                                postfix.append(stack.pop());
                                postfix.append(" ");
                            }
                            if (!stack.isEmpty()) stack.pop();
                        }
                        if (signOnStack.equals("(")) break;
                    }
                }
                stack.push(sign);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek().equals("(")) stack.pop();
            else {
                postfix.append(stack.pop());
            }
        }

        return postfix.toString();
    }

    private static List<String> getInfixInSequence(String quantification) {

        List<String> infix = new ArrayList<>();
        String regex = "(" + "\\d+" + ")" + "|" +  "(" + "[\\+\\-\\(\\)\\*\\^/%~]" + ")";
        Matcher numeric = Pattern.compile(regex).matcher(quantification);

        while (numeric.find()) {
            infix.add(numeric.group());
        }

        return infix;
    }
}
