package TestNumber25;

import static TestNumber25.Label.*;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;

    TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
