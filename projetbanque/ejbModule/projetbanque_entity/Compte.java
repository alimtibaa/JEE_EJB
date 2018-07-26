package projetbanque_entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;


@Entity
@Table (name="COMPTE")
public class Compte implements Serializable	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODE_CMP")
	private int code;
	@Column(name="SOLDE")
	private double solde ;
	@Column(name="DATE_CREAT")
	private String datecreat;
	
	public Compte() {
		super();
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.datecreat= dateFormat.format(date);
	}
	public Compte(int id) {
		super();
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.datecreat= dateFormat.format(date);
		this.client.setId(id);
	}
	public Compte(double solde, String datecreat) {
		super();
		this.solde = solde;
		this.datecreat = datecreat;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public String getDatecreat() {
		return datecreat;
	}
	public void setDatecreat(String datecreat) {
		this.datecreat = datecreat;
	}
	@ManyToOne
	@JoinColumn(name="Code_Cli")
	private Client client;
}
