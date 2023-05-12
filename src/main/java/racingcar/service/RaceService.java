package racingcar.service;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.RaceView;

public class RaceService {

    private RaceView raceView;

    public RaceService() {
        this.raceView = new RaceView();
    }

    // 경주할 자동차의 이름을 입력받는다.
    public void inputRaceName() {
        raceView.inputNameMessage();
        String input = Console.readLine();
        // TODO : 예외 처리
    }


}