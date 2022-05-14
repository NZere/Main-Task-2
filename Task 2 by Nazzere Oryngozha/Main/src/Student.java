public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String dob; // date of birth
    private String adress;
    private String phone;
    private String faculty;
    private int yearUni;
    private String group;

    public Student(int id, String surname, String name, String patronymic, String dob, String adress, String phone, String faculty, int yearUni, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dob = dob;
        this.adress = adress;
        this.phone = phone;
        this.faculty = faculty;
        this.yearUni = yearUni;
        this.group = group;
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

    public String getFaculty() {
        return faculty;
    }

    public int getYearUni() {
        return yearUni;
    }

    public String getGroup() {
        return group;
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

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setYearUni(int yearUni) {
        this.yearUni = yearUni;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dob='" + dob + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course year =" + yearUni +
                ", group='" + group + '\'';
    }
}

