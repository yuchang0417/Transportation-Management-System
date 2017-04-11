package com.app.model;
// Generated 2015-12-12 22:57:18 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Receiver generated by hbm2java
 */
@Entity
@Table(name = "receiver", catalog = "mydb")
public class Receiver implements java.io.Serializable {

	private Integer receiverId;
	private User user;
	private Set orders = new HashSet(0);

	public Receiver() {
	}

	public Receiver(User user) {
		this.user = user;
	}

	public Receiver(User user, Set orders) {
		this.user = user;
		this.orders = orders;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ReceiverID", unique = true, nullable = false)
	public Integer getReceiverId() {
		return this.receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserID", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "receiver")
	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}