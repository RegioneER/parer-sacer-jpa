package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the VRS_DATI_SESSIONE_VERS database table.
 * 
 */
@Entity
@Table(name = "VRS_DATI_SESSIONE_VERS")
public class VrsDatiSessioneVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idDatiSessioneVers;
    private String cdKeyAlleg;
    private BigDecimal idStrut;
    private BigDecimal niFile;
    private BigDecimal pgDatiSessioneVers;
    private String tiDatiSessioneVers;
    private VrsSessioneVers vrsSessioneVers;
    private List<VrsErrSessioneVers> vrsErrSessioneVers;
    private List<VrsFileSessione> vrsFileSessiones;
    private List<VrsXmlDatiSessioneVers> vrsXmlDatiSessioneVers;

    public VrsDatiSessioneVers() {
    }

    @Id
    @SequenceGenerator(name = "VRS_DATI_SESSIONE_VERS_IDDATISESSIONEVERS_GENERATOR", sequenceName = "SVRS_DATI_SESSIONE_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_DATI_SESSIONE_VERS_IDDATISESSIONEVERS_GENERATOR")
    @Column(name = "ID_DATI_SESSIONE_VERS")
    public long getIdDatiSessioneVers() {
        return this.idDatiSessioneVers;
    }

    public void setIdDatiSessioneVers(long idDatiSessioneVers) {
        this.idDatiSessioneVers = idDatiSessioneVers;
    }

    @Column(name = "CD_KEY_ALLEG")
    public String getCdKeyAlleg() {
        return this.cdKeyAlleg;
    }

    public void setCdKeyAlleg(String cdKeyAlleg) {
        this.cdKeyAlleg = cdKeyAlleg;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_FILE")
    public BigDecimal getNiFile() {
        return this.niFile;
    }

    public void setNiFile(BigDecimal niFile) {
        this.niFile = niFile;
    }

    @Column(name = "PG_DATI_SESSIONE_VERS")
    public BigDecimal getPgDatiSessioneVers() {
        return this.pgDatiSessioneVers;
    }

    public void setPgDatiSessioneVers(BigDecimal pgDatiSessioneVers) {
        this.pgDatiSessioneVers = pgDatiSessioneVers;
    }

    @Column(name = "TI_DATI_SESSIONE_VERS")
    public String getTiDatiSessioneVers() {
        return this.tiDatiSessioneVers;
    }

    public void setTiDatiSessioneVers(String tiDatiSessioneVers) {
        this.tiDatiSessioneVers = tiDatiSessioneVers;
    }

    // bi-directional many-to-one association to VrsSessioneVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SESSIONE_VERS")
    public VrsSessioneVers getVrsSessioneVers() {
        return this.vrsSessioneVers;
    }

    public void setVrsSessioneVers(VrsSessioneVers vrsSessioneVers) {
        this.vrsSessioneVers = vrsSessioneVers;
    }

    // bi-directional many-to-one association to VrsErrSessioneVers
    @OneToMany(mappedBy = "vrsDatiSessioneVers")
    public List<VrsErrSessioneVers> getVrsErrSessioneVers() {
        return this.vrsErrSessioneVers;
    }

    public void setVrsErrSessioneVers(List<VrsErrSessioneVers> vrsErrSessioneVers) {
        this.vrsErrSessioneVers = vrsErrSessioneVers;
    }

    // bi-directional many-to-one association to VrsFileSessione
    @OneToMany(mappedBy = "vrsDatiSessioneVers")
    public List<VrsFileSessione> getVrsFileSessiones() {
        return this.vrsFileSessiones;
    }

    public void setVrsFileSessiones(List<VrsFileSessione> vrsFileSessiones) {
        this.vrsFileSessiones = vrsFileSessiones;
    }

    // bi-directional many-to-one association to VrsXmlDatiSessioneVers
    @OneToMany(mappedBy = "vrsDatiSessioneVers")
    public List<VrsXmlDatiSessioneVers> getVrsXmlDatiSessioneVers() {
        return this.vrsXmlDatiSessioneVers;
    }

    public void setVrsXmlDatiSessioneVers(List<VrsXmlDatiSessioneVers> vrsXmlDatiSessioneVers) {
        this.vrsXmlDatiSessioneVers = vrsXmlDatiSessioneVers;
    }

}