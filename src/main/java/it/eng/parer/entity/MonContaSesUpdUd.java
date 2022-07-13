package it.eng.parer.entity;

import it.eng.parer.entity.constraint.MonContaSesUpdUd.TiStatoUdpUdMonContaSesUpdUd;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the MON_CONTA_SES_UPD_UD database table.
 *
 */
@Entity
@Table(name = "MON_CONTA_SES_UPD_UD")
@NamedQuery(name = "MonContaSesUpdUd.findAll", query = "SELECT m FROM MonContaSesUpdUd m")
public class MonContaSesUpdUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idContaSesUpdUd;
    private Date dtRifConta;
    private BigDecimal niSesUpdUd;
    private MonKeyTotalUd monKeyTotalUd;
    private TiStatoUdpUdMonContaSesUpdUd tiStatoUdpUd;

    public MonContaSesUpdUd() {
    }

    @Id
    @SequenceGenerator(name = "MON_CONTA_SES_UPD_UD_IDCONTASESUPDUD_GENERATOR", sequenceName = "SMON_CONTA_SES_UPD_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MON_CONTA_SES_UPD_UD_IDCONTASESUPDUD_GENERATOR")
    @Column(name = "ID_CONTA_SES_UPD_UD")
    public long getIdContaSesUpdUd() {
        return this.idContaSesUpdUd;
    }

    public void setIdContaSesUpdUd(long idContaSesUpdUd) {
        this.idContaSesUpdUd = idContaSesUpdUd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return this.dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    @Column(name = "NI_SES_UPD_UD")
    public BigDecimal getNiSesUpdUd() {
        return this.niSesUpdUd;
    }

    public void setNiSesUpdUd(BigDecimal niSesUpdUd) {
        this.niSesUpdUd = niSesUpdUd;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KEY_TOTAL_UD")
    public MonKeyTotalUd getMonKeyTotalUd() {
        return this.monKeyTotalUd;
    }

    public void setMonKeyTotalUd(MonKeyTotalUd monKeyTotalUd) {
        this.monKeyTotalUd = monKeyTotalUd;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO_UDP_UD")
    public TiStatoUdpUdMonContaSesUpdUd getTiStatoUdpUd() {
        return this.tiStatoUdpUd;
    }

    public void setTiStatoUdpUd(TiStatoUdpUdMonContaSesUpdUd tiStatoUdpUd) {
        this.tiStatoUdpUd = tiStatoUdpUd;
    }

}
