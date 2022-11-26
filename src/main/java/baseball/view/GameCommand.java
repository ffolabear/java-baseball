package baseball.view;

public enum GameCommand {

    REPLAY("1"),
    QUIT("2");

    private final String attribute;

    GameCommand(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }
}
