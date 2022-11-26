package baseball.service;

public enum GameAttribute {

    START_NUMBER(1),
    END_NUMBER(9),
    GAME_END(3);

    private final int attribute;

    GameAttribute(int attribute) {
        this.attribute = attribute;
    }

    public int getAttribute() {
        return attribute;
    }
}
