package TestNumber25;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        for (String value : getKeywords()) {
            if (text.contains(value)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
