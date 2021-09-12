package expert003;

public class Car {
    private Tire myTire;

    public Tire getTire()  {
        return myTire;
    }

    public void setTire(Tire theTire) {
        this.myTire = theTire;
    }

    public String getTireBrand() {
        return "내 타이어는 " + myTire.getBrand();
    }
}
