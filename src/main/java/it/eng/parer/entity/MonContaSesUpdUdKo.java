package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.MonContaSesUpdUdKo.TiStatoUdpUdKoMonContaSesUpdUdKo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the MON_CONTA_SES_UPD_UD_KO database table.
 * 
 */
@Entity
@Table(name = "MON_CONTA_SES_UPD_UD_KO")
@NamedQuery(name = "MonContaSesUpdUdKo.findAll", query = "SELECT m FROM MonContaSesUpdUdKo m")
public class MonContaSesUpdUdKo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idContaSesUpdUdKo;
    private Date dtRifConta;
    private BigDecimal niSesUpdUdKo;
    private TiStatoUdpUdKoMonContaSesUpdUdKo tiStatoUdpUdKo;
    private MonKeyTotalUdKo monKeyTotalUdKo;

    public MonContaSesUpdUdKo() {
    }

    @Id
    @SequenceGenerator(name = "MON_CONTA_SES_UPD_UD_KO_IDCONTASESUPDUDKO_GENERATOR", sequenceName = "SMON_CONTA_SES_UPD_UD_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MON_CONTA_SES_UPD_UD_KO_IDCONTASESUPDUDKO_GENERATOR")
    @Column(name = "ID_CONTA_SES_UPD_UD_KO")
    public long getIdContaSesUpdUdKo() {
        return this.idContaSesUpdUdKo;
    }

    public void setIdContaSesUpdUdKo(long idContaSesUpdUdKo) {
        this.idContaSesUpdUdKo = idContaSesUpdUdKo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return this.dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    @Column(name = "NI_SES_UPD_UD_KO")
    public BigDecimal getNiSesUpdUdKo() {
        return this.niSesUpdUdKo;
    }

    public void setNiSesUpdUdKo(BigDecimal niSesUpdUdKo) {
        this.niSesUpdUdKo = niSesUpdUdKo;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO_UDP_UD_KO")
    public TiStatoUdpUdKoMonContaSesUpdUdKo getTiStatoUdpUdKo() {
        return this.tiStatoUdpUdKo;
    }

    public void setTiStatoUdpUdKo(TiStatoUdpUdKoMonContaSesUpdUdKo tiStatoUdpUdKo) {
        this.tiStatoUdpUdKo = tiStatoUdpUdKo;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KEY_TOTAL_UD_KO")
    public MonKeyTotalUdKo getMonKeyTotalUdKo() {
        return this.monKeyTotalUdKo;
    }

    public void setMonKeyTotalUdKo(MonKeyTotalUdKo monKeyTotalUdKo) {
        this.monKeyTotalUdKo = monKeyTotalUdKo;
    }

}