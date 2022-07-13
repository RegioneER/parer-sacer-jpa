package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * The persistent class for the VRS_ERR_SES_FASCICOLO_KO database table.
 * 
 */
@Entity
@Table(name = "VRS_ERR_SES_FASCICOLO_KO")
@NamedQuery(name = "VrsErrSesFascicoloKo.findAll", query = "SELECT v FROM VrsErrSesFascicoloKo v")
public class VrsErrSesFascicoloKo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idErrSesFascicoloKo;
    private String dsErr;
    private String flErrPrinc;
    private BigDecimal pgErr;
    private String tiErr;
    private DecErrSacer decErrSacer;
    private VrsSesFascicoloKo vrsSesFascicoloKo;

    public VrsErrSesFascicoloKo() {
    }

    @Id
    @SequenceGenerator(name = "VRS_ERR_SES_FASCICOLO_KO_IDERRSESFASCICOLOKO_GENERATOR", sequenceName = "SVRS_ERR_SES_FASCICOLO_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_ERR_SES_FASCICOLO_KO_IDERRSESFASCICOLOKO_GENERATOR")
    @Column(name = "ID_ERR_SES_FASCICOLO_KO")
    public long getIdErrSesFascicoloKo() {
        return this.idErrSesFascicoloKo;
    }

    public void setIdErrSesFascicoloKo(long idErrSesFascicoloKo) {
        this.idErrSesFascicoloKo = idErrSesFascicoloKo;
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

    @Column(name = "PG_ERR")
    public BigDecimal getPgErr() {
        return this.pgErr;
    }

    public void setPgErr(BigDecimal pgErr) {
        this.pgErr = pgErr;
    }

    @Column(name = "TI_ERR")
    public String getTiErr() {
        return this.tiErr;
    }

    public void setTiErr(String tiErr) {
        this.tiErr = tiErr;
    }

    // bi-directional many-to-one association to DecErrSacer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_SACER")
    public DecErrSacer getDecErrSacer() {
        return this.decErrSacer;
    }

    public void setDecErrSacer(DecErrSacer decErrSacer) {
        this.decErrSacer = decErrSacer;
    }

    // bi-directional many-to-one association to VrsSesFascicoloKo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SES_FASCICOLO_KO")
    public VrsSesFascicoloKo getVrsSesFascicoloKo() {
        return this.vrsSesFascicoloKo;
    }

    public void setVrsSesFascicoloKo(VrsSesFascicoloKo vrsSesFascicoloKo) {
        this.vrsSesFascicoloKo = vrsSesFascicoloKo;
    }

}