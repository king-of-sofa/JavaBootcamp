package lv.messages;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayService {
    public int[] create(int size){
        int[] newArray = new int[size];
        return newArray;
    }

    public void fillRandomly(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++){

            int boundedRandomValue = ThreadLocalRandom.current().nextInt(0, 100);
            Array.set(inputArray, i , boundedRandomValue);
        }
    }

    void printArray(int[] inputArray){
        for (int value: inputArray) {
            System.out.println("Value: " + value);
        }

    }

    public int sum(int[] inputArray) {
       return  Arrays.stream(inputArray).sum();

    }

    public double avg(int[] inputArray) {
        return Arrays.stream(inputArray).average().orElse(Double.NaN);
    }
}
