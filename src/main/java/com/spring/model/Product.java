package com.spring.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product implements Serializable {

	private static final long serialVersionUID = -7446162716367847201L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	private String description;
	private String productname;
	private double price;
	private int quantity;
	@Lob
	private byte[] productimage;
	private int productcatid;

	@ManyToOne
	@JoinColumn(name = "productcatid", referencedColumnName = "productcatid",  insertable=false, updatable=false)
	private ProductCategory productCategory;

	public int getProductcatid() {
		return productcatid;
	}

	public void setProductcatid(int productcatid) {
		this.productcatid = productcatid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public byte[] getProductimage() {
		return productimage;
	}

	public void setProductimage(byte[] productimage) {
		this.productimage = productimage;
	}

	public Product() {
		super();
	}

	public Product(int productid, String description, String productname, double price, int quantity,
			byte[] productimage, int productcatid) {
		super();
		this.productid = productid;
		this.description = description;
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
		this.productimage = productimage;
		this.productcatid = productcatid;
	}
}