package lv.messages;

public class PhraseAnalyser {

    public String analyse(String text) {

        if (text.startsWith("Make") && text.endsWith("great again")){
            return "It stands no chance";
        }
        else if (text.startsWith("Make") || text.endsWith("great again")){
            return "It could be worse";
        }
        else {
            return "It is fine, really";
        }

    }


    public void analyseTest(String text) {

        if (text.equals("It stands no chance")) {
            System.out.println("Test: It stands no chance");
        }
        else if(text.equals("It could be worse")){
            System.out.println("Test: It could be worse");
        }
        else {
            System.out.println("Test: It is fine, really");
        }
    }
}
