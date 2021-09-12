package expert001_01;

public class Car {
    private final Tire myTire;

    public Car() {
        myTire = new KoreanTire();
    }

    public String getTireBrand() {
        return "내 타이어는 " + myTire.getBrand();
    }
}
