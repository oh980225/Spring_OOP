package expert003;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("expert003.xml")
class CarTest {
    @Autowired
    Car car;

    @Test
    void 자동차_미국타이어() {
        assertEquals("내 타이어는 미국산 타이어!", car.getTireBrand());
    }
}
