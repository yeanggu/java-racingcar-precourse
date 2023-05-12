package racingcar.domain;

import racingcar.Car;

import java.util.ArrayList;
import java.util.List;

public class PositionCompare {

    public PositionCompare() {}
    private List<Car> winnerList = new ArrayList<>();
    private int maxPosition = 0;

    // Car 객체를 비교해서 최종 winnerList 를 return 하는 기능
    public List<Car> winnerListGenerate(ArrayList<Car> cars) {
        for (Car car : cars) {
            comparisonPosition(car);
        }
        return winnerList;
    }

    // position 을 비교해서 winnerList 생성하는 기능
    private void comparisonPosition(Car car) {
        if (positionIsEqual(car)) {
            winnerList.add(car);
        }
        if (positionIsMax(car)) {
            winnerList.clear();
            winnerList.add(car);
            maxPosition = car.getPosition();
        }
    }

    // position 이 같은지 비교한다.
    private boolean positionIsEqual(Car car) {
        return maxPosition == car.getPosition();
    }

    // position 이 큰지 비교한다.
    private boolean positionIsMax(Car car) {
        return maxPosition < car.getPosition();
    }


}
