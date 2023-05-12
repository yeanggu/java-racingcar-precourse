package racingcar.service;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Car;
import racingcar.view.RaceView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RaceService {

    private RaceView raceView;
    private ArrayList<Car> cars = new ArrayList<>();
    private int count = 0;

    public RaceService() {
        this.raceView = new RaceView();
    }

    // 경주할 자동차의 이름을 입력받는다.
    public void inputRaceName() {
        raceView.inputNameMessage();
        String input = Console.readLine();
        // TODO : 예외 처리
        newCars(input);
    }

    // 자동차 객체를 생성한다.
    public void newCars(String input) {
        List<String> carNames = Arrays.asList(input.split(","));
        for (String carName : carNames) { // ,로 구분된 차 이름 List
            cars.add(new Car(carName));
        }
    }

    // 경주를 진행할 횟수를 입력받는다.
    public void inputRaceCount() {
        raceView.inputCountMessage();
        String input = Console.readLine();
        // TODO : 예외 처리
        count = Integer.parseInt(input);
        raceView.lineBreak();
    }

    // 입력된 횟수만큼 레이싱을 반복하는 기능
    public void racingResult() {
        raceView.raceResultMessage();
        do {
            racingCarResult();
            raceView.lineBreak();
            count --;
        } while (count != 0);
    }

    // 각 car 객체의 레이싱 결과를 나타내는 기능
    public void racingCarResult() {
        for (Car car : cars) {
            raceView.raceResult(car);
            raceView.lineBreak();
        }
    }
}
