package pfe.projet.entities;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class OrganismeAccueil implements Serializable{
	@Id 
	@GeneratedValue
   private long idOrg;
   private String libelleOrg;
   @OneToMany
   private Collection<Mutation> mutation;
public OrganismeAccueil() {
	super();
	// TODO Auto-generated constructor stub
}
public long getIdOrg() {
	return idOrg;
}
public void setIdOrg(long idOrg) {
	this.idOrg = idOrg;
}
public String getLibelleOrg() {
	return libelleOrg;
}
public void setLibelleOrg(String libelleOrg) {
	this.libelleOrg = libelleOrg;
}
public Collection<Mutation> getMutation() {
	return mutation;
}
public void setMutation(Collection<Mutation> mutation) {
	this.mutation = mutation;
}


}