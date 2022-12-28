package hatalikodlar;

public class Book {
    int pages;
    static String author;

    public void set (int pages){
        this.pages=pages;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.set(500);
        b1.author="Christopher";
        System.out.println(b1.author);
        Book b2 = new Book();
        System.out.println(b2.author);

        Book b3 = new Book();

        System.out.print(b1.author.equals(b2.author)+" ");
        System.out.print(b1.pages==b2.pages);

    }
}
