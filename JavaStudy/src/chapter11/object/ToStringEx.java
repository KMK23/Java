package chapter11.object;

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }
}


public class ToStringEx {
    public static void main(String[] args) {

        Book book = new Book("두잇자바", "은종님");
        System.out.println(book);
        System.out.println(book.toString());

        String str = new String("test");
        System.out.println(str);

    }
}
