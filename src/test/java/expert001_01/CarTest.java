package expert001_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void 자동차_타이어_브랜드() {
        Car aCar = new Car();

        assertEquals("내 타이어는 한국산 타이어!", aCar.getTireBrand());
    }
}