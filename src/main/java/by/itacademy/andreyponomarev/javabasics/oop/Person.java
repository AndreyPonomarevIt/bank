package by.itacademy.andreyponomarev.javabasics.oop;

public class Person extends Student {
    int salary;
    public Person(int newSalary) {
        salary=newSalary;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    int getIncome() {
       return grand + salary;
    }

    @Override
    public String toString() {
        return "У объекта класса Person salary= " + salary;
    }
}

