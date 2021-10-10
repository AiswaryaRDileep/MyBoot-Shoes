package com.simplilearn.myboot.dto;



public class ProductDTO {
	
	private Long id;
	private String name;
	private int categoryId;
	private String brand;
	private double price;
	private double size;
	private String color;
	private String description;
	private String imageName;
	
	
	
	public ProductDTO() {
	}
	


	public ProductDTO(String name, int categoryId, String brand, double price, double size, String color,
			String description, String imageName) {
		super();
		this.name = name;
		this.categoryId = categoryId;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.color = color;
		this.description = description;
		this.imageName = imageName;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
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
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}



	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", categoryId=" + categoryId + ", brand=" + brand
				+ ", price=" + price + ", size=" + size + ", color=" + color + ", description=" + description
				+ ", imageName=" + imageName + "]";
	}

	

	
	
	

}
