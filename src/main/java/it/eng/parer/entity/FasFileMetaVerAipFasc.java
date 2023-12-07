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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the FAS_FILE_META_VER_AIP_FASC database table.
 */
@Entity
@Table(name = "FAS_FILE_META_VER_AIP_FASC")
public class FasFileMetaVerAipFasc implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFileMetaVerAipFasc;

    private String blFileVerIndiceAip;

    private OrgStrut orgStrut;

    private Date dtCreazione;

    private FasMetaVerAipFascicolo fasMetaVerAipFascicolo;

    public FasFileMetaVerAipFasc() {/* Hibernate */
    }

    @Id
    // "FAS_FILE_META_VER_AIP_FASC_IDFILEMETAVERAIPFASC_GENERATOR",
    // allocationSize = 1, sequenceName =
    // "SFAS_FILE_META_VER_AIP_FASC")
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "FAS_FILE_META_VER_AIP_FASC_IDFILEMETAVERAIPFASC_GENERATOR")
    @Column(name = "ID_FILE_META_VER_AIP_FASC")
    @GenericGenerator(name = "SFAS_FILE_META_VER_AIP_FASC_ID_FILE_META_VER_AIP_FASC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_FILE_META_VER_AIP_FASC"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_FILE_META_VER_AIP_FASC_ID_FILE_META_VER_AIP_FASC_GENERATOR")
    public Long getIdFileMetaVerAipFasc() {
        return this.idFileMetaVerAipFasc;
    }

    public void setIdFileMetaVerAipFasc(Long idFileMetaVerAipFasc) {
        this.idFileMetaVerAipFasc = idFileMetaVerAipFasc;
    }

    @Lob
    @Column(name = "BL_FILE_VER_INDICE_AIP")
    public String getBlFileVerIndiceAip() {
        return this.blFileVerIndiceAip;
    }

    public void setBlFileVerIndiceAip(String blFileVerIndiceAip) {
        this.blFileVerIndiceAip = blFileVerIndiceAip;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    // bi-directional many-to-one association to FasMetaVerAipFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_META_VER_AIP_FASCICOLO")
    public FasMetaVerAipFascicolo getFasMetaVerAipFascicolo() {
        return this.fasMetaVerAipFascicolo;
    }

    public void setFasMetaVerAipFascicolo(FasMetaVerAipFascicolo fasMetaVerAipFascicolo) {
        this.fasMetaVerAipFascicolo = fasMetaVerAipFascicolo;
    }

}
