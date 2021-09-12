package expert006;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Car {
    @Resource(name = "tire")
    private Tire myTire;

    public String getTireBrand() {
        return "내 타이어는 " + myTire.getBrand();
    }
}
