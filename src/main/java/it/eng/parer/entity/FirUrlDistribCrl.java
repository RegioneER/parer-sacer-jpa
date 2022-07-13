package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the FIR_URL_DISTRIB_CRL database table.
 * 
 */
@Entity
@Table(name = "FIR_URL_DISTRIB_CRL")
@NamedQuery(name = "FirUrlDistribCrl.findAll", query = "SELECT f FROM FirUrlDistribCrl f")
public class FirUrlDistribCrl implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUrlDistribCrl;
    private String dlUrlDistribCrl;
    private BigDecimal niOrdUrlDistribCrl;
    private FirCertifCa firCertifCa;

    public FirUrlDistribCrl() {
    }

    @Id
    @SequenceGenerator(name = "FIR_URL_DISTRIB_CRL_IDURLDISTRIBCRL_GENERATOR", sequenceName = "SFIR_URL_DISTRIB_CRL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FIR_URL_DISTRIB_CRL_IDURLDISTRIBCRL_GENERATOR")
    @Column(name = "ID_URL_DISTRIB_CRL")
    public long getIdUrlDistribCrl() {
        return this.idUrlDistribCrl;
    }

    public void setIdUrlDistribCrl(long idUrlDistribCrl) {
        this.idUrlDistribCrl = idUrlDistribCrl;
    }

    @Column(name = "DL_URL_DISTRIB_CRL")
    public String getDlUrlDistribCrl() {
        return this.dlUrlDistribCrl;
    }

    public void setDlUrlDistribCrl(String dlUrlDistribCrl) {
        this.dlUrlDistribCrl = dlUrlDistribCrl;
    }

    @Column(name = "NI_ORD_URL_DISTRIB_CRL")
    public BigDecimal getNiOrdUrlDistribCrl() {
        return this.niOrdUrlDistribCrl;
    }

    public void setNiOrdUrlDistribCrl(BigDecimal niOrdUrlDistribCrl) {
        this.niOrdUrlDistribCrl = niOrdUrlDistribCrl;
    }

    // bi-directional many-to-one association to FirCertifCa
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CERTIF_CA")
    public FirCertifCa getFirCertifCa() {
        return this.firCertifCa;
    }

    public void setFirCertifCa(FirCertifCa firCertifCa) {
        this.firCertifCa = firCertifCa;
    }

}