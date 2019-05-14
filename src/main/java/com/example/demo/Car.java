package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
    @NotNull
    @Size(min = 2, max = 10)
    private String make;

    @NotNull
    @Size(min = 2, max = 10)
    private String model;

    @NotNull
    @Size(min = 2, max = 15)
    private String color;

    @NotNull
    @Size(min = 5, max = 30)
    private String description;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
