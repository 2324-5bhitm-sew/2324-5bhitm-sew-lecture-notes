package at.htlleonding.airways.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;


class AirplaneTest {

    /**
     * https://codingnconcepts.com/java/java-test-single-assert-multiple-properties/
     */
    @Test
    void createAirplaneWithStandardConstructor() {
        Airplane airplane = new Airplane();
        airplane.setName("Mozart");
        airplane.setInServiceDate(LocalDate.of(2023, Month.SEPTEMBER, 28));
        assertThat(airplane).extracting("name", "inServiceDate")
                .doesNotContainNull()
                .containsExactly("Mozart", LocalDate.of(2023, Month.SEPTEMBER, 28));
    }
}