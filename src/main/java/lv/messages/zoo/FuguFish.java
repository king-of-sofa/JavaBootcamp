package lv.messages.zoo;

public class FuguFish extends Fish {

    private static int counter = 0;

    public FuguFish(String name) {
        super(name);
        counter++;
    }
}
