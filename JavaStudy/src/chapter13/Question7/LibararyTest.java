package chapter13.Question7;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String name;
    private int pirce;

    public Book(String name, int pirce) {
        this.name = name;
        this.pirce = pirce;
    }

    public String getName() {
        return name;
    }

    public int getPirce() {
        return pirce;
    }
}


public class LibararyTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

        int totalSum = bookList.stream().mapToInt(c -> c.getPirce()).sum();
        System.out.println(totalSum);

        System.out.println();
        bookList.stream().filter(book -> book.getPirce() >= 20000)
                .map(b -> b.getName()).sorted()
                .forEach(s -> System.out.println(s));


    }
}
