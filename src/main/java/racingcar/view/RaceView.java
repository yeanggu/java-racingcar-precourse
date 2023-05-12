package racingcar.view;

import racingcar.Car;
import racingcar.message.RaceMessage;

import java.util.ArrayList;

public class RaceView {

    public RaceView() {};

    // 자동차 이름 입력 요청 메시지
    public void inputNameMessage() {
        System.out.println(RaceMessage.INPUT_CAR_NAME_MESSAGE);
    }

    // 경주 진행 횟수 요청 메시지
    public void inputCountMessage() {
        System.out.println(RaceMessage.INPUT_RACE_COUNT_MESSAGE);
    }

    // 줄바꿈
    public void lineBreak() {
        System.out.println();
    }

    // 실행 결과 메시지
    public void raceResultMessage() {
        System.out.println(RaceMessage.RACE_RESULT_MESSAGE);
    }

    // 회차별 레이스 결과
    public void raceResult(Car car) {
        System.out.print(car.getCarName());
        System.out.print(RaceMessage.RESULT_SIGN);
        for (int i = 0 ; i < car.getPosition() ; i++) {
            System.out.print(RaceMessage.RACE_SIGN);
        }
    }


}
