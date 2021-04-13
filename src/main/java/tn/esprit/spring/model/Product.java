package tn.esprit.spring.model;
//import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;
import javax.persistence.GenerationType;
@Entity
@Table(name = "product_database")

public class Product{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "id")
	private int IdProduct; // primary key

	@Temporal(TemporalType.DATE)
	private Date StartDate ;

	@Temporal(TemporalType.DATE)
	private Date ExpireDate ;
	@Column (name = "description")
	private String Description ;
	@Column (name ="feedback")
	private String Feedback ;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int idProduct, Date startDate, Date expireDate, String description, String feedback) {
		super();
		IdProduct = idProduct;
		StartDate = startDate;
		ExpireDate = expireDate;
		Description = description;
		Feedback = feedback;
	}
	public int getIdProduct() {
		return IdProduct;
	}
	public void setIdProduct(int idProduct) {
		IdProduct = idProduct;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getExpireDate() {
		return ExpireDate;
	}
	public void setExpireDate(Date expireDate) {
		ExpireDate = expireDate;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
	@Override
	public String toString() {
		return "Product{" + "id" +IdProduct + 
				",StartDate ='" + StartDate + '\'' +
				",ExpireDate ='" +ExpireDate + '\'' +
				",Description ='" +Description + '\'' +
				",Feedback ='" +ExpireDate + '\'' +
				'}' ;
				
		
	}

}
