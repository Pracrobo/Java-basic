package construct.sol;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo(book1);

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo(book1);

        Book book3 = new Book("JPA 프로그래밍" , "kim" , 700);
        book3.displayInfo(book1);

    }
}
