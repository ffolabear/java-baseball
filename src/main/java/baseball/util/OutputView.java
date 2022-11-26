package baseball.util;

import baseball.service.GameAttribute;

import static baseball.view.GameCommand.*;
import static baseball.view.Messages.*;

public class OutputView {

    public static void gameStartMessage() {
        System.out.println(GAME_START_MESSAGE.getMessage());
    }

    public static void inputNumberMessage() {
        System.out.print(NUMBER_INPUT_MESSAGE.getMessage());
    }

    public static void gameFinishMessage() {
        System.out.printf((GAME_FINISH_MESSAGE.getMessage()) + "%n", GameAttribute.GAME_END.getAttribute());
    }

    public static void gameReplayMessage() {
        System.out.printf((GAME_REPLAY_MESSAGE.getMessage()) + "%n", REPLAY.getAttribute(), QUIT.getAttribute());
    }

    public static void printRoundResult(int ballCount, int strikeCount) {
        System.out.println(roundResult(ballCount, strikeCount));
    }

    private static String roundResult(int ballCount, int strikeCount) {
        if (ballCount == 0 && strikeCount == 0) {
            return nothingMessage();
        }
        return complexMessage(ballCount, strikeCount);
    }

    private static String singleResult(int ballCount, int strikeCount) {
        if (ballCount == 0) {
            return strikeMessage(strikeCount);
        }
        return ballMessage(ballCount);
    }

    private static String complexMessage(int ballCount, int strikeCount) {
        if ((ballCount == 0 && strikeCount != 0) || (strikeCount == 0 && ballCount != 0)) {
            return singleResult(ballCount, strikeCount);
        }
        return ballMessage(ballCount) + " " + strikeMessage(strikeCount);
    }

    private static String ballMessage(int ballCount) {
        return String.format(BALL.getMessage(), ballCount);
    }

    private static String strikeMessage(int strikeCount) {
        return String.format(STRIKE.getMessage(), strikeCount);
    }

    private static String nothingMessage() {
        return NOTHING.getMessage();
    }
}
