public class Phone{
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String adress;
    private String numOfCard;
    private double debit;
    private double credit;
    private double timeOfUrbanConversations;
    private double longDistanceConverations;

    public Phone(int id, String surname, String name, String patronymic, String adress, String numOfCard, double debit, double credit, double timeOfUrbanConversations, double longDistanceConverations) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.numOfCard = numOfCard;
        this.debit = debit;
        this.credit = credit;
        this.timeOfUrbanConversations = timeOfUrbanConversations;
        this.longDistanceConverations = longDistanceConverations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumOfCard() {
        return numOfCard;
    }

    public void setNumOfCard(String numOfCard) {
        this.numOfCard = numOfCard;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getTimeOfUrbanConversations() {
        return timeOfUrbanConversations;
    }

    public void setTimeOfUrbanConversations(double timeOfUrbanConversations) {
        this.timeOfUrbanConversations = timeOfUrbanConversations;
    }

    public double getLongDistanceConverations() {
        return longDistanceConverations;
    }

    public void setLongDistanceConverations(double longDistanceConverations) {
        this.longDistanceConverations = longDistanceConverations;
    }

    @Override
    public String toString() {
        return "Phone: " +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", numOfCard='" + numOfCard + '\'' +
                ", debit=" + debit +
                ", credit=" + credit +
                ", timeOfUrbanConversations=" + timeOfUrbanConversations +
                ", longDistanceConverations=" + longDistanceConverations ;
    }
}
