package tn.g3.spring.entities;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Sinistre")
public class Sinistre implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="IdSinistre")
	private int idSinistre ;
	
    @Enumerated(EnumType.STRING)
    @Column(name="TypeSinistre")
	TypeSinistre typeSinistre;
     
	private String description;
	@Temporal(TemporalType.DATE)
    @Column(name="DateOccurence")
	private Date dateOccurence;
	
	@Enumerated(EnumType.STRING)
    @Column(name="Status")
	Status status;
	
	@Column(name="Documents")
	private File documents ;



	public int getIdSinistre() {
		return idSinistre;
	}

	public void setIdSinistre(int idSinistre) {
		this.idSinistre = idSinistre;
	}

	public TypeSinistre getTypeSinistre() {
		return typeSinistre;
	}

	public void setTypeSinistre(TypeSinistre typeSinistre) {
		this.typeSinistre = typeSinistre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOccurence() {
		return dateOccurence;
	}

	public void setDateOccurence(Date dateOccurence) {
		this.dateOccurence = dateOccurence;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public File getDocuments() {
		return documents;
	}

	public void setDocuments(File documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Sinistre [idSinistre=" + idSinistre + ", typeSinistre=" + typeSinistre + ", description=" + description
				+ ", dateOccurence=" + dateOccurence + ", status=" + status + ", documents=" + documents + "]";
	}

	public Sinistre(int idSinistre, TypeSinistre typeSinistre, String description, Date dateOccurence, Status status,
			File documents) {
	
		this.idSinistre = idSinistre;
		this.typeSinistre = typeSinistre;
		this.description = description;
		this.dateOccurence = dateOccurence;
		this.status = status;
		this.documents = documents;
	}

	public Sinistre(TypeSinistre typeSinistre, String description, Date dateOccurence, Status status, File documents) {
	
		this.typeSinistre = typeSinistre;
		this.description = description;
		this.dateOccurence = dateOccurence;
		this.status = status;
		this.documents = documents;
	}

	public Sinistre() {}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOccurence == null) ? 0 : dateOccurence.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((documents == null) ? 0 : documents.hashCode());
		result = prime * result + idSinistre;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((typeSinistre == null) ? 0 : typeSinistre.hashCode());
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
		Sinistre other = (Sinistre) obj;
		if (dateOccurence == null) {
			if (other.dateOccurence != null)
				return false;
		} else if (!dateOccurence.equals(other.dateOccurence))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (documents == null) {
			if (other.documents != null)
				return false;
		} else if (!documents.equals(other.documents))
			return false;
		if (idSinistre != other.idSinistre)
			return false;
		if (status != other.status)
			return false;
		if (typeSinistre != other.typeSinistre)
			return false;
		return true;
	}


	
	


}
