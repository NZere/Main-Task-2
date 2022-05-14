public class Customer{
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String dob; // date of birth
    private String adress;
    private String cardNumber;
    private String bankAccNumber;

    public Customer(int id, String surname, String name, String patronymic, String dob, String adress, String cardNumber, String bankAccNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dob = dob;
        this.adress = adress;
        this.cardNumber = cardNumber;
        this.bankAccNumber = bankAccNumber;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDob() {
        return dob;
    }

    public String getAdress() {
        return adress;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getBankAccNumber() {
        return bankAccNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccNumber(String bankAccNumber) {
        this.bankAccNumber = bankAccNumber;
    }

    @Override
    public String toString() {
        return "Customer : " +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dob='" + dob + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", bankAccNumber='" + bankAccNumber + '\'';
    }
}
