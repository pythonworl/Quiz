package com.example.quizproject.entity;


import jakarta.persistence.*;

@Entity (name = "product")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Column(nullable = false)
    private String productName;

    @Column(nullable = false,length = 50)
    private String productType;

    @Column(nullable = false,length = 50)
    private String productPrice;

    @Column(nullable = false,length = 50)
    private String productDiscription;

    @Column(nullable = false,length = 50)
    private String productRating;

    public String getProductname() {
        return productName;
    }

    public void setProductname(String productName) {
        this.productName = productName;
    }

    public String getProducttype() {
        return productType;
    }

    public void setProducttype(String productType) {
        this.productType = productType;
    }

    public String getProductprice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDiscription() {
        return productDiscription;
    }

    public void setProductDiscription(String productDiscription) {
        this.productDiscription = productDiscription;
    }

    public String getProductrating() {
        return productRating;
    }

    public void setProductrating(String productRating) {
        this.productRating = productRating;
    }
}
