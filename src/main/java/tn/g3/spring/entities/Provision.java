package tn.g3.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Provision")
public class Provision  implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="IdProvision")
	private int idprovision ;

	@Column(name="Description")
	private String description;

	@Enumerated(EnumType.STRING)
	private TypeProvision typesinistre;

	@Column(name="Price")
	private float price;

	public int getIdprovision() {
		return idprovision;
	}

	public void setIdprovision(int idprovision) {
		this.idprovision = idprovision;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TypeProvision getTypesinistre() {
		return typesinistre;
	}

	public void setTypesinistre(TypeProvision typesinistre) {
		this.typesinistre = typesinistre;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + idprovision;
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((typesinistre == null) ? 0 : typesinistre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provision other = (Provision) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idprovision != other.idprovision)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (typesinistre != other.typesinistre)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Provision [idprovision=" + idprovision + ", description=" + description + ", typesinistre="
				+ typesinistre + ", price=" + price + "]";
	}

	public Provision(int idprovision, String description, TypeProvision typesinistre, float price) {
		this.idprovision = idprovision;
		this.description = description;
		this.typesinistre = typesinistre;
		this.price = price;
	}

	public Provision() {}

	public Provision(String description, TypeProvision typesinistre, float price) {
		this.description = description;
		this.typesinistre = typesinistre;
		this.price = price;
	}
	

}
