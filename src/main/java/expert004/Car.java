package expert004;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    @Autowired
    private Tire myTire;

    public String getTireBrand() {
        return "내 타이어는 " + myTire.getBrand();
    }
}
