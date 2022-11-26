package baseball;

import baseball.service.NumberGenerator;
import baseball.service.Round;
import camp.nextstep.edu.missionutils.test.Assertions;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class GameTest extends NsTest {

    @Test
    void 낫싱_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("123");
                    assertThat(output()).contains("");
                } , 4,5,6
        );
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
