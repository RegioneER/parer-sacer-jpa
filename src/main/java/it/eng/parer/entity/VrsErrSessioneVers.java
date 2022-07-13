package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the VRS_ERR_SESSIONE_VERS database table.
 *
 */
@Entity
@Table(name = "VRS_ERR_SESSIONE_VERS")
public class VrsErrSessioneVers implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idErrSessioneVers;
    private String cdErr;
    private String dsErr;
    private String flErrPrinc;
    private BigDecimal idStrut;
    private BigDecimal pgErrSessioneVers;
    private String tiErr;
    private VrsDatiSessioneVers vrsDatiSessioneVers;

    public VrsErrSessioneVers() {
    }

    @Id
    @SequenceGenerator(name = "VRS_ERR_SESSIONE_VERS_IDERRSESSIONEVERS_GENERATOR", sequenceName = "SVRS_ERR_SESSIONE_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_ERR_SESSIONE_VERS_IDERRSESSIONEVERS_GENERATOR")
    @Column(name = "ID_ERR_SESSIONE_VERS")
    public long getIdErrSessioneVers() {
        return this.idErrSessioneVers;
    }

    public void setIdErrSessioneVers(long idErrSessioneVers) {
        this.idErrSessioneVers = idErrSessioneVers;
    }

    @Column(name = "CD_ERR")
    public String getCdErr() {
        return this.cdErr;
    }

    public void setCdErr(String cdErr) {
        this.cdErr = cdErr;
    }

    @Column(name = "DS_ERR")
    public String getDsErr() {
        return this.dsErr;
    }

    public void setDsErr(String dsErr) {
        this.dsErr = dsErr;
    }

    @Column(name = "FL_ERR_PRINC")
    public String getFlErrPrinc() {
        return this.flErrPrinc;
    }

    public void setFlErrPrinc(String flErrPrinc) {
        this.flErrPrinc = flErrPrinc;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "PG_ERR_SESSIONE_VERS")
    public BigDecimal getPgErrSessioneVers() {
        return this.pgErrSessioneVers;
    }

    public void setPgErrSessioneVers(BigDecimal pgErrSessioneVers) {
        this.pgErrSessioneVers = pgErrSessioneVers;
    }

    @Column(name = "TI_ERR")
    public String getTiErr() {
        return this.tiErr;
    }

    public void setTiErr(String tiErr) {
        this.tiErr = tiErr;
    }

    // bi-directional many-to-one association to VrsDatiSessioneVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATI_SESSIONE_VERS")
    public VrsDatiSessioneVers getVrsDatiSessioneVers() {
        return this.vrsDatiSessioneVers;
    }

    public void setVrsDatiSessioneVers(VrsDatiSessioneVers vrsDatiSessioneVers) {
        this.vrsDatiSessioneVers = vrsDatiSessioneVers;
    }
}