package com.pbcomponentes.laptop_shop.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private String processor;
    private String disc;
    private String graphics;
    private String screenType;
    private String model;
    public Laptop(){

    }



    public Laptop(Long id, Double price, String processor, String disc, String graphics, String screentype, String model){
        this.id = id;
        this.price = price;
        this.processor = processor;
        this.disc = disc;
        this.graphics = graphics;
        this.screenType = screenType;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                ", disc='" + disc + '\'' +
                ", graphics='" + graphics + '\'' +
                ", screenType='" + screenType + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
