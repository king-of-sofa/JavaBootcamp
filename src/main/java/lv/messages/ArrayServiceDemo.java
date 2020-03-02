package lv.messages;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService arrayServiceTest = new ArrayService();
        int[] testArray = arrayServiceTest.create(100);
        arrayServiceTest.fillRandomly(testArray);
        arrayServiceTest.printArray(testArray);
        System.out.println(arrayServiceTest.sum(testArray));
        System.out.println(arrayServiceTest.avg(testArray));
    }
}
