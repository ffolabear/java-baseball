package baseball;

import camp.nextstep.edu.missionutils.test.Assertions;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class OutputTest extends NsTest {

    @Test
    void 시스템_메세지_출력_테스트() {
        Assertions.assertRandomNumberInRangeTest(
                () -> {
                    run("456", "132", "231", "321", "2");
                    assertThat(output()).contains(
                            "숫자 야구 게임을 시작합니다.",
                            "숫자를 입력해주세요 : ",
                            "3개의 숫자를 모두 맞히셨습니다! 게임 종료",
                            "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                }, 3, 2, 1
        );
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
