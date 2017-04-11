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
@Table(name="manager")
public class Manager 
{
	@Id
	@Column(name="managerId")
	@GeneratedValue
	private int managerId;
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String ManagerName;
	
	
	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}

	public String getManagerEmail() {
		return ManagerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		ManagerEmail = managerEmail;
	}

	@NotEmpty
	private String ManagerEmail;
	
	@NotEmpty
	private String position;
	@NotEmpty
	private String Describtion;
	
	@Transient
	private MultipartFile photo;
	
	@Lob private byte[] photoBytes;
	
	private String photoContentType; 
	
	private String photoFilename;
	
	

	
	
	
	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDescribtion() {
		return Describtion;
	}

	public void setDescribtion(String describtion) {
		Describtion = describtion;
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
