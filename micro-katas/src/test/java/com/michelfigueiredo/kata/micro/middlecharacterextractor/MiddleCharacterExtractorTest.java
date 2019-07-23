package com.michelfigueiredo.kata.micro.middlecharacterextractor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author mfigueiredo
 */
class MiddleCharacterExtractorTest {

    @Test void
    can_extract_from_test() {
        String extracted = MiddleCharacterExtractor.extractMiddle("test");
        assertEquals( extracted, "es");
    }


    @Test void
    can_extract_from_testing() {

        String extracted = MiddleCharacterExtractor.extractMiddle("testing");
        assertEquals( extracted, "t");
    }

    @Test void
    can_extract_from_middle() {
        String extracted = MiddleCharacterExtractor.extractMiddle("middle");
        assertEquals( extracted, "dd");
    }

    @Test void
    can_extract_from_A() {
        String extracted = MiddleCharacterExtractor.extractMiddle("A");
        assertEquals( extracted, "A");
    }

    @Test void
    can_extract_from_odd() {
        String extracted = MiddleCharacterExtractor.extractMiddle("odd");
        assertEquals( "d", extracted);
    }
}
