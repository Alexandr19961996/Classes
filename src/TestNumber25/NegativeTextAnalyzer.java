package TestNumber25;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    @Override
    public Label processText(String text) {
        for (String value : getKeywords()) {
            if (text.contains(value)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
