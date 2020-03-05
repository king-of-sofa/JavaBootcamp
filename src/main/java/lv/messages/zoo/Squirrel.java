package lv.messages.zoo;

public class Squirrel extends Animal implements Walker {
    public Squirrel(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println("Squirrel is breathing");
    }

    @Override
    public void walk() {
        System.out.println("Squirell is walking");
    }
}
