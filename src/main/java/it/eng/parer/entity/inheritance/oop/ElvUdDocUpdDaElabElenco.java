package it.eng.parer.entity.inheritance.oop;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@MappedSuperclass
public abstract class ElvUdDocUpdDaElabElenco<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private T udDocUpdObj;

    private BigDecimal aaKeyUnitaDoc;

    private Date dtCreazione;

    public ElvUdDocUpdDaElabElenco() {/* Hibernate */
    }

    // bi-directional many-to-one association to T
    @ManyToOne(fetch = FetchType.LAZY)
    public T getUdDocUpdObj() {
        return this.udDocUpdObj;
    }

    public void setUdDocUpdObj(T udDocUpdObj) {
        this.udDocUpdObj = udDocUpdObj;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }
}
