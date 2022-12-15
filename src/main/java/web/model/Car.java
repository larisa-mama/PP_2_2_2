package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {      // бин класса не создаем, нужен бин только сервиса
    private String brand;
    private String model;
    private String drive;

    public Car() {
    }

    public Car(String brand, String model, String drive) {
        this.brand = brand;
        this.model = model;
        this.drive = drive;
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

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", drive='" + drive + '\'' +
                '}';
    }
}
