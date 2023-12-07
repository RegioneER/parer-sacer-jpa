package it.eng.parer.entity;

import it.eng.sequences.hibernate.NonMonotonicSequenceGenerator;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * The persistent class for the VRS_ERR_SESSIONE_VERS_KO database table.
 */
@Entity
@Table(name = "VRS_ERR_SESSIONE_VERS_KO")
public class VrsErrSessioneVersKo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idErrSessioneVersKo;

    private String cdErr;

    private String dsErr;

    private String flErrPrinc;

    private BigDecimal idStrut;

    private BigDecimal pgErrSessioneVers;

    private String tiErr;

    private VrsDatiSessioneVersKo vrsDatiSessioneVersKo;

    public VrsErrSessioneVersKo() {/* Hibernate */
    }

    @Id
    // "VRS_ERR_SESSIONE_VERS_IDERRSESSIONEVERS_GENERATOR",
    // sequenceName = "SVRS_ERR_SESSIONE_VERS",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VRS_ERR_SESSIONE_VERS_IDERRSESSIONEVERS_GENERATOR")
    @Column(name = "ID_ERR_SESSIONE_VERS_KO")
    // @GenericGenerator(name = "SVRS_ERR_SESSIONE_VERS_ID_ERR_SESSIONE_VERS_GENERATOR", strategy =
    // "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
    // @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVRS_ERR_SESSIONE_VERS"),
    // @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "SVRS_ERR_SESSIONE_VERS_ID_ERR_SESSIONE_VERS_GENERATOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIdErrSessioneVersKo() {
        return this.idErrSessioneVersKo;
    }

    public void setIdErrSessioneVersKo(Long idErrSessioneVersKo) {
        this.idErrSessioneVersKo = idErrSessioneVersKo;
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

    @Column(name = "FL_ERR_PRINC", columnDefinition = "char(1)")
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

    // bi-directional many-to-one association to VrsDatiSessioneVersKo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATI_SESSIONE_VERS_KO")
    public VrsDatiSessioneVersKo getVrsDatiSessioneVersKo() {
        return this.vrsDatiSessioneVersKo;
    }

    public void setVrsDatiSessioneVersKo(VrsDatiSessioneVersKo vrsDatiSessioneVersKo) {
        this.vrsDatiSessioneVersKo = vrsDatiSessioneVersKo;
    }
}
