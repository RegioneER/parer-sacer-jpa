package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the OST_STATO_MIGRAZ_SUB_PART database table.
 *
 */
@Entity
@Table(name = "OST_STATO_MIGRAZ_SUB_PART")
@NamedQuery(name = "OstStatoMigrazSubPart.findAll", query = "SELECT o FROM OstStatoMigrazSubPart o")
public class OstStatoMigrazSubPart implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idStatoMigrazSubPart;
    private String tiStato;
    private Date tsRegStato;
    private OstMigrazSubPart ostMigrazSubPart;

    public OstStatoMigrazSubPart() {
    }

    @Id
    @SequenceGenerator(name = "OST_STATO_MIGRAZ_SUB_PART_IDSTATOMIGRAZSUBPART_GENERATOR", sequenceName = "SOST_STATO_MIGRAZ_SUB_PART", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OST_STATO_MIGRAZ_SUB_PART_IDSTATOMIGRAZSUBPART_GENERATOR")
    @Column(name = "ID_STATO_MIGRAZ_SUB_PART")
    public long getIdStatoMigrazSubPart() {
        return this.idStatoMigrazSubPart;
    }

    public void setIdStatoMigrazSubPart(long idStatoMigrazSubPart) {
        this.idStatoMigrazSubPart = idStatoMigrazSubPart;
    }

    @Column(name = "TI_STATO")
    public String getTiStato() {
        return this.tiStato;
    }

    public void setTiStato(String tiStato) {
        this.tiStato = tiStato;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_REG_STATO")
    public Date getTsRegStato() {
        return this.tsRegStato;
    }

    public void setTsRegStato(Date tsRegStato) {
        this.tsRegStato = tsRegStato;
    }

    // bi-directional many-to-one association to OstMigrazSubPart
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MIGRAZ_SUB_PART")
    public OstMigrazSubPart getOstMigrazSubPart() {
        return this.ostMigrazSubPart;
    }

    public void setOstMigrazSubPart(OstMigrazSubPart ostMigrazSubPart) {
        this.ostMigrazSubPart = ostMigrazSubPart;
    }

}
