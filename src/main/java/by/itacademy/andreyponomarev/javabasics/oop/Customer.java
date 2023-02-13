package by.itacademy.andreyponomarev.javabasics.oop;

public class Customer {
    private int idCustomer;
    private String lastName;
    private String name;
    private String surName;
    private String address;
    private int idCreditCard;
    private int idBankAccount;
    public Customer(int newIdCustomer, String newLastName, String newName, String newSurName, String newAddress,
                    int newIdCreditCard, int newIdBankAccount) {
        idCustomer=newIdCustomer;
        lastName=newLastName;
        name=newName;
        surName=newSurName;
        idCreditCard=newIdCreditCard;
        idBankAccount=newIdBankAccount;
    }

    public int getIdCustomer()
    {
        return idCustomer;
    }

    public void setIdCustomer(int newId) {
        if (newId > 0) {
            idCustomer = newId;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        if (newLastName != "") {
            lastName = newLastName;
        } else {
            System.out.println("Вы не заполнили данное поле фамилия!");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != "") {
            name = newName;
        } else {
            System.out.println("Вы не заполнили поле имя!");
        }
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String newSurName) {
        if (newSurName != "") {
            surName = newSurName;
        } else {
            System.out.println("Вы не заполнили поле отчетсво!");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        if (newAddress != "") {
            address = newAddress;
        } else {
            System.out.println("Вы не заполнили поле адрес!");
        }
    }

    public int getIdCreditCard() {
        return idCreditCard;
    }

    public void setIdCreditCard(int newIdCreditCard) {
        if (newIdCreditCard > 0) {
            idCreditCard = newIdCreditCard;
        } else {
            System.out.println("Вы ввели некорректное значение!");
        }

    }

    public int getIdBankAccount() {
        return idBankAccount;
    }

    public void setIdBankAccount(int newIdBankAccount) {
        if (newIdBankAccount > 0) {
            idBankAccount = newIdBankAccount;
        } else {
            System.out.println("Вы ввели некорректное значение!");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", address='" + address + '\'' +
                ", idCreditCard=" + idCreditCard +
                ", idBankAccount=" + idBankAccount +
                '}';
    }
}
