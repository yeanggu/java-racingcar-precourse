package racingcar.exception;

import racingcar.Car;
import racingcar.message.ErrorMessage;

import java.util.Arrays;
import java.util.List;

public class RaceInputException {

    private List<String> carNames;

    public RaceInputException() {}

    // 자동차 이름 검증 메서드
    public void validCarName(String input) {
        validEmpty(input);
        validDot(input);
        arrayOfCarNames(input);
        for (String carName : carNames) {
            validNameEmpty(carName);
            validSize(carName);
        }
    }

    // 레이스 횟수 검증 메서드
    public void validRaceCount(String input) {
        validEmpty(input);
        validCharacter(input);
    }

    // ,의 갯수와 위치가 유효한지 검증하는 기능
    public void validDot(String input) {
        String[] strArr = input.split("");
        if (strArr[0].equals(",") || strArr[strArr.length-1].equals(",")) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_EMPTY_ERROR_MESSAGE);
        }
        for (int i = 0 ; i < strArr.length ; i++) {
            if (strArr[i].equals(",") && strArr[i+1].equals(",")) {
                throw new IllegalArgumentException(ErrorMessage.CAR_NAME_EMPTY_ERROR_MESSAGE);
            }
        }
    }

    // 자동차 이름 List를 생성한다.
    public void arrayOfCarNames(String input) {
        carNames = Arrays.asList(input.split(","));
    }

    // 자동차의 이름에 공백이 포함되어 있는지 검증하는 기능
    public void validNameEmpty(String carName) {
        for (char c : carName.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                throw new IllegalArgumentException(ErrorMessage.CAR_NAME_EMPTY_ERROR_MESSAGE);
            }
        }
    }

    // 자동차의 이름이 5글자 이내인지 검증하는 기능
    public void validSize(String carName) {
        char[] c = carName.toCharArray();
        if (c.length > 5) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_SIZE_ERROR_MESSAGE);
        }
    }

    // 값이 비어있는지 판별하는 기능
    public void validEmpty(String input) {
        if (input.equals("")) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_ERROR_MESSAGE);
        }
    }

    // 숫자인지 아닌지 판별하는 기능
    public void validCharacter(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException(ErrorMessage.COUNT_NUMBER_ERROR_MESSAGE);
            }
        }
    }

}
