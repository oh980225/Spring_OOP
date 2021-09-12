package expert001_02;

public class Car {
    private final Tire myTire;

    public Car(Tire theTire) {
        this.myTire = theTire;
    }

    public String getTireBrand() {
        return "내 타이어는 " + myTire.getBrand();
    }
}
