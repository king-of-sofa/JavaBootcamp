package lv.messages;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberService numserv = new NumberService();
        System.out.println(numserv.rangeSum(3,7));
        System.out.println(numserv.rangeEvenCount(2,8));
    }
}
