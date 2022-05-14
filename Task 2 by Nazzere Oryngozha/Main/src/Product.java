public class Product{
    private int id;
    private String name;
    private int UPC;
    private String manufacturer;
    private double price;
    private int expDate;
    private int count;

    public Product(int id, String name, int UPC, String manufacturer, double price, int expDate, int count) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.price = price;
        this.expDate = expDate;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUPC() {
        return UPC;
    }

    public void setUPC(int UPC) {
        this.UPC = UPC;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", UPC=" + UPC +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", expDate=" + expDate +
                ", count=" + count ;
    }
}
