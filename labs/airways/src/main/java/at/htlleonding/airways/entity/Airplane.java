package at.htlleonding.airways.entity;


import io.quarkus.security.IdentityAttribute;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    //region getter and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    //endregion


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
