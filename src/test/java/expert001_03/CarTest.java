package expert001_03;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    @Test
    void 자동차_미국타이어() {
        Tire aTire = new AmericanTire();
        Car aCar = new Car();
        aCar.setTire(aTire);

        assertEquals("내 타이어는 미국산 타이어!", aCar.getTireBrand());
    }

    @Test
    void 자동차_한국타이어() {
        Tire aTire = new KoreanTire();
        Car aCar = new Car();
        aCar.setTire(aTire);

        assertEquals("내 타이어는 한국산 타이어!", aCar.getTireBrand());
    }
}
