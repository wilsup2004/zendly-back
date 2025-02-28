package com.weight.model;
// Generated 23 f�vr. 2025, 22:59:35 by Hibernate Tools 4.3.6.Final

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

/**
 * Messages generated by hbm2java
 */
@Entity
@Table(name = "messages", catalog = "tradeweightdb", uniqueConstraints = @UniqueConstraint(columnNames = { "id_prise",
		"id_user_prise", "id_user_colis", "sender", "horodatage" }))
public class Messages implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MessagesId id;
	private PriseEnCharge priseEnCharge;
	private Users usersByIdUserPrise;
	private Users usersBySender;
	private Users usersByIdUserColis;

	public Messages() {
	}

	public Messages(MessagesId id, PriseEnCharge priseEnCharge, Users usersByIdUserPrise, Users usersBySender,
			Users usersByIdUserColis) {
		this.id = id;
		this.priseEnCharge = priseEnCharge;
		this.usersByIdUserPrise = usersByIdUserPrise;
		this.usersBySender = usersBySender;
		this.usersByIdUserColis = usersByIdUserColis;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idPrise", column = @Column(name = "id_prise", nullable = false)),
			@AttributeOverride(name = "idUserPrise", column = @Column(name = "id_user_prise", nullable = false, length = 50)),
			@AttributeOverride(name = "idUserColis", column = @Column(name = "id_user_colis", nullable = false, length = 50)),
			@AttributeOverride(name = "sender", column = @Column(name = "sender", nullable = false, length = 50)),
			@AttributeOverride(name = "horodatage", column = @Column(name = "horodatage", nullable = false, length = 19)),
			@AttributeOverride(name = "message", column = @Column(name = "message", nullable = false, length = 500)) })
	public MessagesId getId() {
		return this.id;
	}

	public void setId(MessagesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_prise", nullable = false, insertable = false, updatable = false)
	public PriseEnCharge getPriseEnCharge() {
		return this.priseEnCharge;
	}

	public void setPriseEnCharge(PriseEnCharge priseEnCharge) {
		this.priseEnCharge = priseEnCharge;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user_prise", nullable = false, insertable = false, updatable = false)
	public Users getUsersByIdUserPrise() {
		return this.usersByIdUserPrise;
	}

	public void setUsersByIdUserPrise(Users usersByIdUserPrise) {
		this.usersByIdUserPrise = usersByIdUserPrise;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sender", nullable = false, insertable = false, updatable = false)
	public Users getUsersBySender() {
		return this.usersBySender;
	}

	public void setUsersBySender(Users usersBySender) {
		this.usersBySender = usersBySender;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user_colis", nullable = false, insertable = false, updatable = false)
	public Users getUsersByIdUserColis() {
		return this.usersByIdUserColis;
	}

	public void setUsersByIdUserColis(Users usersByIdUserColis) {
		this.usersByIdUserColis = usersByIdUserColis;
	}

}
