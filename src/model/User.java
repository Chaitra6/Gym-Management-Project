package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_blog")
	@SequenceGenerator(name = "seq_blog", sequenceName = "seq_blog", allocationSize = 1, initialValue = 1)
	private int userId;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="SUBSCRIPTION_PRICE")
	private int price;
	
	@Column(name="SUBSCRIBED_DATE")
	private LocalDate subs_date;
	
	@Column(name="SUBS_EXP_DATE")
	private LocalDate subs_exp_date;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getSubs_date() {
		return subs_date;
	}

	public void setSubs_date(LocalDate subs_date) {
		this.subs_date = subs_date;
	}

	public LocalDate getSubs_exp_date() {
		return subs_exp_date;
	}

	public void setSubs_exp_date(LocalDate subs_exp_date) {
		this.subs_exp_date = subs_exp_date;
	}
	
	

	
}
