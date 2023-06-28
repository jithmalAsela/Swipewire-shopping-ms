package com.spring.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ProductCategory")
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = 8046162716367847201L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productcatid")
    private int productcatid;
    private String category;

    public ProductCategory() {

    }

    public int getProductcatid() {
        return productcatid;
    }

    public void setProductcatid(int productcatid) {
        this.productcatid = productcatid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProductCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "productcatid=" + productcatid +
                ", category='" + category + '\'' +
                '}';
    }
}
