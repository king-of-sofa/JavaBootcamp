package lv.messages;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyser phrase = new PhraseAnalyser();
        phrase.analyseTest(phrase.analyse("Make America great again"));
        phrase.analyseTest(phrase.analyse("America great again"));
        phrase.analyseTest(phrase.analyse("America"));
    }
}
