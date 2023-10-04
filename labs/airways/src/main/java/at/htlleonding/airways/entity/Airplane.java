package at.htlleonding.airways.entity;


import java.time.LocalDate;

public class Airplane {

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

}
