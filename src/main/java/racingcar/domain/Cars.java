package racingcar.domain;

import racingcar.strategy.MovingStrategy;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

import static racingcar.application.CarConstant.CAR_DEFAULT_STATE;

public class Cars {

    private final List<Car> cars;
    private int max = CAR_DEFAULT_STATE;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void goingTry(MovingStrategy movingStrategy) {
        for (Car car : cars) {
            car.increaseState(movingStrategy);
            max = car.greaterThan(max);
            OutputView.print(car);
        }
    }

    public List<Car> findWinners() {
        return findWinners(cars);
    }

    public List<Car> findWinners(List<Car> cars) {
        List<Car> winners = new ArrayList<>();

        for (Car car : cars) {
            findWinners(winners, car);
        }

        return winners;
    }

    public void findWinners(List<Car> winners, Car car) {
        if (car.isWinner(this.max)) {
            winners.add(car);
        }
    }


    public List<Car> getCars() {
        return cars;
    }


}
