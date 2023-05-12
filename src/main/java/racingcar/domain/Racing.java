package racingcar.domain;

import racingcar.Car;
import racingcar.RacingRandomNumber;

public class Racing {

    private RacingRandomNumber racingRandomNumber;

    public Racing() {
        this.racingRandomNumber = new RacingRandomNumber();
    }

    // Car 객체의 레이스 (랜덤 번호)
    public void racingCar(Car car) {
        if (racingRandomNumber.generate() >= 4) {
            car.plusPosition();
        }
    }

}
