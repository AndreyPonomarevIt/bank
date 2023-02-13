package by.itacademy.andreyponomarev.javabasics.oop;

public class Car  {
    private int idCar;
    private String brandOfCar;
    private int yearOfProduceTheCar;
    private String colorTheCar;
    private double priceOfTheCar;
    private int idCreditCard;
    private String registrationOfNumber;
    public Car(int newIdCar, String newBrandOfCar, int newYearOfProduceTheCar, String newColorTheCar,
               double newPriceOfTheCar, int newIdCreditCard, String newRegistrationOfNumber ) {
        idCar=newIdCar;
        brandOfCar=newBrandOfCar;
        yearOfProduceTheCar=newYearOfProduceTheCar;
        colorTheCar=newColorTheCar;
        priceOfTheCar=newPriceOfTheCar;
        idCreditCard=newIdCreditCard;
        registrationOfNumber=newRegistrationOfNumber;

    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int newIdCar) {
        idCar = newIdCar;
    }

    public String getBrandOfCar() {
        return brandOfCar;
    }

    public void setBrandOfCar(String newBrandOfCar) {
        brandOfCar = newBrandOfCar;
    }

    public int getYearOfProduceTheCar() {
        return yearOfProduceTheCar;
    }

    public void setYearOfProduceTheCar(int newYearOfProduceTheCar) {
        yearOfProduceTheCar = newYearOfProduceTheCar;
    }

    public String getColorTheCar() {
        return colorTheCar;
    }

    public void setColorTheCar(String newColorTheCar) {
        colorTheCar = newColorTheCar;
    }

    public double getPriceOfTheCar() {
        return priceOfTheCar;
    }

    public void setPriceOfTheCar(double newPriceOfTheCar) {
        priceOfTheCar = newPriceOfTheCar;
    }

    public int getIdCreditCard() {
        return idCreditCard;
    }

    public void setIdCreditCard(int newIdCreditCard) {
        idCreditCard = newIdCreditCard;
    }

    public String getRegistrationOfNumber() {
        return registrationOfNumber;
    }

    public void setRegistrationOfNumber(String newRegistrationOfNumber) {
        registrationOfNumber = newRegistrationOfNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar=" + idCar +
                ", brandOfCar='" + brandOfCar + '\'' +
                ", yearOfProduceTheCar=" + yearOfProduceTheCar +
                ", colorTheCar='" + colorTheCar + '\'' +
                ", priceOfTheCar=" + priceOfTheCar +
                ", idCreditCard=" + idCreditCard +
                ", registrationOfNumber='" + registrationOfNumber + '\'' +
                '}';
    }
}
