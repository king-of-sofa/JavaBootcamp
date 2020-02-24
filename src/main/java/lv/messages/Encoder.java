package lv.messages;

public class Encoder {
     static void encode(int input){
        int rawInput = input;
        char castedInput = (char) input;
        System.out.println(rawInput + " -> " + castedInput);
    }

    static void decode(char input){
        char rawInput = input;
        short castedInput = (short) input;
        System.out.println(rawInput + " -> " + castedInput);
    }
}
