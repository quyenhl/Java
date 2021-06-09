import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


class EmailTest {
    @Test
    public  void emailTest(){
        String email = "quyenhoang12@onemount.com";
        assertThat(email).isNotNull()
                         .containsOnlyOnce("@")
                         .doesNotContain(" ").doesNotContain("$")
                         .doesNotContain("%").doesNotContain("^").doesNotContain("&").doesNotContain("*")
                         .doesNotStartWith("@").doesNotStartWith(".")
                         .doesNotEndWith("@").doesNotEndWith(".")
                         .containsPattern("^[a-zA-Z0-9][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,4})$");
    }
    @Test
    void Weight() {
        double weight = 51.5;
        assertThat(weight).isNotZero()
                .isNotNull()
                .isGreaterThan(0.0)
                .isBetween(0.0, 150.0);
    }

}