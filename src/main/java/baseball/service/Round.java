package baseball.service;

import baseball.util.OutputView;

import java.util.List;

public class Round {

    private final List<Integer> computerNumber;
    private List<Integer> userNumber;
    private int ballCount;
    private int strikeCount;
    public boolean isRoundFinished = false;

    public Round(List<Integer> computerNumber) {
        this.computerNumber = computerNumber;
    }

    public void setUserNumber(List<Integer> userInput) {
        OutputView.inputNumberMessage();
        userNumber = userInput;
    }

    public void judgeRound() {
        RoundJudge roundJudge = new RoundJudge(computerNumber, userNumber);
        roundJudge.judge();
        ballCount = roundJudge.getBallCount();
        strikeCount = roundJudge.getStrikeCount();
        if (strikeCount == 3) {
            isRoundFinished = true;
        }
    }

    public void printResult() {
        OutputView.printRoundResult(ballCount, strikeCount);
    }


}
