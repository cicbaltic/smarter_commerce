package com.smartercommerce.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Item")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Size(min=3, max=50)
	@Column(name= "NAME", nullable=false)
	private String name;
	
	@NotNull
	@Column(name = "CATEGORY", nullable = false)
	private String category;
	
	@NotNull
    @Column(name = "PRICE", nullable = false)
	private double price;
	
	@NotNull
	@Column(name="SIZE", nullable = false)
	private String size;
	
	@NotNull
	@Column(name="COLOR", nullable = false)
	private String color;
	
	@NotNull
	@Column(name="DESCRIPTION", nullable = false)
	private String description;
	
	@NotNull
	@Column(name="QUANTITY", nullable = false)
	private double quantity;
	
	@Column(name="IMAGE_URL")
	private String image_url;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
	

}
