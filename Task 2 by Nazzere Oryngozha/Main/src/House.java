public class House{
    private int id;
    private int numberOfFlats;
    private double area;
    private int floor;
    private int countOfRooms;
    private String street;
    private String typeOfBuilding;
    private int expl;

    public House(int id, int numberOfFlats, double area, int floor, int countOfRooms, String street, String typeOfBuilding, int expl) {
        this.id = id;
        this.numberOfFlats = numberOfFlats;
        this.area = area;
        this.floor = floor;
        this.countOfRooms = countOfRooms;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.expl = expl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfFlats() {
        return numberOfFlats;
    }

    public void setNumberOfFlats(int numberOfFlats) {
        this.numberOfFlats = numberOfFlats;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCountOfRooms() {
        return countOfRooms;
    }

    public void setCountOfRooms(int countOfRooms) {
        this.countOfRooms = countOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getExpl() {
        return expl;
    }

    public void setExpl(int expl) {
        this.expl = expl;
    }

    @Override
    public String toString() {
        return "House: " +
                "id=" + id +
                ", countOfFlats=" + numberOfFlats +
                ", area=" + area +
                ", floor=" + floor +
                ", countOfRooms=" + countOfRooms +
                ", street='" + street + '\'' +
                ", typeOfBuilding='" + typeOfBuilding + '\'' +
                ", expl=" + expl;
    }
}
