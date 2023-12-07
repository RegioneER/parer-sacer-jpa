package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ELV_V_SEL_FASC_VERS database table.
 */
@Entity
@Table(name = "ELV_V_SEL_FASC_VERS")
@NamedQuery(name = "ElvVSelFascVers.findAll", query = "SELECT e FROM ElvVSelFascVers e")
public class ElvVSelFascVers implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal aaFascicolo;

    private Date tsVersFascicolo;

    public ElvVSelFascVers() {/* Hibernate */
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_VERS_FASCICOLO")
    public Date getTsVersFascicolo() {
        return this.tsVersFascicolo;
    }

    public void setTsVersFascicolo(Date tsVersFascicolo) {
        this.tsVersFascicolo = tsVersFascicolo;
    }

    private ElvVSelFascVersId elvVSelFascVersId;

    @EmbeddedId()
    public ElvVSelFascVersId getElvVSelFascVersId() {
        return elvVSelFascVersId;
    }

    public void setElvVSelFascVersId(ElvVSelFascVersId elvVSelFascVersId) {
        this.elvVSelFascVersId = elvVSelFascVersId;
    }
}
