package com.app.model;

import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")

public class product {
	@Id
	@Column(name="productId")
	@GeneratedValue
	private int productId;
	

	@NotEmpty
	private String productType;
	
	@NotEmpty
	private String productName;
	
	@Transient
	private MultipartFile photo;
	
	@Lob private byte[] photoBytes;
	
	private String photoContentType; 
	
	private String photoFilename;
	
	
	
	
	
	public int getproductId() {
		return productId;
	}

	public void setproductId(int productId) {
		this.productId = productId;
	}

	public String getproductType() {
		return productType;
	}

	public void setproductType(String productType) {
		this.productType = productType;
	}

	public String getproductName() {
		return productName;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}
	
	
	@Autowired
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
		
		setPhotoContentType(photo.getContentType());
		setPhotoFilename(photo.getOriginalFilename());
		try {
			setPhotoBytes(photo.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	public MultipartFile getPhoto() {
		return photo;
	}

	
	public byte[] getPhotoBytes() {
		return photoBytes;
	}

	public void setPhotoBytes(byte[] photoBytes) {
		this.photoBytes = photoBytes;
	}

	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	public String getPhotoFilename() {
		return photoFilename;
	}

	public void setPhotoFilename(String photoFilename) {
		this.photoFilename = photoFilename;
	}

}
