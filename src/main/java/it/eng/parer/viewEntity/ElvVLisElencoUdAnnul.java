package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ELV_V_LIS_ELENCO_UD_ANNUL database table.
 */
@Entity
@Table(name = "ELV_V_LIS_ELENCO_UD_ANNUL")
@NamedQuery(name = "ElvVLisElencoUdAnnul.findAll", query = "SELECT e FROM ElvVLisElencoUdAnnul e")
public class ElvVLisElencoUdAnnul implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ntElencoChiuso;

    public ElvVLisElencoUdAnnul() {/* Hibernate */
    }

    @Column(name = "NT_ELENCO_CHIUSO")
    public String getNtElencoChiuso() {
        return this.ntElencoChiuso;
    }

    public void setNtElencoChiuso(String ntElencoChiuso) {
        this.ntElencoChiuso = ntElencoChiuso;
    }

    private ElvVLisElencoUdAnnulId elvVLisElencoUdAnnulId;

    @EmbeddedId()
    public ElvVLisElencoUdAnnulId getElvVLisElencoUdAnnulId() {
        return elvVLisElencoUdAnnulId;
    }

    public void setElvVLisElencoUdAnnulId(ElvVLisElencoUdAnnulId elvVLisElencoUdAnnulId) {
        this.elvVLisElencoUdAnnulId = elvVLisElencoUdAnnulId;
    }
}
