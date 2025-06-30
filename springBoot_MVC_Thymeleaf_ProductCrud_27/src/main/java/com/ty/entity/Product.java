package com.ty.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	
	@NotBlank(message = "Name is mendatory")
	@Size(min = 3, max = 15, message = "Characters must be 3 to 15 character")
	private String name;
	
	@NotBlank(message = "Price is mendatory")
	@Positive
	private String price;
	
	@NotBlank(message = "Quantity is mendatory")
	@Positive
	private String qty;

}
