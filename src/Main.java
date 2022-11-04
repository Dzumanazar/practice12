public class Main {
    public static void main(String[] args) {
        University university=new University();
        university.setName("Ala-too university");
        university.setAdress("Bishkek shaary");
        university.setStudentOkuit("15000 student okuit");

        University university1=new University();
        university1.setName("OshMU university");
        university1.setAdress("Osh shaary");
        university1.setStudentOkuit("12000 student okuit");

        University university2=new University();
        university2.setName("JaGU university");
        university2.setAdress("Jalal-Abad shaary");
        university2.setStudentOkuit("10000 student okuit");

        University [] universities = {university, university1,university2};
        methodUniversitties(universities);


        School school = new School();
        school.setName("Chyngyz Aitmatov");
        school.setOkuuchununsaany(700);
        school.setPhonNumber(3245);

        School school1 = new School();
        school1.setName("Alykul Osmonov");
        school1.setOkuuchununsaany(800);
        school1.setPhonNumber(2345);

        School school2 = new School();
        school2.setName("Shamshidin Suiorkulov");
        school2.setOkuuchununsaany(350);
        school2.setPhonNumber(2312);
        School [] schools={school, school1, school2};
        methodSchools(schools);


        Car car = new Car();
        car.setName("Lexus 330");
        car.setColor("White");
        car.setPrice(2000000);

        Car car1 = new Car();
        car1.setName("Tayota camry");
        car1.setColor("Black");
        car1.setPrice(1000000);

        Car car2 = new Car();
        car2.setName("Mersedes Bens E klass");
        car2.setColor("White");
        car2.setPrice(1500000);

        Car car3 = new Car();
        car3.setName("Honda Vit");
        car3.setColor("White");
        car3.setPrice(1000000);

        Car [] cars={car, car1, car2, car3};
        cars(cars);

        Person person = new Person();
        person.setFulName("Tolkun Japarov");
        person.setNation("Ulultu: Kyrgyz");
        person.setAge(20);

        Person person1 = new Person();
        person1.setFulName("Alisher Uzokov");
        person1.setNation("Ulutu: Uzbek");
        person1.setAge(34);

        Person person2 = new Person();
        person2.setFulName("Kairat Nurtas");
        person2.setNation("Ulutu: Kazahk");
        person2.setAge(25);

        Person person3 = new Person();
        person3.setFulName("Aigul Baatyrova");
        person3.setNation("Ulutu: Kyrgyz");
        person3.setAge(18);
        Person [] people={person, person1, person2, person3};
        person(people);
    }
    public static void person(Person [] people){
        for (Person person:people){
            System.out.println(person.getFulName());
            System.out.println(person.getNation());
            System.out.println(person.getAge());
            System.out.println("~~~~~~~~~~~~~~~");
        }
    }
    public static void cars(Car [] cars){
        for (Car car:cars){
            System.out.println(car.getName());
            System.out.println(car.getColor());
            System.out.println(car.getPrice());
            System.out.println("~~~~~~~~~~~~~~~");
        }
    }
    public static void methodUniversitties(University[]universities){
        for (University university:universities){
            System.out.println(university.getName());
            System.out.println(university.getAdress());
            System.out.println(university.getKanchaStudentOkuit());
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
        }
    }
    public static void methodSchools(School [] schools){
        for (School school:schools){
            System.out.println(school.getName());
            System.out.println(school.getOkuuchununsaany());
            System.out.println(school.getPhonNumber());
            System.out.println("~~~~~~~~~~~~~~~~~~");
        }
    }
}