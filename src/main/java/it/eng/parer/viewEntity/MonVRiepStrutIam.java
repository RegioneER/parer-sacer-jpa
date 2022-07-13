package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_RIEP_STRUT_IAM database table.
 *
 */
@Entity
@Table(name = "MON_V_RIEP_STRUT_IAM")
@NamedQuery(name = "MonVRiepStrutIam.findAll", query = "SELECT m FROM MonVRiepStrutIam m")
public class MonVRiepStrutIam implements Serializable {
    /*
     * "ID_USER_IAM", "ID_STRUT", "ID_AMBIENTE", "NM_AMBIENTE", "NM_ENTE", "NM_STRUT", "FL_SESSIONI_FALLITE_NO_RIS",
     * "FL_DOC_SENZA_ELENCO", "FL_ELENCO_CHIUSO", "FL_ERR_FMT_NUMERO"
     */

    private static final long serialVersionUID = 1L;
    private String flDocSenzaElenco;
    private String flElencoChiuso;
    private String flErrFmtNumero;
    private String flRichAnnulVersAperta;
    private String flSessioniFalliteNoRis;
    private BigDecimal idStrut;
    private BigDecimal idAmbiente;
    private BigDecimal idUserIam;
    private String nmAmbiente;
    private String nmEnte;
    private String nmStrut;

    public MonVRiepStrutIam() {
    }

    @Column(name = "FL_DOC_SENZA_ELENCO")
    public String getFlDocSenzaElenco() {
        return this.flDocSenzaElenco;
    }

    public void setFlDocSenzaElenco(String flDocSenzaElenco) {
        this.flDocSenzaElenco = flDocSenzaElenco;
    }

    @Column(name = "FL_ELENCO_CHIUSO")
    public String getFlElencoChiuso() {
        return this.flElencoChiuso;
    }

    public void setFlElencoChiuso(String flElencoChiuso) {
        this.flElencoChiuso = flElencoChiuso;
    }

    @Column(name = "FL_ERR_FMT_NUMERO")
    public String getFlErrFmtNumero() {
        return this.flErrFmtNumero;
    }

    public void setFlErrFmtNumero(String flErrFmtNumero) {
        this.flErrFmtNumero = flErrFmtNumero;
    }

    @Column(name = "FL_RICH_ANNUL_VERS_APERTA")
    public String getFlRichAnnulVersAperta() {
        return flRichAnnulVersAperta;
    }

    public void setFlRichAnnulVersAperta(String flRichAnnulVersAperta) {
        this.flRichAnnulVersAperta = flRichAnnulVersAperta;
    }

    @Column(name = "FL_SESSIONI_FALLITE_NO_RIS")
    public String getFlSessioniFalliteNoRis() {
        return this.flSessioniFalliteNoRis;
    }

    public void setFlSessioniFalliteNoRis(String flSessioniFalliteNoRis) {
        this.flSessioniFalliteNoRis = flSessioniFalliteNoRis;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "NM_AMBIENTE")
    public String getNmAmbiente() {
        return this.nmAmbiente;
    }

    public void setNmAmbiente(String nmAmbiente) {
        this.nmAmbiente = nmAmbiente;
    }

    @Column(name = "NM_ENTE")
    public String getNmEnte() {
        return this.nmEnte;
    }

    public void setNmEnte(String nmEnte) {
        this.nmEnte = nmEnte;
    }

    @Column(name = "NM_STRUT")
    public String getNmStrut() {
        return this.nmStrut;
    }

    public void setNmStrut(String nmStrut) {
        this.nmStrut = nmStrut;
    }

}
