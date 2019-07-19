package com.michelfigueiredo.kata.micro.middle_character_extractor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author mfigueiredo
 */
class MiddleCharacterExtractorTest {


    @Test void
    can_create_object() {
        new MiddleCharacterExtractor("test");
    }

    @Test void
    can_extract_from_test() {
        MiddleCharacterExtractor test = new MiddleCharacterExtractor("test");
        String extracted = test.extractMiddle();
        assertEquals( extracted, "es");
    }


    @Test void
    can_extract_from_testing() {
        MiddleCharacterExtractor test = new MiddleCharacterExtractor("testing");
        String extracted = test.extractMiddle();
        assertEquals( extracted, "t");
    }

    @Test void
    can_extract_from_middle() {
        MiddleCharacterExtractor test = new MiddleCharacterExtractor("middle");
        String extracted = test.extractMiddle();
        assertEquals( extracted, "dd");
    }

    @Test void
    can_extract_from_A() {
        MiddleCharacterExtractor test = new MiddleCharacterExtractor("A");
        String extracted = test.extractMiddle();
        assertEquals( extracted, "A");
    }
}
