package baseball.service;

import java.util.List;

public class RoundJudge {

    private final List<Integer> computerNumber;
    private final List<Integer> userNumber;
    private int ball;
    private int strike;

    public RoundJudge(List<Integer> computerNumber, List<Integer> userNumber) {
        this.computerNumber = computerNumber;
        this.userNumber = userNumber;
    }

    public void judge() {
        for (int number : computerNumber) {
            judgeBall(number);
            judgeStrike(number);
        }
    }

    public int getBallCount() {
        return ball;
    }

    public int getStrikeCount() {
        return strike;
    }

    private void judgeBall(int number) {
        if (userNumber.contains(number) && computerNumber.indexOf(number) != userNumber.indexOf(number)) {
            ball++;
        }
    }

    private void judgeStrike(int number) {
        if (userNumber.contains(number) && computerNumber.indexOf(number) == userNumber.indexOf(number)) {
            strike++;
        }
    }

}
