package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarsTest {


    private Cars cars;

    @BeforeEach
    public void setup() {
        List<Car> cars = new ArrayList<>();
        Car car = new Car("jeje", 1);
        Car car2 = new Car("tdd", 1);
        cars.add(car);
        cars.add(car2);

    }


    @Test
    @DisplayName("1회 모두 전진했을 때, max값 증가 테스트")
    void maxPlus() {


    }

    @Test
    @DisplayName("1회 모두 멈춰있했을 때, max값 변동없음 테스트")
    void maxNotChange() {

    }

}
