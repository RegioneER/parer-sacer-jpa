package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the FIR_URL_DISTRIB_CRL database table.
 * 
 */
@Entity
@Table(name = "FIR_URL_DISTRIB_OCSP")
@NamedQuery(name = "FirUrlDistribOcsp.findAll", query = "SELECT f FROM FirUrlDistribOcsp f")
public class FirUrlDistribOcsp implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idUrlDistribOcsp;
    private String dlUrlDistribOcsp;
    private BigDecimal niOrdUrlDistribOcsp;
    private FirCertifCa firCertifCa;

    public FirUrlDistribOcsp() {
    }

    @Id
    @SequenceGenerator(name = "FIR_URL_DISTRIB_OCSP_IDURLDISTRIBOCSP_GENERATOR", sequenceName = "SFIR_URL_DISTRIB_OCSP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FIR_URL_DISTRIB_OCSP_IDURLDISTRIBOCSP_GENERATOR")
    @Column(name = "ID_URL_DISTRIB_OCSP")
    public Long getIdUrlDistribOcsp() {
        return this.idUrlDistribOcsp;
    }

    public void setIdUrlDistribOcsp(Long idUrlDistribOcsp) {
        this.idUrlDistribOcsp = idUrlDistribOcsp;
    }

    @Column(name = "DL_URL_DISTRIB_OCSP")
    public String getDlUrlDistribOcsp() {
        return this.dlUrlDistribOcsp;
    }

    public void setDlUrlDistribOcsp(String dlUrlDistribOcsp) {
        this.dlUrlDistribOcsp = dlUrlDistribOcsp;
    }

    @Column(name = "NI_ORD_URL_DISTRIB_OCSP")
    public BigDecimal getNiOrdUrlDistribOcsp() {
        return this.niOrdUrlDistribOcsp;
    }

    public void setNiOrdUrlDistribOcsp(BigDecimal niOrdUrlDistribOcsp) {
        this.niOrdUrlDistribOcsp = niOrdUrlDistribOcsp;
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