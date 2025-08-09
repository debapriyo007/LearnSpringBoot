package com.debu.Ecom_proj.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isProductAvailable() {
        return productAvailable;
    }

    public void setProductAvailable(boolean productAvailable) {
        this.productAvailable = productAvailable;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

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

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
}

//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//
//public class Product {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int prodId;
//
//    private String prodName;
//    private String prodDesc;
//    private String prodBrand;
//    private BigDecimal prodPrice;
//    private String prodCategory;
//    private int quantity;
//    private Date releaseDate;
//    private boolean productAvailable;
//
//    public boolean isProductAvailable() {
//        return productAvailable;
//    }
//
//    public void setProductAvailable(boolean productAvailable) {
//        this.productAvailable = productAvailable;
//    }
//
//    public Date getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(Date releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    private String imageName;
//    private String imageType;
//
//    public String getImageName() {
//        return imageName;
//    }
//
//    public void setImageName(String imageName) {
//        this.imageName = imageName;
//    }
//
//    public String getImageType() {
//        return imageType;
//    }
//
//    public void setImageType(String imageType) {
//        this.imageType = imageType;
//    }
//
//    public byte[] getImageData() {
//        return imageData;
//    }
//
//    public void setImageData(byte[] imageData) {
//        this.imageData = imageData;
//    }
//
//    @Lob
//    private byte[] imageData;
//
//
//    public int getProdId() {
//        return prodId;
//    }
//
//    public void setProdId(int prodId) {
//        this.prodId = prodId;
//    }
//
//    public String getProdName() {
//        return prodName;
//    }
//
//    public void setProdName(String prodName) {
//        this.prodName = prodName;
//    }
//
//    public String getProdDesc() {
//        return prodDesc;
//    }
//
//    public void setProdDesc(String prodDesc) {
//        this.prodDesc = prodDesc;
//    }
//
//    public String getProdBrand() {
//        return prodBrand;
//    }
//
//    public void setProdBrand(String prodBrand) {
//        this.prodBrand = prodBrand;
//    }
//
//    public BigDecimal getProdPrice() {
//        return prodPrice;
//    }
//
//    public void setProdPrice(BigDecimal prodPrice) {
//        this.prodPrice = prodPrice;
//    }
//
//    public String getProdCategory() {
//        return prodCategory;
//    }
//
//    public void setProdCategory(String prodCategory) {
//        this.prodCategory = prodCategory;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "prodId=" + prodId +
//                ", prodName='" + prodName + '\'' +
//                ", prodDesc='" + prodDesc + '\'' +
//                ", prodBrand='" + prodBrand + '\'' +
//                ", prodPrice=" + prodPrice +
//                ", prodCategory='" + prodCategory + '\'' +
//                ", quantity=" + quantity +
//                '}';
//    }
//
//}
