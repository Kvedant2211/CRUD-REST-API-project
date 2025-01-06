package com.vedant.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

//    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern = "dd-MM-yy")
    private Date releaseDate;
    private int stockQuantity;
    private boolean productAvailable;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImageDate() {
        return imageDate;
    }

    public void setImageDate(byte[] imageDate) {
        this.imageDate = imageDate;
    }
}
