import java.util.Arrays;

public class Book{
    private int id;
    private String [] authors;
    private String publisher;
    private int year;
    private int countOfPages;
    private double price;
    private String typeOfCover;

    public Book(int id, String[] authors, String publisher, int year, int countOfPages, double price, String typeOfCover) {
        this.id = id;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.countOfPages = countOfPages;
        this.price = price;
        this.typeOfCover = typeOfCover;
    }

    public int getId() {
        return id;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    @Override
    public String toString() {
        return "Book:" +
                "id=" + id +
                ", authors=" + Arrays.toString(authors) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", countOfPages=" + countOfPages +
                ", price=" + price +
                ", typeOfCover='" + typeOfCover + '\'';
    }
}
