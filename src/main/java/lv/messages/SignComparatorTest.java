package lv.messages;

public class SignComparatorTest {

    public static void main(String[] args) {
        SignComparator sign = new SignComparator();
        sign.compareTest(sign.compare(1));
        sign.compareTest(sign.compare(-1));
        sign.compareTest(sign.compare(0));
        sign.compareTest(sign.compare(null));
    }

}
