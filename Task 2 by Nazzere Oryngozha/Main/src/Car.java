public class Car{
    private int id;
    private String brand;
    private String model;
    private int year;
    private String colour;
    private double price;
    private String numReg;

    public Car(int id, String brand, String model, int year, String colour, double price, String numReg) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.price = price;
        this.numReg = numReg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNumReg() {
        return numReg;
    }

    public void setNumReg(String numReg) {
        this.numReg = numReg;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", numReg='" + numReg + '\'' ;
    }
}
