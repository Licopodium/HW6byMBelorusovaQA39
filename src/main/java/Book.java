public class Book {

        private String title;
        private String author;
        private int publicationYear;
        private double price;
        private int pageQuantity;
        private int QuantityInStock;


    public Book() {
            this(null, null, 0, 0.0, 0, 0);
        }

    public Book(String title, String author, int publicationYear, double price, int pageQuantity, int QuantityInStock) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
            this.price = price;
            this.pageQuantity = pageQuantity;
            this.QuantityInStock = QuantityInStock;
        }

    public void setTitle(String title) {
        this.title = title;
    }
    public Book withTitle(String title) {
        if (title == null) {
            return this;
        }
        this.title = title;
        return this;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Book withAuthor(String author ) {
        if (author == null) {
            return this;
        }
        this.author = author;
        return this;
    }

    public void setpublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public Book withpublicationYear(int Year) {
        if(Year < 1455) return this;
        this.publicationYear = Year;
        return this;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book withPrice(double price) {
        if(price <= 0) return this;
        this.price = price;
        return this;
    }

    public void setpageQuantity(int pageQuantity) {
        this.price = price;
    }

    public Book withpageQuantity(int pageQuantity) {
        if(pageQuantity <= 0) return this;
        this.pageQuantity = pageQuantity;
        return this;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.QuantityInStock = quantityInStock;
    }
    public Book withQuantityInStock(int quantityInStock) {
        if(quantityInStock < 0) return this;
        this.QuantityInStock = quantityInStock;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public int getQuantityInStock() {
        return QuantityInStock;
    }

    @Override
    public String toString() {
            return "Book{" +
                    "title='" + title +
                    ", author='" + author +
                    ", publicationYear=" + publicationYear +
                    ", price=" + price +
                    ", pageQuantity=" + pageQuantity +
                    ", QuantityInStock=" + QuantityInStock +
                    '}';
    }
}

