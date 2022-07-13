package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_DOC_ANNUL_DA_ELAB database table.
 * 
 */
@Entity
@Table(name = "ARO_DOC_ANNUL_DA_ELAB")
@NamedQuery(name = "AroDocAnnulDaElab.findAll", query = "SELECT a FROM AroDocAnnulDaElab a")
public class AroDocAnnulDaElab implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idDocAnnulDaElab;
    private Date dtAnnul;
    private Date dtCreazione;
    private BigDecimal idAppartDocVolume;
    private BigDecimal idAppartDocVolumePrec;
    private BigDecimal idAppartUdVolume;
    private BigDecimal idAppartUdVolumePrec;
    private BigDecimal idStrut;
    private BigDecimal idVolumeConserv;
    private BigDecimal idVolumeConservPrec;
    private String tiStatoAnnul;
    private String tiStatoVolumeConserv;
    private AroDoc aroDoc;
    private AroUdAnnulDaElab aroUdAnnulDaElab;

    public AroDocAnnulDaElab() {
    }

    @Id
    @SequenceGenerator(name = "ARO_DOC_ANNUL_DA_ELAB_IDDOCANNULDAELAB_GENERATOR", sequenceName = "SARO_DOC_ANNUL_DA_ELAB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_DOC_ANNUL_DA_ELAB_IDDOCANNULDAELAB_GENERATOR")
    @Column(name = "ID_DOC_ANNUL_DA_ELAB")
    public long getIdDocAnnulDaElab() {
        return this.idDocAnnulDaElab;
    }

    public void setIdDocAnnulDaElab(long idDocAnnulDaElab) {
        this.idDocAnnulDaElab = idDocAnnulDaElab;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ANNUL")
    public Date getDtAnnul() {
        return this.dtAnnul;
    }

    public void setDtAnnul(Date dtAnnul) {
        this.dtAnnul = dtAnnul;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "ID_APPART_DOC_VOLUME")
    public BigDecimal getIdAppartDocVolume() {
        return this.idAppartDocVolume;
    }

    public void setIdAppartDocVolume(BigDecimal idAppartDocVolume) {
        this.idAppartDocVolume = idAppartDocVolume;
    }

    @Column(name = "ID_APPART_DOC_VOLUME_PREC")
    public BigDecimal getIdAppartDocVolumePrec() {
        return this.idAppartDocVolumePrec;
    }

    public void setIdAppartDocVolumePrec(BigDecimal idAppartDocVolumePrec) {
        this.idAppartDocVolumePrec = idAppartDocVolumePrec;
    }

    @Column(name = "ID_APPART_UD_VOLUME")
    public BigDecimal getIdAppartUdVolume() {
        return this.idAppartUdVolume;
    }

    public void setIdAppartUdVolume(BigDecimal idAppartUdVolume) {
        this.idAppartUdVolume = idAppartUdVolume;
    }

    @Column(name = "ID_APPART_UD_VOLUME_PREC")
    public BigDecimal getIdAppartUdVolumePrec() {
        return this.idAppartUdVolumePrec;
    }

    public void setIdAppartUdVolumePrec(BigDecimal idAppartUdVolumePrec) {
        this.idAppartUdVolumePrec = idAppartUdVolumePrec;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_VOLUME_CONSERV")
    public BigDecimal getIdVolumeConserv() {
        return this.idVolumeConserv;
    }

    public void setIdVolumeConserv(BigDecimal idVolumeConserv) {
        this.idVolumeConserv = idVolumeConserv;
    }

    @Column(name = "ID_VOLUME_CONSERV_PREC")
    public BigDecimal getIdVolumeConservPrec() {
        return this.idVolumeConservPrec;
    }

    public void setIdVolumeConservPrec(BigDecimal idVolumeConservPrec) {
        this.idVolumeConservPrec = idVolumeConservPrec;
    }

    @Column(name = "TI_STATO_ANNUL")
    public String getTiStatoAnnul() {
        return this.tiStatoAnnul;
    }

    public void setTiStatoAnnul(String tiStatoAnnul) {
        this.tiStatoAnnul = tiStatoAnnul;
    }

    @Column(name = "TI_STATO_VOLUME_CONSERV")
    public String getTiStatoVolumeConserv() {
        return this.tiStatoVolumeConserv;
    }

    public void setTiStatoVolumeConserv(String tiStatoVolumeConserv) {
        this.tiStatoVolumeConserv = tiStatoVolumeConserv;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOC")
    public AroDoc getAroDoc() {
        return this.aroDoc;
    }

    public void setAroDoc(AroDoc aroDoc) {
        this.aroDoc = aroDoc;
    }

    // bi-directional many-to-one association to AroUdAnnulDaElab
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UD_ANNUL_DA_ELAB")
    public AroUdAnnulDaElab getAroUdAnnulDaElab() {
        return this.aroUdAnnulDaElab;
    }

    public void setAroUdAnnulDaElab(AroUdAnnulDaElab aroUdAnnulDaElab) {
        this.aroUdAnnulDaElab = aroUdAnnulDaElab;
    }

}