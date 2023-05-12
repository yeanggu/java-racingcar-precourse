package racingcar.controller;

import racingcar.service.RaceService;

public class RaceController {

    private RaceService raceService;

    public RaceController() {
        this.raceService = new RaceService();
    }

    // 프로그램을 시작한다.
    public void startProgram() {
        startRace();
    }

    // 레이스를 시작하기 위한 입력 흐름
    public void startRace() {
        raceService.inputRaceName();
        raceService.inputRaceCount();
    }
    
    
}
