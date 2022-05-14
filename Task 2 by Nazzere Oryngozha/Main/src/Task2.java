import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("Done by: Oryngozha Nazzere");
        System.out.println("------------------------------------------------");
        Scanner in= new Scanner (System.in);

        System.out.println("-------------Task 1-----------------");
        Student st1 = new Student(1, "Oryngozha", "Nazzere", "Yernazkyzy", "12.04.2001","Almaty, st. Somewhere, home: 59", "87011932295", "SIS", 4, "1807K");
        Student st2 = new Student(2, "AAA", "aaa", "AaAa", "11.01.2002","Almaty, st. Somewhere, home: 60", "87011932295", "SIS", 3, "1907K");
        Student st3 = new Student(3, "BBB", "bbb", "BbBb", "22.10.2000","Almaty, st. Somewhere, home: 61", "87011932295", "IS", 4, "1812K");
        Student st4 = new Student(4, "CCC", "ccc", "CcCc", "25.06.2001","Almaty, st. Somewhere, home: 62", "87011932295", "RET", 4, "1809R");
        Student st5 = new Student(5, "DDD", "ddd", "DdDd", "10.09.2000","Almaty, st. Somewhere, home: 63", "87011932295", "SIS", 4, "1807K");
        List<Student> stList= new ArrayList<>();
        stList.add(st1);stList.add(st2);stList.add(st3);stList.add(st4);stList.add(st5);
        List<String> faculties= new ArrayList<>();
        for(Student stud: stList)
            if(!faculties.contains(stud.getFaculty()))
                faculties.add(stud.getFaculty());
        boolean exit = false;
        while(!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- список студентов заданного факультета");
            System.out.println("    2- списки студентов для каждого факультета и курса");
            System.out.println("    3- список студентов, родившихся после заданного года");
            System.out.println("    4- список учебной группы");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch(choice){
                case 1 :
                    System.out.println("\n -----------------------");
                    System.out.println("Факультеты:");
                    int facId=0;
                    for(String faculty: faculties){
                        System.out.println(facId+" - "+faculty);
                        facId++;
                    }
                    int facultyChoice = Integer.parseInt(in.nextLine()) ;
                    for(Student student:stList)
                        if(student.getFaculty().equals(faculties.get(facultyChoice)))
                            System.out.println(student);
                    System.out.println("\n -----------------------");
                    break;
                case 2:
                    System.out.println("-----------------------\n");
                    System.out.println("Факультеты:");
                    int facId2=0;
                    for(String faculty2: faculties){
                        System.out.println(facId2+" - "+faculty2);
                        facId2++;
                    }
                    int facultyChoice2 = Integer.parseInt(in.nextLine()) ;
                    System.out.println("Введите год учебы");
                    int yearChoice2 = Integer.parseInt(in.nextLine()) ;
                    for(Student student:stList)
                        if(student.getFaculty().equals(faculties.get(facultyChoice2)) && student.getYearUni()==yearChoice2)
                            System.out.println(student);
                    break;
                case 3:
                    System.out.println("Введите год:");
                    int dob3= Integer.parseInt(in.nextLine());
                    System.out.println("Студенты родившиеся после "+dob3+" года:");
                    for(Student student:stList){
                        String [] studDOB=(student.getDob()).split("\\."); //dd.mm.yyyy
                        if(dob3 < Integer.parseInt(studDOB[2]))
                            System.out.println(student);
                    }
                    break;
                case 4:
                    List<String> groupList = new ArrayList<>();
                    for(Student stud: stList)
                        if(!groupList.contains(stud.getGroup()))
                            groupList.add(stud.getGroup());
                    System.out.println("Groups:");
                    int grId=0;
                    for (String gr: groupList){
                        System.out.println(grId +" - "+ groupList.get(grId));
                        grId++;
                    }
                    int enterGr = Integer.parseInt(in.nextLine());
                    for(Student stud:stList)
                        if(stud.getGroup().equals(groupList.get(enterGr)))
                            System.out.println(stud);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
            System.out.println("\n -----------------------");
        }
        System.out.println("-------------Task 2-----------------");
        Customer cu1= new Customer(1,"Oryngozha", "Nazzere", "Yernazkyzy", "12.04.2001","Almaty, st. Somewhere, home: 59","1111111","11111");
        Customer cu2 = new Customer(2, "AAA", "aab", "AaAa", "11.01.2002","Almaty, st. Somewhere, home: 60", "1111113", "222222");
        Customer cu3 = new Customer(3, "AAA", "aaa", "BbBb", "22.10.2000","Almaty, st. Somewhere, home: 61", "1111105", "333333");
        Customer cu4 = new Customer(4, "CCC", "ccc", "CcCc", "25.06.2001","Almaty, st. Somewhere, home: 62", "1111112", "444444");
        Customer cu5 = new Customer(5, "DDD", "ddd", "DdDd", "10.09.2000","Almaty, st. Somewhere, home: 63", "1111114", "555555");
        List<Customer> customers = new ArrayList<>();
        customers.add(cu1);customers.add(cu2);customers.add(cu3);customers.add(cu4);customers.add(cu5);
        exit = false;
        while (!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- список покупателей в алфавитном порядке");
            System.out.println("    2- список покупателей, у которых номер кредитной карточки находится в заданном интервале");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch (choice){
                case 1:
                    for(int i=0;i<customers.size();i++)
                        for(int j=0;j<customers.size();j++){
                            if(customers.get(i).getSurname().compareTo(customers.get(j).getSurname())<0){
                                var temp= customers.get(i);
                                customers.set(i,customers.get(j));
                                customers.set(j,temp);
                            }
                            else if(customers.get(i).getSurname().compareTo(customers.get(j).getSurname())==0){
                                if(customers.get(i).getName().compareTo(customers.get(j).getName())<0){
                                    var temp= customers.get(i);
                                    customers.set(i,customers.get(j));
                                    customers.set(j,temp);
                                }
                                else if(customers.get(i).getName().compareTo(customers.get(j).getName())==0)
                                    if(customers.get(i).getPatronymic().compareTo(customers.get(j).getPatronymic())<0){
                                        var temp= customers.get(i);
                                        customers.set(i,customers.get(j));
                                        customers.set(j,temp);
                                    }
                            }
                        }
                    for (Customer cu:customers)
                        System.out.println(cu);
                    break;
                case 2:
                    System.out.println("Введите начало интервала");
                    int enter1 = Integer.parseInt(in.nextLine());
                    System.out.println("Введите конец интервала");
                    int enter2 = Integer.parseInt(in.nextLine());
                    for(Customer cu:customers)
                        if((enter1)<=Integer.parseInt(cu.getCardNumber()) && Integer.parseInt(cu.getCardNumber())<=(enter2))
                            System.out.println(cu);
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
            System.out.println("\n -----------------------");
        }

        System.out.println("-------------Task 3-----------------");
        Patient pn1= new Patient (1,"Oryngozha", "Nazzere", "Yernazkyzy", "12.04.2001","Almaty, st. Somewhere, home: 59","87011932295","11111","allergic");
        Patient pn2 = new Patient(2, "AAA", "aab", "AaAa", "11.01.2002","Almaty, st. Somewhere, home: 60", "1111113", "222225", "headache");
        Patient pn3 = new Patient(3, "AAA", "aaa", "BbBb", "22.10.2000","Almaty, st. Somewhere, home: 61", "1111105", "222223","sinusitis");
        Patient pn4 = new Patient(4, "CCC", "ccc", "CcCc", "25.06.2001","Almaty, st. Somewhere, home: 62", "1111112", "222224","headache");
        Patient pn5 = new Patient(5, "DDD", "ddd", "DdDd", "10.09.2000","Almaty, st. Somewhere, home: 63", "1111114", "222222","allergic");

        List<Patient> patients= new ArrayList<>();
        patients.add(pn1);patients.add(pn2);patients.add(pn3);patients.add(pn4);patients.add(pn5);

        List<String> diagnoses =new ArrayList<>();
        for(Patient pat : patients)
            if(!diagnoses.contains(pat.getDiagnosis()))
                diagnoses.add(pat.getDiagnosis());
        exit = false;
        while (!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- список пациентов, имеющих данный диагноз");
            System.out.println("    2- список пациентов, номер медицинской карты которых находится в заданном интервале");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch (choice){
                case 1:
                    System.out.println("-----------------------\n");
                    System.out.println("Диагнозы:");
                    int diagId=0;
                    for(String diagnosis: diagnoses){
                        System.out.println(diagId+" - "+diagnosis);
                        diagId++;
                    }
                    int diagnosisChoice = Integer.parseInt(in.nextLine()) ;
                    for(Patient patient:patients)
                        if(patient.getDiagnosis().equals(diagnoses.get(diagnosisChoice)))
                            System.out.println(patient);
                    break;
                case 2:
                    System.out.println("Введите начало интервала");
                    int enter1 = Integer.parseInt(in.nextLine());
                    System.out.println("Введите конец интервала");
                    int enter2 = Integer.parseInt(in.nextLine());
                    for(Patient patient:patients)
                        if((enter1)<=Integer.parseInt(patient.getMedCardNumber()) && Integer.parseInt(patient.getMedCardNumber())<=(enter2))
                            System.out.println(patient);
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
            System.out.println("\n -----------------------");
        }
        System.out.println("-------------Task 4-----------------");
        Abiturient ab1 = new Abiturient(1, "Oryngozha", "Nazzere", "Yernazkyzy", "12.04.2001","Almaty, st. Somewhere, home: 59", "87011932295", new double[]{2.3,3.0,3.67});
        Abiturient ab2 = new Abiturient(2, "AAA", "aaa", "AaAa", "11.01.2002","Almaty, st. Somewhere, home: 60", "87011932295", new double[]{3.67,3.0,3.67});
        Abiturient ab3 = new Abiturient(3, "BBB", "bbb", "BbBb", "22.10.2000","Almaty, st. Somewhere, home: 61", "87011932295",  new double[]{3.0,4.0,3.67});
        Abiturient ab4 = new Abiturient(4, "CCC", "ccc", "CcCc", "25.06.2001","Almaty, st. Somewhere, home: 62", "87011932295", new double[]{2.3,2.0,1.67});
        Abiturient ab5 = new Abiturient(5, "DDD", "ddd", "DdDd", "10.09.2000","Almaty, st. Somewhere, home: 63", "87011932295", new double[]{2.3,3.0,2.67,1.0});
        Abiturient ab6 = new Abiturient(6, "EEE", "eee", "EeEe", "10.09.2000","Almaty, st. Somewhere, home: 63", "87011932295", new double[]{3.67,3.0,3.67});
        List<Abiturient> abiturients= new ArrayList<>();
        abiturients.add(ab1);abiturients.add(ab2);abiturients.add(ab3);abiturients.add(ab4);abiturients.add(ab5);abiturients.add(ab6);
        exit = false;
        while (!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- список абитуриентов, имеющих неудовлетворительные оценки");
            System.out.println("    2- список абитуриентов, у которых сумма баллов выше заданной");
            System.out.println("    3- выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов (вывести также полный список абитуриентов, имеющих полупроходную сумму)");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch (choice){
                case 1:
                    for(Abiturient ab: abiturients)
                        for(int i=0;i<ab.getGrades().length;i++)
                            if(ab.getGrades()[i]<2.0)
                                System.out.println(ab);
                    break;
                case 2:
                    System.out.println("Введите сумму:");
                    double enterGPA= Double.parseDouble(in.nextLine());
                    for(Abiturient ab:abiturients)
                        if(ab.sumOfGrades() > enterGPA)
                            System.out.println(ab);
                    break;
                case 3:
                    System.out.println("Введите число абитуриентов:");
                    int n = Integer.parseInt(in.nextLine());
                    for(int abI=0; abI<abiturients.size();abI++)
                        for(int abJ=0;abJ<abiturients.size(); abJ++)
                            if(abiturients.get(abI).sumOfGrades()>abiturients.get(abJ).sumOfGrades()){
                                var temp = abiturients.get(abI);
                                abiturients.set(abI, abiturients.get(abJ));
                                abiturients.set(abJ, temp);
                            }
                    int additionalN=0;
                    for(int i=n;i<abiturients.size();i++){
                        if(abiturients.get(i).sumOfGrades().equals(abiturients.get(n - 1).sumOfGrades())) {
                               ++additionalN;
                        }}
                    for(int i=0; abiturients.size()>(n) ? i < n+additionalN : i < abiturients.size(); i++)
                        System.out.println(abiturients.get(i));
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
            System.out.println("\n -----------------------");
        }

        System.out.println("-------------Task 5-----------------");
        Book b1= new Book(1, new String[]{"AA","BB"}, "aPublisher", 2010, 250, 3000.0 ,"topographic");
        Book b2= new Book(2, new String[]{"AA"}, "bPublisher", 2000, 250, 3000.0 ,"topographic");
        Book b3= new Book(3, new String[]{"CC","DD"}, "cPublisher", 1990, 250, 3000.0 ,"topographic");
        Book b4= new Book(4, new String[]{"EE","BB"}, "aPublisher", 1972, 250, 3000.0 ,"topographic");
        Book b5= new Book(5, new String[]{"BB"}, "bPublisher", 2020, 250, 3000.0 ,"topographic");

        List <Book> bookList= new ArrayList<>();
        bookList.add(b1);bookList.add(b2);bookList.add(b3);bookList.add(b4);bookList.add(b5);
        List<String> authors = new ArrayList<>();
        for(Book b: bookList)
            for(int i = 0; i <b.getAuthors().length; i++)
                if(!authors.contains(b.getAuthors()[i]))
                    authors.add(b.getAuthors()[i]);
        List<String> publishers = new ArrayList<>();
        for(Book b: bookList)
                if(!publishers.contains(b.getPublisher()))
                    publishers.add(b.getPublisher());

        exit = false;
        while (!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- список книг заданного автора");
            System.out.println("    2- список книг, выпущенных заданным издательством");
            System.out.println("    3- список книг, выпущенных после заданного года");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch (choice){
                case 1:
                    System.out.println("Авторы:");
                    int auId=0;
                    for(String a: authors){
                        System.out.println(auId+" - "+ a);
                        auId++;
                    }
                    System.out.println("Введите автора");
                    int enterAuthor = Integer.parseInt(in.nextLine());

                    for(Book b: bookList)
                        for(int i = 0; i <b.getAuthors().length; i++)
                            if(b.getAuthors()[i].equals(authors.get(enterAuthor)))
                                System.out.println(b);
                    break;
                case 2:
                    System.out.println("Издательства:");
                    int pbId=0;
                    for(String p:publishers){
                        System.out.println(pbId+" - "+ p);
                        pbId++;
                    }
                    System.out.println("Введите издательство");
                    int enterPublisher = Integer.parseInt(in.nextLine());
                    for(Book b: bookList)
                            if(b.getPublisher().equals(publishers.get(enterPublisher)))
                                System.out.println(b);
                    break;
                case 3:
                    System.out.println("Введите год:");
                    int enterYear= Integer.parseInt(in.nextLine());

                    for(Book b: bookList)
                        if(b.getYear()>enterYear)
                            System.out.println(b);
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
            System.out.println("\n -----------------------");
        }
        System.out.println("-------------Task 6-----------------");
        House h1= new House(1,23,59.8,1,3,"Turkebaev","panel",9);
        House h2= new House(2,29,39.8,2,1,"Turkebaev","panel",3);
        House h3= new House(3,52,43.3,6,2,"Turkebaev","monolit",2);
        House h4= new House(4,53,30.9,2,1,"Turkebaev","panel",1);
        House h5= new House(5,123,60.8,1,3,"Turkebaev","panel",3);

        List<House> houseList=new ArrayList<>();
        houseList.add(h1);houseList.add(h2);houseList.add(h3);houseList.add(h4);houseList.add(h5);

        exit = false;
        while (!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- список квартир, имеющих заданное число комнат");
            System.out.println("    2- список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке");
            System.out.println("    3- список квартир, имеющих площадь, превосходящую заданную");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch (choice){
                case 1:
                    System.out.println("Введите количество комнат:");
                    int enterCountRoom= Integer.parseInt(in.nextLine());
                    for (House h: houseList)
                        if(h.getCountOfRooms()==enterCountRoom)
                            System.out.println(h);
                    break;
                case 2:
                    System.out.println("Введите количество комнат:");
                    int enterCountRoom2= Integer.parseInt(in.nextLine());
                    System.out.println("Введите начало интервала");
                    int enter1 = Integer.parseInt(in.nextLine());
                    System.out.println("Введите конец интервала");
                    int enter2 = Integer.parseInt(in.nextLine());
                    for (House h: houseList)
                        if(h.getCountOfRooms()==enterCountRoom2 && enter1<=h.getFloor() && h.getFloor()<= enter2)
                            System.out.println(h);
                    break;
                case 3:
                    System.out.println("Введите площадь");
                    double enterArea= Double.parseDouble(in.nextLine());
                    for (House h: houseList)
                        if(h.getArea()>=enterArea)
                            System.out.println(h);
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
            System.out.println("\n -----------------------");
        }
        System.out.println("-------------Task 7-----------------");
        Phone ph1 = new Phone(1,"Oryngozha", "Nazzere", "Yernazkyzy", "Somewhere","1111111",2500.0,1200.0,23,5);
        Phone ph2 = new Phone(2,"AAAA", "aaa", "Aa", "Somewhere","2222222",2500.0,1200.0,23,25);
        Phone ph3 = new Phone(3,"AAAA", "aa", "Aa", "Somewhere","3333333",5000.0,2200.0,56,56);
        Phone ph4 = new Phone(4,"AAA", "aaa", "Aa", "Somewhere","4444444",3333.0,3200.0,120,0);
        Phone ph5 = new Phone(5,"CCCC", "ccc", "Aa", "Somewhere","5555555",4300.0,4200.0,122,6);
        List<Phone> phoneList= new ArrayList<>();
        phoneList.add(ph1);phoneList.add(ph2);phoneList.add(ph3);phoneList.add(ph4);phoneList.add(ph5);
        exit = false;
        while (!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- сведения об абонентах, у которых время внутригородских разговоров превышает заданное");
            System.out.println("    2- сведения об абонентах, которые пользовались междугородной связью");
            System.out.println("    3- сведения об абонентах в алфавитном порядке");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch (choice){
                case 1:
                    System.out.println("Введите время в минутах:");
                    double enterTime = Double.parseDouble(in.nextLine());
                    for(Phone p: phoneList)
                        if(p.getTimeOfUrbanConversations()>enterTime)
                            System.out.println(p);

                    System.out.println("");
                    System.out.println("-----------------------");
                    break;
                case 2:
                    System.out.println("Абоненты которые пользовались междугордной связью:");
                    for(Phone p: phoneList)
                        if(p.getLongDistanceConverations()>0.0)
                            System.out.println(p);

                    System.out.println("");
                    System.out.println("-----------------------");
                    break;
                case 3:
                    System.out.println("Абоненты в алфавитном порядке:");
                    for(int i=0;i<phoneList.size();i++){
                        for(int j=0;j<phoneList.size();j++){
                            if(phoneList.get(i).getSurname().compareTo(phoneList.get(j).getSurname())<0){
                                var temp= phoneList.get(i);
                                phoneList.set(i,phoneList.get(j));
                                phoneList.set(j,temp);
                            }
                            else if(phoneList.get(i).getSurname().compareTo(phoneList.get(j).getSurname())==0){
                                if(phoneList.get(i).getName().compareTo(phoneList.get(j).getName())<0){
                                    var temp= phoneList.get(i);
                                    phoneList.set(i,phoneList.get(j));
                                    phoneList.set(j,temp);
                                }
                                else if(phoneList.get(i).getName().compareTo(phoneList.get(j).getName())==0){
                                    if(phoneList.get(i).getPatronymic().compareTo(phoneList.get(j).getPatronymic())<0){
                                        var temp= phoneList.get(i);
                                        phoneList.set(i,phoneList.get(j));
                                        phoneList.set(j,temp);
                                    }
                                }
                            }
                        }
                    }

                    for (Phone p: phoneList){
                        System.out.println(p);
                    }

                    System.out.println("");
                    System.out.println("-----------------------");
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }

        }

        System.out.println("-------------Task 8-----------------");
        Car c1= new Car(1,"Toyota", "aaa", 2010, "red",5000000, "151351");
        Car c2= new Car(1,"Hyundai", "bbb", 2015, "blue",8000000, "16351");
        Car c3= new Car(1,"Lexus", "ccc", 2020, "black",10000000, "64515123");
        Car c4= new Car(1,"Toyota", "ddd", 2021, "black",9000000, "5232321");
        Car c5= new Car(1,"Lexus", "eee", 2016, "red",11000000, "45313");
        List<Car> carList = new ArrayList<>();
        carList.add(c1);carList.add(c2);carList.add(c3);carList.add(c4);carList.add(c5);
        List<String> brands= new ArrayList<>();
        for(Car c: carList)
            if(!brands.contains(c.getBrand()))
                brands.add(c.getBrand());
        exit = false;
        while (!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- список автомобилей заданной марки");
            System.out.println("    2- список автомобилей заданной модели, которые эксплуатируются больше n лет");
            System.out.println("    3- список автомобилей заданного года выпуска, цена которых больше указанной");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch (choice){
                case 1:
                    System.out.println("Brands");
                    int brId=0;
                    for(String b: brands) {
                        System.out.println(brId+" - "+b);
                        brId++;
                    }
                    int enterBrand = Integer.parseInt(in.nextLine());
                    for(Car c: carList)
                        if(c.getBrand().equals(brands.get(enterBrand)))
                            System.out.println(c);
                    break;

                case 2:
                    System.out.println("Введите n:");
                    int nYear = Integer.parseInt(in.nextLine());
                    for(Car c: carList)
                        if((2022-c.getYear())>=nYear)
                            System.out.println((2022-c.getYear())+" year "+c);
                    break;

                case 3:
                    System.out.println("Укажите год:");
                    int year = Integer.parseInt(in.nextLine());
                    System.out.println("Укажите цену:");
                    double price = Double.parseDouble(in.nextLine());
                    for(Car c: carList)
                        if(c.getYear()==year && c.getPrice()>=price)
                            System.out.println(c);
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
            System.out.println("\n -----------------------");
        }

        System.out.println("-------------Task 9-----------------");
        Product pr1 = new Product(1,"milk",121351, "Adal", 420.0, 12, 10);
        Product pr2 = new Product(2,"bread",5123, "Aqsay Nan", 150.0, 3, 15);
        Product pr3 = new Product(3,"yogurt",4512, "Activia", 359.0, 24, 24);
        Product pr4 = new Product(4,"yogurt",654123, "FoodMaster", 390.0, 12, 15);
        Product pr5 = new Product(5,"milk",213452, "Lactel", 410.0, 12, 10);
        List<Product> productList = new ArrayList<>();
        productList.add(pr1);productList.add(pr2);productList.add(pr3);productList.add(pr4);productList.add(pr5);

        List<String> namesp= new ArrayList<>();
        for(Product p: productList){
            if(!namesp.contains(p.getName())){
                namesp.add(p.getName());
            }
        }

        exit = false;
        while (!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- список товаров для заданного наименования");
            System.out.println("    2- список товаров для заданного наименования, цена которых не превосходит заданную");
            System.out.println("    3- список товаров, срок хранения которых больше заданного");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch (choice){
                case 1:
                    System.out.println("Товары которые есть:");
                    int prId=0;
                    for(String a: namesp){
                        System.out.println(prId+" - "+a);
                        prId++;
                    }
                    System.out.println("Выберите товар:");
                    int enterPr= Integer.parseInt(in.nextLine());
                    for(Product p:productList)
                        if(p.getName().equals(namesp.get(enterPr)))
                            System.out.println(p);
                    break;
                case 2:
                    System.out.println("Товары которые есть:");
                    int prId2=0;
                    for(String a: namesp){
                        System.out.println(prId2+" - "+a);
                        prId2++;
                    }
                    System.out.println("Выберите товар:");
                    int enterPr2= Integer.parseInt(in.nextLine());

                    System.out.println("Укажите цену, чтобы показать продукты которые не превосходят: ");
                    double price = Double.parseDouble(in.nextLine());
                    for(Product p:productList)
                        if(p.getName().equals(namesp.get(enterPr2)) && p.getPrice()<=price)
                            System.out.println(p.getPrice()+" тг --- "+p);
                    break;
                case 3:
                    System.out.println("Укажите срок");
                    int enterExp= Integer.parseInt(in.nextLine());
                    System.out.println("Продукты у которых срок хранения которых больше заданного");
                    for(Product p:productList)
                        if(p.getExpDate()>enterExp)
                            System.out.println(p.getExpDate()+" дней ---- "+p);
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
            System.out.println("\n -----------------------");
        }
        System.out.println("-------------Task 10-----------------");
        Train tr1 =new Train("Almaty", 12, "12:10", new int[]{25,16,16,10});
        Train tr2 =new Train("Almaty", 10, "17:20", new int[]{0,16,16,10});
        Train tr3 =new Train("Shymkent", 16, "16:30", new int[]{0,16,16,10});
        Train tr4 =new Train("Shymkent", 17, "21:10", new int[]{25,16,16,10});
        Train tr5 =new Train("Almaty", 13, "19:30", new int[]{2,16,16,10});
        exit = false;
        List<Train> trainList =new ArrayList<>();
        trainList.add(tr1);trainList.add(tr2);trainList.add(tr3);trainList.add(tr4);trainList.add(tr5);
        List<String> trainDests= new ArrayList<>();
        for(Train t: trainList)
            if(!trainDests.contains(t.getDest()))
                trainDests.add(t.getDest());
        while (!exit){
            System.out.println("Выберите, если хотите: ");
            System.out.println("    1- список поездов, следующих до заданного пункта назначения");
            System.out.println("    2- список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа");
            System.out.println("    3- список поездов, отправляющихся до заданного пункта назначения и имеющих общие места");
            System.out.println("    0- выйти");

            int choice = Integer.parseInt(in.nextLine()) ;
            switch (choice){
                case 1:
                    System.out.println("Пункты назначения:");
                    int trId=0;
                    for(String s:trainDests){
                        System.out.println(trId+" - "+s);
                        trId++;
                    }
                    int enterDest = Integer.parseInt(in.nextLine());
                    System.out.println("Поезда в "+trainDests.get(enterDest));
                    for(Train t:trainList)
                        if(t.getDest().equals(trainDests.get(enterDest)))
                            System.out.println(t);

                    System.out.println("");
                    System.out.println("-----------------------");
                    break;

                case 2:
                    System.out.println("Пункты назначения:");
                    int trId2=0;
                    for(String s:trainDests){
                        System.out.println(trId2+" - "+s);
                        trId2++;
                    }
                    int enterDest2 = Integer.parseInt(in.nextLine());

                    System.out.println("Укажите время (например, 12:00)");
                    String [] enterTime= in.nextLine().split(":");
                    System.out.println("Поезда в "+trainDests.get(enterDest2));
                    for(Train t:trainList) {
                        String [] time= t.getDepatureTime().split(":");
                        if (t.getDest().equals(trainDests.get(enterDest2))&&
                                ( Integer.parseInt(enterTime[0])<Integer.parseInt(time[0]) || ( Integer.parseInt(enterTime[0])==Integer.parseInt(time[0]) && Integer.parseInt(enterTime[1]) <= Integer.parseInt(time[1])) ) )
                            System.out.println(t);
                    }
                    System.out.println("");
                    System.out.println("-----------------------");
                    break;
                case 3:

                    System.out.println("Пункты назначения:");
                    int trId3=0;
                    for(String s:trainDests){
                        System.out.println(trId3+" - "+s);
                        trId3++;
                    }
                    int enterDest3 = Integer.parseInt(in.nextLine());
                    System.out.println("Поезда в "+trainDests.get(enterDest3));
                    for(Train t:trainList)
                        if(t.getDest().equals(trainDests.get(enterDest3)) && t.getCountOfPlaces()[0]>0)
                            System.out.println(t.getCountOfPlaces()[0]+" общих мест в --"+t);

                    System.out.println("");
                    System.out.println("-----------------------");
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Try again/ Попробуйте еще раз;)");
            }
        }
    }
}