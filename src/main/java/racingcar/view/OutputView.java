package racingcar.view;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

import static racingcar.application.CarConstant.OUTPUT_CAR_WINNER_MESSAGE;

public class OutputView {

    public static void print() {
        System.out.println();
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(Car car) {
        StringBuilder result = new StringBuilder();
        if (car.getName() != null) {
            result.append(car.getName()).append(" : ");
        }
        for (int i = 0; i < car.getState(); i++) {
            result.append("-");
        }
        print(result.toString());
    }

    public static void print(List<Car> cars) {
        List<String> carNames = cars.stream().map(Car::getName).collect(Collectors.toList());
        print(String.join(", ", carNames) + OUTPUT_CAR_WINNER_MESSAGE);
    }
}
