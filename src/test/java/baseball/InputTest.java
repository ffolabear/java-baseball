package baseball;

import camp.nextstep.edu.missionutils.test.Assertions;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static camp.nextstep.edu.missionutils.test.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class InputTest extends NsTest {


    @ParameterizedTest
    @ValueSource(strings = {"111", "fff", "   ", "1hf"})
    void 사용자_숫자입력_테스트(String input) {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException(input))
                        .isInstanceOf(IllegalArgumentException.class));
    }


    @ParameterizedTest
    @ValueSource(strings = {"11", "22", "fff", "   ", "1hf"})
    void 사용자_리플레이_명령어_테스트(String input) {
        assertSimpleTest(() ->
                assertThatThrownBy(() ->
                        assertRandomNumberInRangeTest(
                                () -> {
                                    runException("789", input);
                                }, 7, 8, 9
                        )).isInstanceOf(IllegalArgumentException.class));
    }


    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
