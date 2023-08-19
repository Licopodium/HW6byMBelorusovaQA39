public class MainBook {

    public static void main(String[] args) {


        Book book1 = new Book()
                .withTitle("The Catcher in the Rye")
                .withAuthor("J.D. Salinger")
                .withpublicationYear(1951)
                .withPrice(12.99);

        Book book2 = new Book()
                .withTitle("To Kill a Mockingbird")
                .withAuthor("Harper Lee")
                .withpublicationYear(1000)
                .withPrice(10.99)
                .withpageQuantity(320);

       Book book3 = new Book()
               .withTitle("The Great Gatsby")
               .withAuthor("F. Scott Fitzgerald")
               .withpublicationYear(1925)
               .withPrice(11.99)
               .withpageQuantity(250)
                .withQuantityInStock(-10);


        // You can access and manipulate the fields like this:
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor() + ", Published in " + book1.getPublicationYear() + ", Price: $" + book1.getPrice());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor() + ", Published in " + book2.getPublicationYear() + ", Price: $" + book2.getPrice() + ", Page Quantity: " + book2.getPageQuantity());
        System.out.println("Book 3: " + book3.getTitle() + " by " + book3.getAuthor() + ", Published in " + book3.getPublicationYear() + ", Price: $" + book3.getPrice() +  ", Page Quantity: " + book3.getPageQuantity() + ", Quantity In Stock: " + book3.getQuantityInStock());




    }
}
