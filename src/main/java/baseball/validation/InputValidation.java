package baseball.validation;

import java.util.List;

public class InputValidation {

    public void isNumberDigit(String input) {
        if (!input.matches("[0-9]+")) {
            throw new IllegalArgumentException();
        }
    }

    public void isValidNumberAmount(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException();
        }
    }

    public void isDuplicatedNumberExist(String input) {
        List<String> splitInput = List.of(input.split(""));
        long numberAmount = splitInput.stream().distinct().count();
        if (splitInput.size() != numberAmount) {
            throw new IllegalArgumentException();
        }
    }

    public void isValidRetryCommand(String input) {
        if (!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException();
        }
    }
}
