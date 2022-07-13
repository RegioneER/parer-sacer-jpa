package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_LIS_STATO_RICH_ANNVRS database table.
 * 
 */
@Entity
@Table(name = "ARO_V_LIS_STATO_RICH_ANNVRS")
@NamedQuery(name = "AroVLisStatoRichAnnvrs.findAll", query = "SELECT a FROM AroVLisStatoRichAnnvrs a")
public class AroVLisStatoRichAnnvrs implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dsNotaRichAnnulVers;
    private Date dtRegStatoRichAnnulVers;
    private BigDecimal idRichAnnulVers;
    private BigDecimal idStatoRichAnnulVers;
    private String nmUserid;
    private BigDecimal pgStatoRichAnnulVers;
    private String tiStatoRichAnnulVers;

    public AroVLisStatoRichAnnvrs() {
    }

    @Column(name = "DS_NOTA_RICH_ANNUL_VERS")
    public String getDsNotaRichAnnulVers() {
        return this.dsNotaRichAnnulVers;
    }

    public void setDsNotaRichAnnulVers(String dsNotaRichAnnulVers) {
        this.dsNotaRichAnnulVers = dsNotaRichAnnulVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_STATO_RICH_ANNUL_VERS")
    public Date getDtRegStatoRichAnnulVers() {
        return this.dtRegStatoRichAnnulVers;
    }

    public void setDtRegStatoRichAnnulVers(Date dtRegStatoRichAnnulVers) {
        this.dtRegStatoRichAnnulVers = dtRegStatoRichAnnulVers;
    }

    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return this.idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }

    @Id
    @Column(name = "ID_STATO_RICH_ANNUL_VERS")
    public BigDecimal getIdStatoRichAnnulVers() {
        return this.idStatoRichAnnulVers;
    }

    public void setIdStatoRichAnnulVers(BigDecimal idStatoRichAnnulVers) {
        this.idStatoRichAnnulVers = idStatoRichAnnulVers;
    }

    @Column(name = "NM_USERID")
    public String getNmUserid() {
        return this.nmUserid;
    }

    public void setNmUserid(String nmUserid) {
        this.nmUserid = nmUserid;
    }

    @Column(name = "PG_STATO_RICH_ANNUL_VERS")
    public BigDecimal getPgStatoRichAnnulVers() {
        return this.pgStatoRichAnnulVers;
    }

    public void setPgStatoRichAnnulVers(BigDecimal pgStatoRichAnnulVers) {
        this.pgStatoRichAnnulVers = pgStatoRichAnnulVers;
    }

    @Column(name = "TI_STATO_RICH_ANNUL_VERS")
    public String getTiStatoRichAnnulVers() {
        return this.tiStatoRichAnnulVers;
    }

    public void setTiStatoRichAnnulVers(String tiStatoRichAnnulVers) {
        this.tiStatoRichAnnulVers = tiStatoRichAnnulVers;
    }

}