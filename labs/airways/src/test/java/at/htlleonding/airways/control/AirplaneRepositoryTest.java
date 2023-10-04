package at.htlleonding.airways.control;

import at.htlleonding.airways.entity.Airplane;
import io.agroal.api.AgroalDataSource;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.assertj.db.type.Table;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.db.api.Assertions.assertThat;
import static org.assertj.db.output.Outputs.output;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class AirplaneRepositoryTest {

    @Inject
    AirplaneRepository airplaneRepository;

    @Inject
    AgroalDataSource ds;

    @Test
    @Transactional
    void createAirplane() {
        // arrange
        Airplane herbie = new Airplane("Herbie", LocalDate.now(),"Airbus","A380NEO");

        // act
        airplaneRepository.persist(herbie);
        herbie = null;


        // assert
        Table airplanes = new Table(ds, "AIRPLANE");
        output(airplanes).toConsole();

        herbie = airplaneRepository.find("name","Herbie").firstResult();

        assertThat(airplanes).row(0)
                .value("ID").isEqualTo(1L)
                .value("BRAND").isEqualTo("Airbus")
                .value("MODEL").isEqualTo("A380NEO")
                .value("INSERVICEDATE").isEqualTo(LocalDate.now().toString())
                .value("NAME").isEqualTo("Herbie");
    }
}