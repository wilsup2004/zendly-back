package com.weight.model;
// Generated 1 oct. 2023, 21:30:36 by Hibernate Tools 5.4.33.Final

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * UserTradeId generated by hbm2java
 */
@Embeddable
public class UserTradeId implements java.io.Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_dispo")
	private int idDispo;
	
	@Column(name = "id_user_candidat")
	private String idUserCandidat;

	public UserTradeId() {
	}

	public UserTradeId(int idDispo, String idUserCandidat) {
		this.idDispo = idDispo;
		this.idUserCandidat = idUserCandidat;
	}

	public int getIdDispo() {
		return this.idDispo;
	}

	public void setIdDispo(int idDispo) {
		this.idDispo = idDispo;
	}

	public String getIdUserCandidat() {
		return this.idUserCandidat;
	}

	public void setIdUserCandidat(String idUserCandidat) {
		this.idUserCandidat = idUserCandidat;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserTradeId))
			return false;
		UserTradeId castOther = (UserTradeId) other;

		return (this.getIdDispo() == castOther.getIdDispo())
				&& ((this.getIdUserCandidat() == castOther.getIdUserCandidat())
						|| (this.getIdUserCandidat() != null && castOther.getIdUserCandidat() != null
								&& this.getIdUserCandidat().equals(castOther.getIdUserCandidat())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdDispo();
		result = 37 * result + (getIdUserCandidat() == null ? 0 : this.getIdUserCandidat().hashCode());
		return result;
	}

}
