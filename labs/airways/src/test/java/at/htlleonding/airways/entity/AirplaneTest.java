package at.htlleonding.airways.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {

    @Test
    void createEntity() {

        Airplane airplane = new Airplane("Herbie", LocalDate.now(), "Airbus", "A380NEO");

        assertThat(airplane)
                .extracting("brand","name","inServiceDate","model")
                .containsExactly("Airbus", "Herbie", LocalDate.now(),"A380NEO")
                ;


    }
}