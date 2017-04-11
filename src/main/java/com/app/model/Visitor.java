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
@Table(name="Visitor")

public class Visitor {
	@Id
	@Column(name="VisitorId")
	@GeneratedValue
	private int VisitorId;
	

	@NotEmpty
	private String password;
	
	@NotEmpty
	private String VisitorName;
	
	@NotEmpty
	private String VisitorEmail;
	@NotEmpty
	private String VisitorPhone;
	@Transient
	private MultipartFile photo;
	
	@Lob private byte[] photoBytes;
	
	private String photoContentType; 
	
	private String photoFilename;
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVisitorEmail() {
		return VisitorEmail;
	}

	public void setVisitorEmail(String visitorEmail) {
		VisitorEmail = visitorEmail;
	}

	public String getVisitorPhone() {
		return VisitorPhone;
	}

	public void setVisitorPhone(String visitorPhone) {
		VisitorPhone = visitorPhone;
	}

	
	
	
	
	
	public int getVisitorId() {
		return VisitorId;
	}

	public void setVisitorId(int VisitorId) {
		this.VisitorId = VisitorId;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getVisitorName() {
		return VisitorName;
	}

	public void setVisitorName(String VisitorName) {
		this.VisitorName = VisitorName;
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
