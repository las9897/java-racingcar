package racingcar.domain;


import racingcar.strategy.MovingStrategy;

import java.util.Objects;

public class Car {

    private final State state;
    private String name;

    public Car() {
        this.state = new State();
    }

    public Car(String name) {
        this.state = new State();
        this.name = name;
    }

    public Car(String name, int state) {
        this.state = new State(state);
        this.name = name;
    }

    public void increaseState(MovingStrategy randomMovingStrategy) {
        if (randomMovingStrategy.isMove()) {
            this.state.increase();
        }
    }

    public boolean isWinner(int max) {
        return this.state.equals(new State(max));
    }

    public int greaterThan(int other) {
        return this.state.greaterThan(other);
    }

    public int getState() {
        return this.state.getState();
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(state, car.state) && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, name);
    }
}
