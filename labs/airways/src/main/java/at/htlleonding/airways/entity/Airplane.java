package at.htlleonding.airways.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;


@NamedQuery(
        name="Airplane.findAll",
        query = "select a from Airplane a"
)

@Entity
public class Airplane {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private LocalDate inServiceDate;
    private String brand;
    private String model;

    public Airplane() {
    }

    public Airplane(String name, LocalDate inServiceDate, String brand, String model) {
        this.name = name;
        this.inServiceDate = inServiceDate;
        this.brand = brand;
        this.model = model;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getInServiceDate() {
        return inServiceDate;
    }

    public void setInServiceDate(LocalDate inServiceDate) {
        this.inServiceDate = inServiceDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inServiceDate=" + inServiceDate +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
