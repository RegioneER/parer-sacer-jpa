package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * The persistent class for the ARO_V_LIS_DATI_SPEC_DOC database table.
 * 
 */
// @Entity
// @Table(name = "ARO_V_LIS_DATI_SPEC_DOC")
public class AroVLisDatiSpecDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dlValore;
    private String dsAttribTipoDoc;
    private BigDecimal idDatiSpecDoc;
    private BigDecimal idDoc;
    private BigDecimal niOrdAttrib;
    private String nmAttribTipoDoc;

    public AroVLisDatiSpecDoc() {/* Hibernate */
    }

    @Column(name = "DL_VALORE")
    public String getDlValore() {
        return this.dlValore;
    }

    public void setDlValore(String dlValore) {
        this.dlValore = dlValore;
    }

    @Column(name = "DS_ATTRIB_TIPO_DOC")
    public String getDsAttribTipoDoc() {
        return this.dsAttribTipoDoc;
    }

    public void setDsAttribTipoDoc(String dsAttribTipoDoc) {
        this.dsAttribTipoDoc = dsAttribTipoDoc;
    }

    @Id
    @Column(name = "ID_DATI_SPEC_DOC")
    public BigDecimal getIdDatiSpecDoc() {
        return this.idDatiSpecDoc;
    }

    public void setIdDatiSpecDoc(BigDecimal idDatiSpecDoc) {
        this.idDatiSpecDoc = idDatiSpecDoc;
    }

    @Column(name = "ID_DOC")
    public BigDecimal getIdDoc() {
        return this.idDoc;
    }

    public void setIdDoc(BigDecimal idDoc) {
        this.idDoc = idDoc;
    }

    @Column(name = "NI_ORD_ATTRIB")
    public BigDecimal getNiOrdAttrib() {
        return this.niOrdAttrib;
    }

    public void setNiOrdAttrib(BigDecimal niOrdAttrib) {
        this.niOrdAttrib = niOrdAttrib;
    }

    @Column(name = "NM_ATTRIB_TIPO_DOC")
    public String getNmAttribTipoDoc() {
        return this.nmAttribTipoDoc;
    }

    public void setNmAttribTipoDoc(String nmAttribTipoDoc) {
        this.nmAttribTipoDoc = nmAttribTipoDoc;
    }

}
