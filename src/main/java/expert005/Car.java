package expert005;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Car {
    @Resource
    private Tire myTire;

    public String getTireBrand() {
        return "내 타이어는 " + myTire.getBrand();
    }
}
