package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the FIR_FILE_PER_FIRMA database table.
 * 
 */
@Entity
@Table(name = "FIR_FILE_PER_FIRMA")
public class FirFilePerFirma implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFilePerFirma;
    private byte[] blFilePerFirma;
    private String nmFileDownload;
    private String tiFilePerFirma;
    private FirCertifCa firCertifCa;
    private FirCertifFirmatario firCertifFirmatario;
    private FirCertifOcsp firCertifOcsp;
    private FirCrl firCrl;
    private FirOcsp firOcsp;

    public FirFilePerFirma() {
    }

    @Id
    @SequenceGenerator(name = "FIR_FILE_PER_FIRMA_IDFILEPERFIRMA_GENERATOR", sequenceName = "SFIR_FILE_PER_FIRMA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FIR_FILE_PER_FIRMA_IDFILEPERFIRMA_GENERATOR")
    @Column(name = "ID_FILE_PER_FIRMA")
    public long getIdFilePerFirma() {
        return this.idFilePerFirma;
    }

    public void setIdFilePerFirma(long idFilePerFirma) {
        this.idFilePerFirma = idFilePerFirma;
    }

    @Lob()
    @Column(name = "BL_FILE_PER_FIRMA")
    public byte[] getBlFilePerFirma() {
        return this.blFilePerFirma;
    }

    public void setBlFilePerFirma(byte[] blFilePerFirma) {
        this.blFilePerFirma = blFilePerFirma;
    }

    @Column(name = "NM_FILE_DOWNLOAD")
    public String getNmFileDownload() {
        return this.nmFileDownload;
    }

    public void setNmFileDownload(String nmFileDownload) {
        this.nmFileDownload = nmFileDownload;
    }

    @Column(name = "TI_FILE_PER_FIRMA")
    public String getTiFilePerFirma() {
        return this.tiFilePerFirma;
    }

    public void setTiFilePerFirma(String tiFilePerFirma) {
        this.tiFilePerFirma = tiFilePerFirma;
    }

    // bi-directional one-to-one association to FirCertifCa
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CERTIF_CA")
    public FirCertifCa getFirCertifCa() {
        return this.firCertifCa;
    }

    public void setFirCertifCa(FirCertifCa firCertifCa) {
        this.firCertifCa = firCertifCa;
    }

    // bi-directional one-to-one association to FirCertifFirmatario
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CERTIF_FIRMATARIO")
    public FirCertifFirmatario getFirCertifFirmatario() {
        return this.firCertifFirmatario;
    }

    public void setFirCertifFirmatario(FirCertifFirmatario firCertifFirmatario) {
        this.firCertifFirmatario = firCertifFirmatario;
    }

    // bi-directional one-to-one association to FirCertifFirmatario
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CERTIF_OCSP")
    public FirCertifOcsp getFirCertifOcsp() {
        return this.firCertifOcsp;
    }

    public void setFirCertifOcsp(FirCertifOcsp firCertifOcsp) {
        this.firCertifOcsp = firCertifOcsp;
    }

    // bi-directional one-to-one association to FirCrl
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CRL")
    public FirCrl getFirCrl() {
        return this.firCrl;
    }

    public void setFirCrl(FirCrl firCrl) {
        this.firCrl = firCrl;
    }

    // bi-directional one-to-one association to FirCrl
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_OCSP")
    public FirOcsp getFirOcsp() {
        return this.firOcsp;
    }

    public void setFirOcsp(FirOcsp firOcsp) {
        this.firOcsp = firOcsp;
    }

}