package TestNumber25;

import static TestNumber25.Label.NEGATIVE_TEXT;
import static TestNumber25.Label.OK;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    @Override
    public Label processText(String text) {

        return null;
    }

    @Override
    protected String[] getKeywords() {

        return new String[0];
    }

    @Override
    protected Label getLabel() {
        if(getKeywords() != null){
            return NEGATIVE_TEXT;
        } else {
            return OK;
        }
    }
}
