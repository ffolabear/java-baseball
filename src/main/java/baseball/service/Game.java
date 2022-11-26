package baseball.service;

import baseball.util.InputView;
import baseball.util.OutputView;
import baseball.view.GameCommand;

import java.util.List;

public class Game {

    NumberGenerator numberGenerator;
    private List<Integer> computerNumber;

    public void startGame() {
        OutputView.gameStartMessage();
        numberGenerator = new NumberGenerator();
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
            round.inputNumber();
            round.judgeRound();
            round.printResult();
        }
        OutputView.gameFinishMessage();
        replayGame();
    }

    public void replayGame() {
        OutputView.gameReplayMessage();
        InputView inputView = new InputView();
        String command = inputView.inputRetryCommand();
        if (command.equals(GameCommand.REPLAY.getAttribute())) {
            startGame();
        }
    }

}
