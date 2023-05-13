package racingcar.message;

public class ErrorMessage {

    private ErrorMessage() {}

    public static String COUNT_NUMBER_ERROR_MESSAGE = "[ERROR] 시도 횟수는 숫자여야 한다.";
    public static String CAR_NAME_SIZE_ERROR_MESSAGE = "[ERROR] 자동차 이름은 5자 이하여야 한다.";
    public static String CAR_NAME_EMPTY_ERROR_MESSAGE = "[ERROR] 자동차 이름에는 공백이 없어야 한다.";

}
