import java.util.Arrays;

public class Abiturient{
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String dob; // date of birth
    private String adress;
    private String phone;
    private double [] grades;

    public Abiturient(int id, String surname, String name, String patronymic, String dob, String adress, String phone, double[] grades) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dob = dob;
        this.adress = adress;
        this.phone = phone;
        this.grades = grades;
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

    public double[] getGrades() {
        return grades;
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

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Abiturient: " +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dob='" + dob + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", grades=" + Arrays.toString(grades)+ '\'' +
                ", sum of grades= "+sumOfGrades();
    }
    public Double sumOfGrades(){
        double sum=0.0;
        for(int i=0;i<this.grades.length;i++){
            sum+=this.grades[i];
        }
        return sum;
    }
}
