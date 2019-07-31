class Solution {

    private static final String SPACE_SEPARATOR = " ";
    public static final String REGEX_NO_SPECIAL_CHARACTERES = "[^a-zA-Z0-9\\s]";

    /**
     * Given two words returns the shortest distance between their two midpoints in number of characters
     * Words can appear multiple times in any order and should be case insensitive.
     */
    static double shortestDistance(String document, String word1, String word2) {
        String[] words = document.split(SPACE_SEPARATOR);

        int index = 0;
        double shortestLocation = document.length();
        double word1Location = 0;
        double word2Location;

        for (String word : words) {
            String cleanedWord = word.replaceAll(REGEX_NO_SPECIAL_CHARACTERES, "");
            if (cleanedWord.equalsIgnoreCase(word1)) {
                word1Location = getWordMiddleLocation(index, cleanedWord);
            } else if (word1Location != 0 && cleanedWord.equalsIgnoreCase(word2)) {
                word2Location = getWordMiddleLocation(index, cleanedWord);

                double currentLocation = word2Location - word1Location;
                shortestLocation = Math.min(currentLocation, shortestLocation);
                word1Location = 0;
            }

            index = index + word.length() + SPACE_SEPARATOR.length();
        }

        return shortestLocation == document.length() ? -1 : shortestLocation;
    }

    private static double getWordMiddleLocation(int index, String word) {
        return index + (word.length() / 2d);
    }


}
