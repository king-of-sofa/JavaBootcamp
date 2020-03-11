package lv.messages.zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fish fish1 = new Fish("riba1");
        Fish fish2 = new Fish("riba2");
        Dog dog = new Dog("dog1");
        FlyingFish flyingFish = new FlyingFish("flying riba");
        System.out.println(Fish.getFishCount());
        System.out.println(Animal.getAnimalCount());

        List<Animal> animals = new ArrayList<>();
        animals.add(fish1);
        animals.add(fish2);
        animals.add(dog);
        animals.add(flyingFish);


        AnimalUtils.getStartsWith(animals, "ri");
        //AnimalUtils.makeThemTalk(animals);
    }

}
