package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringTest {
    @DisplayName("문자열을 split 함수로 분리할 수 있다")
    @Test
    void 문자열이_분리된다() {
        assertThat("1,2".split(",")).containsExactly("1", "2");
    }

    @DisplayName("하나의 문자열을 split 함수로 값을 반환할 수 있다")
    @Test
    void 하나의_문자열이_분리된다() {
        assertThat("1".split(",")).containsExactly("1");
    }
}
