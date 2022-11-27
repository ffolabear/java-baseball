package baseball.service;

import baseball.util.InputView;
import baseball.util.OutputView;
import baseball.view.GameCommand;

import java.util.List;

public class Game {

    private List<Integer> computerNumber;
    private final InputView inputView = new InputView();

    public void startGame() {
        OutputView.gameStartMessage();
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.generate();
        computerNumber = numberGenerator.getGeneratedNumber();
        startRound();
    }

    public void startRound() {
        Round round = new Round(computerNumber);
        playRound(round);
    }

    public void playRound(Round round) {
        while (!round.isRoundFinished) {
            round.setUserNumber(inputView.inputNumber());
            round.judgeRound();
            round.printResult();
        }
        OutputView.gameFinishMessage();
        replayGame();
    }

    public void replayGame() {
        OutputView.gameReplayMessage();
        String command = inputView.inputRetryCommand();
        if (command.equals(GameCommand.REPLAY.getAttribute())) {
            startGame();
        }
    }

}
