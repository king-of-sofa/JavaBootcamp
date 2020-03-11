package lv.messages.zoo;

import java.util.*;

public class AnimalUtils {

    public static List<Animal> getStartsWith(List<Animal> animals, String startsWith) {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getName().startsWith(startsWith)) {
                result.add(animal);
            }
        }
        return result;
    }


    public static List<Animal> getFishes(List<Animal> animals) {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Fish) {
                result.add(animal);
            }
        }
        return result;
    }

    public static void makeThemTalk(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Talker) {
                Talker talker = (Talker) animals[i];
                talker.talk();
            }
        }
    }

    public static Map<String, List<Animal>> mapByFirstLetter(List<Animal> animals) {
        Map<String, List<Animal>> result = new HashMap<>();
        for (Animal animal : animals) {
            String firstLetter = animal.getName().substring(0, 1);
            firstLetter = firstLetter.toLowerCase();
            List<Animal> animalList = result.get(firstLetter);
            if (animalList == null) {
                animalList = new LinkedList<>();
                animalList.add(animal);
                result.put(firstLetter, animalList);
            } else {
                animalList.add(animal);
            }
        }

        return result;
    }

//    public static List<Animal> getFishes (List<Animal> animals){
//        List<Animal> result = new ArrayList<>();
//        for (Animal animal : animals){
//
//        }
//
//    }

}
