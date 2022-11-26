package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.service.GameAttribute.*;

public class NumberGenerator {

    private final List<Integer> generatedNumber;

    public NumberGenerator() {
        generatedNumber = new ArrayList<>();
    }

    public void generate() {
        while (generatedNumber.size() < 3) {
            int number = makeNumber();
            isDuplicatedNumber(number);
        }
    }

    private int makeNumber() {
        return Randoms.pickNumberInRange(START_NUMBER.getAttribute(), END_NUMBER.getAttribute());
    }

    private void isDuplicatedNumber(int number) {
        if (!generatedNumber.contains(number)) {
            generatedNumber.add(number);
        }
    }

    public List<Integer> getGeneratedNumber() {
        return generatedNumber;
    }

}
