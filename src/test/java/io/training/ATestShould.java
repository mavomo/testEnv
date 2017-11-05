package io.training;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ATestShould {

    @Test
    public void should_fail() {
        Assertions.assertThat(2 + 2).isEqualTo(5);
    }
}
