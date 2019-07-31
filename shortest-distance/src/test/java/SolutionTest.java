import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static final String _short_document = "This is a sample just document we just made up";
    private static final String _document;

    static {
        StringBuffer sb = new StringBuffer();
        sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
        sb.append(" of a document or visual presentation. Replacing meaningful content that could be distracting with placeholder text");
        sb.append(" may allow viewers to focus on graphic aspects such as font, typography, and page layout. It also reduces the need");
        sb.append(" for the designer to come up with meaningful text, as they can instead use hastily generated lorem ipsum text. The");
        sb.append(" lorem ipsum text is typically a scrambled section of De finibus bonorum et malorum, a 1st-century BC Latin text by");
        sb.append(" Cicero, with words altered, added, and removed to make it nonsensical, improper Latin. A variation of the ordinary");
        sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
        sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");
        sb.append(" employed it in graphics and word processing templates for its desktop publishing program, PageMaker, for the Apple");
        sb.append(" Macintosh. A common form of lorem ipsum reads: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do");
        sb.append(" eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation");
        sb.append(" ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit");
        sb.append(" esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui");
        sb.append(" officia deserunt mollit anim id est laborum.");

        _document = sb.toString();
    }

    @Test
    void given_short_document_find_middle_of_the_words_we_just() {
        assertEquals(4d, Solution.shortestDistance(_short_document, "we", "just"));
    }

    @Test
    void given_short_document_find_middle_of_the_words_is_a() {
        assertEquals(2.5, Solution.shortestDistance(_short_document, "is", "a"));
    }

    @Test
    void given_short_document_find_middle_of_the_words_is_not() {
        assertEquals(-1d, Solution.shortestDistance(_short_document, "is", "not"));
    }

    @Test
    void given_long_document_find_middle_of_the_words_and_graphic() {
        assertEquals(6d, Solution.shortestDistance(_document, "and", "graphic"));
    }

    @Test
    void given_long_document_find_middle_of_the_words_transfer_it() {
        assertEquals(14d, Solution.shortestDistance(_document, "transfer", "it"));
    }

    @Test
    void given_long_document_find_middle_of_the_words_layout_It() {
        assertEquals(6d, Solution.shortestDistance(_document, "layout", "It"));
    }

    @Test
    void given_long_document_find_middle_of_the_words_Design_filler() {
        assertEquals(25d, Solution.shortestDistance(_document, "Design", "filler"));
    }

    @Test
    void given_long_document_find_middle_of_the_words_of_lorem() {
        assertTrue(Math.abs(Solution.shortestDistance(_document, "of", "lorem") - 4.5) < 0.000001);
    }

    @Test
    void given_long_document_find_middle_of_the_words_thiswordisnotthere_lorem() {
        assertEquals(-1d, Solution.shortestDistance(_document, "thiswordisnotthere", "lorem"));
    }


}
