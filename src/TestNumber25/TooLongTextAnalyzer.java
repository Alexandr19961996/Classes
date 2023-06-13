package TestNumber25;

import static TestNumber25.Label.*;

public class TooLongTextAnalyzer implements TextAnalyzer{

    private int maxLength;

    TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if(){
            return TOO_LONG;
        } else {
            return OK;
        };
    }
}
