package lv.messages;

public class BookTest {
    public static void main(String[] args) {
        Book bookOne = new Book("Vasja", "qwerty", 20);
        Book bookTwo = new Book("Lenja", "ytrewq", 10);

        System.out.println(bookOne.toString());
        System.out.println(bookTwo.toString());

        if(bookOne.equals(bookTwo)){
            System.out.println("Book one is equal book two");
        } else {
            System.out.println("Book one is NOT equal book two");
        }

        bookTwo.setAuthor("Vasja");
        bookTwo.setTitle("qwerty");

        if(bookOne.equals(bookTwo)){
            System.out.println("Book one is equal book two");
        } else {
            System.out.println("Book one is NOT equal book two");
        }

    }
}
