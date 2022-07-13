package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_ERR_RICH_ANNUL_VERS database table.
 * 
 */
@Entity
@Table(name = "ARO_ERR_RICH_ANNUL_VERS")
@NamedQuery(name = "AroErrRichAnnulVers.findAll", query = "SELECT a FROM AroErrRichAnnulVers a")
public class AroErrRichAnnulVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idErrRichAnnulVrs;
    private String dsErr;
    private BigDecimal pgErr;
    private String tiErr;
    private String tiGravita;
    private AroItemRichAnnulVers aroItemRichAnnulVers;

    public AroErrRichAnnulVers() {
    }

    @Id
    @SequenceGenerator(name = "ARO_ERR_RICH_ANNUL_VERS_IDERRRICHANNULVRS_GENERATOR", sequenceName = "SARO_ERR_RICH_ANNUL_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_ERR_RICH_ANNUL_VERS_IDERRRICHANNULVRS_GENERATOR")
    @Column(name = "ID_ERR_RICH_ANNUL_VRS")
    public long getIdErrRichAnnulVrs() {
        return this.idErrRichAnnulVrs;
    }

    public void setIdErrRichAnnulVrs(long idErrRichAnnulVrs) {
        this.idErrRichAnnulVrs = idErrRichAnnulVrs;
    }

    @Column(name = "DS_ERR")
    public String getDsErr() {
        return this.dsErr;
    }

    public void setDsErr(String dsErr) {
        this.dsErr = dsErr;
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

    @Column(name = "TI_GRAVITA")
    public String getTiGravita() {
        return this.tiGravita;
    }

    public void setTiGravita(String tiGravita) {
        this.tiGravita = tiGravita;
    }

    // bi-directional many-to-one association to AroItemRichAnnulVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ITEM_RICH_ANNUL_VERS")
    public AroItemRichAnnulVers getAroItemRichAnnulVers() {
        return this.aroItemRichAnnulVers;
    }

    public void setAroItemRichAnnulVers(AroItemRichAnnulVers aroItemRichAnnulVers) {
        this.aroItemRichAnnulVers = aroItemRichAnnulVers;
    }

}