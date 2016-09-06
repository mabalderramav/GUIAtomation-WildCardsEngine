package org.fundacionjala.ocurrencestring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AldoBalderrama on 9/2/2016.
 */
public class SearchEngine {
    final static String UNDERSCORE = "_";
    public static int find(String word, String text){
        String regWord = "\\Q" + word.replaceAll(UNDERSCORE, "\\\\E.\\\\Q") + "\\E";
        Matcher matcherWord = Pattern.compile(regWord).matcher(text);
        return matcherWord.find() ? matcherWord.start() : -1;
    }
}
