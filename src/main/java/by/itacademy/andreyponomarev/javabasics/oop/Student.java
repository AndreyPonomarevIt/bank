package by.itacademy.andreyponomarev.javabasics.oop;

public class Student extends User{
    int grand;

    public Student(int newGrand) {
        grand=newGrand;
    }

    public Student() {
    }

    public int getGrand() {
        return grand;
    }

    public void setGrand(int newGrand) {
        grand = newGrand;
    }

    int getIncome() {
       if(grand>0) {
          return grand;
       } else{return 0;
       }
       }
       public String toString() {
        return "У объекта класса Student grand= " + grand;
       }
}

