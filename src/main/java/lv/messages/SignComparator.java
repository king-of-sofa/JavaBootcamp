package lv.messages;

public class SignComparator {

    public String compare(Integer number) {

        if (number == null) {
            return "Null";
        } else if(number > 0) {
            return "Number is positive";
        } else if(number < 0) {
            return "Number is negative";
        } else {
            return "Number is equal to zero";
        }

    }

    public void compareTest(String input) {

        if (input.contentEquals("Null")) {
            System.out.println("Test result: Null");
        } else if (input.contentEquals("Number is positive")) {
            System.out.println("Test result: Number is positive");
        } else if (input.contentEquals("Number is negative")) {
            System.out.println("Test result: Number is negative");
        } else if (input.contentEquals("Number is equal to zero")) {
            System.out.println("Test result: Number is equal to zero");
        } else {
            System.out.println("Test result: Test failed");
        }

    }
}
