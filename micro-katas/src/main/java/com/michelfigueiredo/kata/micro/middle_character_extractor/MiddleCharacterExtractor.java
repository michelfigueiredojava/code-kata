package com.michelfigueiredo.kata.micro.middle_character_extractor;

public class MiddleCharacterExtractor {

    public static String extractMiddle(String word) {
        int middleIndex = (int)Math.floor( word.length()/2 );
        if( word.length() % 2 == 0 ){ //even
            return word.substring( middleIndex-1, middleIndex+1);
        }else{ //odd
            return word.substring( middleIndex, middleIndex+1 );
        }
    }
}
