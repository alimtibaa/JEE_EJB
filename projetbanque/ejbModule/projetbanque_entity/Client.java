package projetbanque_entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table (name="CLIENT")
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODE_CLT")
	private int id;
	@Column(name="NAME")
	private String nom ;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="TEL")
	private String tel;
	
	public Client() {
		super();
	}

	public Client(String nom, String address, String tel, Collection<Compte> comptes) {
		super();
		this.nom = nom;
		this.address = address;
		this.tel = tel;
		this.comptes = comptes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	@OneToMany(mappedBy="client",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<Compte>comptes;
	

}
