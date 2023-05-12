package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 현재 포지션에서 한칸 전진하는 메서드
    public void plusPosition() {
        position += 1;
    }

    // 포지션 현황을 리턴하는 메서드
    public int getPosition() {
        return position;
    }

    // 자동차 이름을 리턴하는 메서드
    public String getCarName() {
        return name;
    }
}
