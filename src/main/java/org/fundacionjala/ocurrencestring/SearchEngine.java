package org.fundacionjala.ocurrencestring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AldoBalderrama on 9/2/2016.
 */
public class SearchEngine {
    private final static String UNDERSCORE = "_";
    private final static String BACKSLASH = "\\";
    private final static String BACKSLASH_Q = "\\Q";
    private final static String BACKSLASH_E = "\\E";
    private final static String DOT = ".";

    public static int find(String word, String text) {
        String regWord = BACKSLASH_Q.concat(word.replaceAll(UNDERSCORE, BACKSLASH.concat(BACKSLASH_E)
                        .concat(DOT).concat(BACKSLASH).concat(BACKSLASH_Q))).concat(BACKSLASH_E);
        Matcher matcherWord = Pattern.compile(regWord).matcher(text);
        return matcherWord.find() ? matcherWord.start() : -1;
    }
}
