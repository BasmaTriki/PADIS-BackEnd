package pfe.projet.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Enfant implements Serializable {
	@Id
	@GeneratedValue
private long num;
private String nom;
private Date date_nais;
@ManyToOne
@JoinColumn(name="matricule",referencedColumnName="matricule")
private Personnel personnel;
public Enfant() {
	super();
	// TODO Auto-generated constructor stub
}
public long getNum() {
	return num;
}
public void setNum(long num) {
	this.num = num;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Date getDate_nais() {
	return date_nais;
}
public void setDate_nais(Date date_nais) {
	this.date_nais = date_nais;
}
public Personnel getPersonnel() {
	return personnel;
}
public void setPersonnel(Personnel personnel) {
	this.personnel = personnel;
}

}
