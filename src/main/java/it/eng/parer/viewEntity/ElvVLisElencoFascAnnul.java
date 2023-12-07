package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ELV_V_LIS_ELENCO_FASC_ANNUL database table.
 */
@Entity
@Table(name = "ELV_V_LIS_ELENCO_FASC_ANNUL")
@NamedQuery(name = "ElvVLisElencoFascAnnul.findAll", query = "SELECT e FROM ElvVLisElencoFascAnnul e")
public class ElvVLisElencoFascAnnul implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ntElencoChiuso;

    public ElvVLisElencoFascAnnul() {/* Hibernate */
    }

    @Column(name = "NT_ELENCO_CHIUSO")
    public String getNtElencoChiuso() {
        return this.ntElencoChiuso;
    }

    public void setNtElencoChiuso(String ntElencoChiuso) {
        this.ntElencoChiuso = ntElencoChiuso;
    }

    private ElvVLisElencoFascAnnulId elvVLisElencoFascAnnulId;

    @EmbeddedId()
    public ElvVLisElencoFascAnnulId getElvVLisElencoFascAnnulId() {
        return elvVLisElencoFascAnnulId;
    }

    public void setElvVLisElencoFascAnnulId(ElvVLisElencoFascAnnulId elvVLisElencoFascAnnulId) {
        this.elvVLisElencoFascAnnulId = elvVLisElencoFascAnnulId;
    }
}
