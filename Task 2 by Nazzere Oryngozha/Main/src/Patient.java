public class Patient{
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String dob; // date of birth
    private String adress;
    private String phone;
    private String medCardNumber;
    private String diagnosis;

    public Patient(int id, String surname, String name, String patronymic, String dob, String adress, String phone, String medCardNumber, String diagnosis) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dob = dob;
        this.adress = adress;
        this.phone = phone;
        this.medCardNumber = medCardNumber;
        this.diagnosis = diagnosis;
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

    public String getPhone() {
        return phone;
    }

    public String getMedCardNumber() {
        return medCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMedCardNumber(String medCardNumber) {
        this.medCardNumber = medCardNumber;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient :" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dob='" + dob + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", medCardNumber='" + medCardNumber + '\'' +
                ", diagnosis='" + diagnosis + '\'';
    }
}
