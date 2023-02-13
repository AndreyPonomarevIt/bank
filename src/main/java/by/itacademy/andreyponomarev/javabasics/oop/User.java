package by.itacademy.andreyponomarev.javabasics.oop;

public class User {
          String name;

          public User(String newName) {
              name=newName;
          }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
    public String toString() {
        return "У объекта User name= " +name;
    }
}

