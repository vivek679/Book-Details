import java.util.Scanner;

public class TestBook{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter the Book name:");
        String bookName = sc.nextLine();
        System.out.println("Enter the price:");
        int bookPrice = sc.nextInt();
        System.out.println("Enter the Author name:");
        String authorName1 = sc.nextLine(); 
        //because the compiler is not abel to read the authorName,
        //so we have to write a dummy line.
        String authorName =sc.nextLine();
        //initilizing the variables of object Book
        book.setBookName(bookName);
        book.setBookPrice(bookPrice);
        book.setAuthorName(authorName);
        
        System.out.println("Book Details");
        
        System.out.println("Book Name :"+book.getBookName());
        System.out.println("Book Price :"+book.getBookPrice());
        System.out.println("Author Name :"+book.getAuthorName());
        
    }
}
