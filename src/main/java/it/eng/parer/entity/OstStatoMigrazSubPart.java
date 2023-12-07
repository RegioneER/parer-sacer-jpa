package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the OST_STATO_MIGRAZ_SUB_PART database table.
 */
@Entity
@Table(name = "OST_STATO_MIGRAZ_SUB_PART")
@NamedQuery(name = "OstStatoMigrazSubPart.findAll", query = "SELECT o FROM OstStatoMigrazSubPart o")
public class OstStatoMigrazSubPart implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idStatoMigrazSubPart;

    private String tiStato;

    private Date tsRegStato;

    private OstMigrazSubPart ostMigrazSubPart;

    public OstStatoMigrazSubPart() {/* Hibernate */
    }

    @Id
    // "OST_STATO_MIGRAZ_SUB_PART_IDSTATOMIGRAZSUBPART_GENERATOR",
    // sequenceName =
    // "SOST_STATO_MIGRAZ_SUB_PART",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "OST_STATO_MIGRAZ_SUB_PART_IDSTATOMIGRAZSUBPART_GENERATOR")
    @Column(name = "ID_STATO_MIGRAZ_SUB_PART")
    @GenericGenerator(name = "SOST_STATO_MIGRAZ_SUB_PART_ID_STATO_MIGRAZ_SUB_PART_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SOST_STATO_MIGRAZ_SUB_PART"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SOST_STATO_MIGRAZ_SUB_PART_ID_STATO_MIGRAZ_SUB_PART_GENERATOR")
    public Long getIdStatoMigrazSubPart() {
        return this.idStatoMigrazSubPart;
    }

    public void setIdStatoMigrazSubPart(Long idStatoMigrazSubPart) {
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
