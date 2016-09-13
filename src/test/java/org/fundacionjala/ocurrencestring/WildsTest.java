package org.fundacionjala.ocurrencestring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link WildsTest}
 */
public class WildsTest {
    private final static String HAYSTACK = "Once upon a midnight dreary, while I pondered, weak and weary";

    @Test
    public void normalSearchTest_WhenWordIsOnce() {
        final int expected = 0;
        final String word = "Once";
        assertEquals(expected, SearchEngine.find(word, HAYSTACK));
    }

    @Test
    public void normalSearchTest_WhenWordIsMidnight() {
        final int expected = 12;
        final String word = "midnight";
        assertEquals(expected, SearchEngine.find(word, HAYSTACK));
    }

    @Test
    public void normalSearchTest_WhenWordIsCodeWars() {
        final int expected = -1;
        final String word = "codeWars";
        assertEquals(expected, SearchEngine.find(word, HAYSTACK));
    }

    @Test
    public void wildSearchTest_WhenWordIs_po_(){
        final int expected = 5;
        final String word = "_po_";
        assertEquals(expected, SearchEngine.find(word, HAYSTACK));
    }
    @Test
    public void wildSearchTest_WhenWordIs___night(){
        final int expected = 12;
        final String word = "___night";
        assertEquals(expected, SearchEngine.find(word, HAYSTACK));
    }

}
