package baseball.view;

public enum Messages {

    GAME_START_MESSAGE("숫자 야구 게임을 시작합니다."),
    NUMBER_INPUT_MESSAGE("숫자를 입력해주세요 : "),
    GAME_FINISH_MESSAGE("%s개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    GAME_REPLAY_MESSAGE("게임을 새로 시작하려면 %s, 종료하려면 %s를 입력하세요."),
    BALL("%s볼"),
    STRIKE("%s스트라이크"),
    NOTHING("낫싱");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
