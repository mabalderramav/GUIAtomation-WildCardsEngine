package org.fundacionjala.ocurrencestring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AldoBalderrama on 9/2/2016.
 */
public class SearchEngine {
    final static String UNDERSCORE;
    final static String BACKSLASH;
    final static String BACKSLASH_Q;
    final static String BACKSLASH_E;
    final static String DOT;

    static {
        BACKSLASH_E = "\\E";
        BACKSLASH_Q = "\\Q";
        UNDERSCORE = "_";
        BACKSLASH = "\\";
        DOT = ".";
    }

    public static int find(String word, String text) {
        String regWord = BACKSLASH_Q + word.replaceAll(UNDERSCORE,
                BACKSLASH + BACKSLASH_E + DOT + BACKSLASH + BACKSLASH_Q) + BACKSLASH_E;
        Matcher matcherWord = Pattern.compile(regWord).matcher(text);
        return matcherWord.find() ? matcherWord.start() : -1;
    }
}
