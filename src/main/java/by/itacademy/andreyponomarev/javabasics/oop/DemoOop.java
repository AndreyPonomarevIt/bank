package by.itacademy.andreyponomarev.javabasics.oop;


public class DemoOop {
    public static void main(String[] args) {
        Customer customer=new Customer(123,"Ivanov" , "Ivan", "Ivanovich",
                "Minsk street Lenina", 123456789, 987654321);
        Book book=new Book(123,"Denn","TDI",
                1999, 100,99.99);
        Car car=new Car(123,"Lada",2009,"Red", 19999.23, 123456789,
                "MC 7565 7");
        System.out.println(customer);
        System.out.println(book);
        System.out.println(car);
        System.out.println();
        User user=new User("Fedor");
        Student student=new Student(200);
        Person person=new Person(299);
        System.out.println(user);
        System.out.println(student);
        System.out.println(person);
        System.out.println("Income = " + (student.getIncome()+person.getIncome()));

    }
}


