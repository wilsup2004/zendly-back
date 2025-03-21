package com.weight.model;
// Generated 1 oct. 2023, 21:30:36 by Hibernate Tools 5.4.33.Final

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * TranspTrade generated by hbm2java
 */
@Entity
@Table(name = "transp_trade")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TranspTrade implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idDipso", column = @Column(name = "id_dispo", nullable = false)),
			@AttributeOverride(name = "idUserCandidat", column = @Column(name = "id_user_candidat", nullable = false, length = 50)) })
	private TranspTradeId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_statut")
	private Statuts statuts;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user")
	private Users users;
	
	@Column(name = "nb_kilo_achete")
	private Integer nbKiloAchete;

	public TranspTrade() {
	}

	public TranspTrade(TranspTradeId id, Users users) {
		this.id = id;
		this.users = users;
	}

	public TranspTrade(TranspTradeId id, Statuts statuts, Users users, Integer nbKiloAchete) {
		this.id = id;
		this.statuts = statuts;
		this.users = users;
		this.nbKiloAchete = nbKiloAchete;
	}

	public TranspTradeId getId() {
		return this.id;
	}

	public void setId(TranspTradeId id) {
		this.id = id;
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

	public Integer getNbKiloAchete() {
		return this.nbKiloAchete;
	}

	public void setNbKiloAchete(Integer nbKiloAchete) {
		this.nbKiloAchete = nbKiloAchete;
	}

}
