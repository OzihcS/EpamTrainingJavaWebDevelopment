package ua.nure.piontkovskyi.Practice3.Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2 {

    public static String getMax(String input) {
        int min = Integer.MIN_VALUE;
        Pattern p = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(input.replaceAll("[:p{P}\\n\\d]+", ""));
        StringBuilder sb = new StringBuilder();
        sb.append("Max: ");
        while (m.find()) {
            Pattern p2 = Pattern.compile(m.group());
            Matcher m2 = p2.matcher(sb.toString().substring(5));
            if (min < m.group().length()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Max: ");
                min = m.group().length();
                sb2.append(m.group());
                sb = sb2;
            } else if (min == m.group().length() && !(m2.find())) {
                sb.append(", ").append(m.group());
            }
        }
        return sb.toString();
    }

    public static String getMin(String input) {
        int max = Integer.MAX_VALUE;
        Pattern p = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(input.replaceAll("[:p{P}\\n\\d]+", ""));
        StringBuilder sb = new StringBuilder();
        sb.append("Min: ");
        while(m.find()) {
            Pattern p2 = Pattern.compile(m.group());
            Matcher m2 = p2.matcher(sb.toString().substring(5));
            if (max > m.group().length()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Min: ");
                max = m.group().length();
                sb2.append(m.group());
                sb = sb2;
            } else if (max == m.group().length() && !(m2.find())) {
                sb.append(", ").append(m.group());
            }
        }
        return sb.toString();
    }
}