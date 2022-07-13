package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the OST_V_PAYLOAD_MIGRAZ_FILE_BLOB database table.
 *
 */
@Entity
@Table(name = "OST_V_PAYLOAD_MIGRAZ_FILE_BLOB")
public class OstVPayloadMigrazFileBlob implements Serializable {

    private static final long serialVersionUID = 1L;

    private String dsUrnIniziale;
    private String dsUrnNormaliz;
    private String dsUrnOriginale;
    private Date dtCreazione;
    // id del componente
    private BigDecimal idCompDoc;
    private BigDecimal niSizeFileCalc;

    public OstVPayloadMigrazFileBlob() {
    }

    @Column(name = "DS_URN_INIZIALE")
    public String getDsUrnIniziale() {
        return this.dsUrnIniziale;
    }

    public void setDsUrnIniziale(String dsUrnIniziale) {
        this.dsUrnIniziale = dsUrnIniziale;
    }

    @Column(name = "DS_URN_NORMALIZ")
    public String getDsUrnNormaliz() {
        return this.dsUrnNormaliz;
    }

    public void setDsUrnNormaliz(String dsUrnNormaliz) {
        this.dsUrnNormaliz = dsUrnNormaliz;
    }

    @Column(name = "DS_URN_ORIGINALE")
    public String getDsUrnOriginale() {
        return this.dsUrnOriginale;
    }

    public void setDsUrnOriginale(String dsUrnOriginale) {
        this.dsUrnOriginale = dsUrnOriginale;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Id
    @Column(name = "ID_COMP_DOC")
    public BigDecimal getIdCompDoc() {
        return this.idCompDoc;
    }

    public void setIdCompDoc(BigDecimal idCompDoc) {
        this.idCompDoc = idCompDoc;
    }

    @Column(name = "NI_SIZE_FILE_CALC")
    public BigDecimal getNiSizeFileCalc() {
        return this.niSizeFileCalc;
    }

    public void setNiSizeFileCalc(BigDecimal niSizeFileCalc) {
        this.niSizeFileCalc = niSizeFileCalc;
    }

}
