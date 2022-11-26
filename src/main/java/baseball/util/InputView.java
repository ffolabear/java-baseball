package baseball.util;

import baseball.validation.InputValidation;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    InputValidation inputValidation = new InputValidation();

    public String inputNumber() {
        String input = Console.readLine();
        inputValidation.isNumberDigit(input);
        inputValidation.isValidNumberAmount(input);
        inputValidation.isDuplicatedNumberExist(input);
        return input;
    }

    public String inputRetryCommand() {
        String input = Console.readLine();
        inputValidation.isValidRetryCommand(input);
        return input;
    }

    public int convertToInt(String number) {
        return Integer.parseInt(number);
    }

    public List<Integer> convertToList(String input) {
        String[] numbers = input.split("");
        List<Integer> convertedNumbers = new ArrayList<>();
        for (String number : numbers) {
            convertedNumbers.add(convertToInt(number));
        }
        return convertedNumbers;
    }

}
