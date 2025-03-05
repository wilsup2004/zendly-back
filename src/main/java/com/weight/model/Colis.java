package com.weight.model;
// Generated 10 f�vr. 2025, 20:27:41 by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


/**
 * Colis generated by hbm2java
 */
@Entity
@Table(name = "COLIS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Colis implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_COLIS")
	private Integer idColis;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_STATUT")
	private Statuts statuts;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USER", nullable = false)
	private Users users;
	
	@Column(name = "LONGUEUR", nullable = false, precision = 10)
	private BigDecimal longueur;
	
	@Column(name = "LARGEUR", nullable = false, precision = 10)
	private BigDecimal largeur;
	
	@Column(name = "HAUTEUR", nullable = false, precision = 10)
	private BigDecimal hauteur;
	
	@Column(name = "NB_KILO", precision = 10)
	private BigDecimal nbKilo;
	
	@Column(name = "TARIF", precision = 10)
	private BigDecimal tarif;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORODATAGE")
	private Date horodatage;
	
	@Column(name = "VILLE_DEPART")
	private String villeDepart;
	
	@Column(name = "VILLE_ARRIVEE")
	private String villeArrivee;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "PHOTO_PATH")
	private String photoPath;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "colis")
	private Set<PriseEnCharge> priseEnCharges = new HashSet<PriseEnCharge>(0);

	public Colis() {
	}

	public Colis(Integer idColis, Users users, BigDecimal longueur, BigDecimal largeur, BigDecimal hauteur, Date horodatage,
			String villeDepart, String villeArrivee, String description) {
		this.idColis = idColis;
		this.users = users;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.horodatage = horodatage;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.description = description;
	}

	public Colis(Integer idColis, Statuts statuts, Users users, BigDecimal longueur, BigDecimal largeur, BigDecimal hauteur,
			BigDecimal nbKilo,BigDecimal tarif, Date horodatage, String villeDepart, String villeArrivee, String description,
			String photoPath) {
		this.idColis = idColis;
		this.statuts = statuts;
		this.users = users;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.nbKilo = nbKilo;
		this.tarif = tarif;
		this.horodatage = horodatage;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.description = description;
		this.photoPath = photoPath;
	}
	
	public Colis(Statuts statuts, Users users, BigDecimal longueur, BigDecimal largeur, BigDecimal hauteur,
			BigDecimal nbKilo, BigDecimal tarif, Date horodatage, String villeDepart, String villeArrivee,
			String description, String photoPath, Set<PriseEnCharge> priseEnCharges) {
		this.statuts = statuts;
		this.users = users;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.nbKilo = nbKilo;
		this.tarif = tarif;
		this.horodatage = horodatage;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.description = description;
		this.photoPath = photoPath;
		this.priseEnCharges = priseEnCharges;
	}
	
	public void setColis(Statuts statuts, Users users, BigDecimal longueur, BigDecimal largeur, BigDecimal hauteur,
			BigDecimal nbKilo, BigDecimal tarif, Date horodatage, String villeDepart, String villeArrivee, String description,
			String photoPath) {
		this.statuts = statuts;
		this.users = users;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.nbKilo = nbKilo;
		this.tarif = tarif;
		this.horodatage = horodatage;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.description = description;
		this.photoPath = photoPath;
	}
	
	public void setColis(Statuts statuts, BigDecimal longueur, BigDecimal largeur, BigDecimal hauteur,
			BigDecimal nbKilo, BigDecimal tarif, String villeDepart, String villeArrivee, String description) {
		this.statuts = statuts;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.nbKilo = nbKilo;
		this.tarif = tarif;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.description = description;
	}
	

	public Integer getIdColis() {
		return this.idColis;
	}

	public void setIdColis(int idColis) {
		this.idColis = idColis;
	}

	public Statuts getStatuts() {
		return this.statuts;
	}

	public void setStatuts(Statuts statuts) {
		this.statuts = statuts;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public BigDecimal getLongueur() {
		return this.longueur;
	}

	public void setLongueur(BigDecimal longueur) {
		this.longueur = longueur;
	}

	public BigDecimal getLargeur() {
		return this.largeur;
	}

	public void setLargeur(BigDecimal largeur) {
		this.largeur = largeur;
	}

	public BigDecimal getHauteur() {
		return this.hauteur;
	}

	public void setHauteur(BigDecimal hauteur) {
		this.hauteur = hauteur;
	}

	public BigDecimal getNbKilo() {
		return this.nbKilo;
	}

	public void setNbKilo(BigDecimal nbKilo) {
		this.nbKilo = nbKilo;
	}
	

	public BigDecimal getTarif() {
		return this.tarif;
	}

	public void setTarif(BigDecimal tarif) {
		this.tarif = tarif;
	}

	public Date getHorodatage() {
		return this.horodatage;
	}

	public void setHorodatage(Date horodatage) {
		this.horodatage = horodatage;
	}

	public String getVilleDepart() {
		return this.villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public String getVilleArrivee() {
		return this.villeArrivee;
	}

	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
	public Set<PriseEnCharge> getPriseEnCharges() {
		return this.priseEnCharges;
	}

	public void setPriseEnCharges(Set<PriseEnCharge> priseEnCharges) {
		this.priseEnCharges = priseEnCharges;
	}


}
