package TestNumber25;

public class Test {
    public static void main(String[] args) {
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 40;
        TextAnalyzer[] textAnalyzers1 = {
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        String text = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";
        System.out.println(checkLabels(textAnalyzers1, text));
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer textAnalyzer : analyzers) {
            if (textAnalyzer.processText(text) != Label.OK) {
                return textAnalyzer.processText(text);
            }
        }
        return Label.OK;
    }
}
