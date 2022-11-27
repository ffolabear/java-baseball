package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class GameTest extends NsTest {

    @Test
    void 낫싱_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("123", "456", "2");
                    assertThat(output()).contains("낫싱");
                }, 4, 5, 6
        );
    }

    @Test
    void 스트라이크_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("546", "456", "2");
                    assertThat(output()).contains("2볼 1스트라이크");
                }, 4, 5, 6
        );
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
