package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the APL_V_GETVAL_PARAM_BY_TIUD database table.
 *
 */
@Entity
@Table(name = "APL_V_GETVAL_PARAM_BY_TIUD")
@NamedQuery(name = "AplVGetvalParamByTiud.findAll", query = "SELECT a FROM AplVGetvalParamByTiud a")
public class AplVGetvalParamByTiud implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsValoreParamApplic;
    private BigDecimal idEnte;
    private BigDecimal idParamApplic;
    private BigDecimal idStrut;
    private BigDecimal idTipoUnitaDoc;
    private BigDecimal idValoreParamApplic;
    private String nmEnte;
    private String nmParamApplic;
    private String nmStrut;
    private String nmTipoUnitaDoc;
    private String tiAppart;

    public AplVGetvalParamByTiud() {/* Hibernate */
    }

    @Column(name = "DS_VALORE_PARAM_APPLIC")
    public String getDsValoreParamApplic() {
        return this.dsValoreParamApplic;
    }

    public void setDsValoreParamApplic(String dsValoreParamApplic) {
        this.dsValoreParamApplic = dsValoreParamApplic;
    }

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Column(name = "ID_PARAM_APPLIC")
    public BigDecimal getIdParamApplic() {
        return this.idParamApplic;
    }

    public void setIdParamApplic(BigDecimal idParamApplic) {
        this.idParamApplic = idParamApplic;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return this.idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }

    @Id
    @Column(name = "ID_VALORE_PARAM_APPLIC")
    public BigDecimal getIdValoreParamApplic() {
        return this.idValoreParamApplic;
    }

    public void setIdValoreParamApplic(BigDecimal idValoreParamApplic) {
        this.idValoreParamApplic = idValoreParamApplic;
    }

    @Column(name = "NM_ENTE")
    public String getNmEnte() {
        return this.nmEnte;
    }

    public void setNmEnte(String nmEnte) {
        this.nmEnte = nmEnte;
    }

    @Column(name = "NM_PARAM_APPLIC")
    public String getNmParamApplic() {
        return this.nmParamApplic;
    }

    public void setNmParamApplic(String nmParamApplic) {
        this.nmParamApplic = nmParamApplic;
    }

    @Column(name = "NM_STRUT")
    public String getNmStrut() {
        return this.nmStrut;
    }

    public void setNmStrut(String nmStrut) {
        this.nmStrut = nmStrut;
    }

    @Column(name = "NM_TIPO_UNITA_DOC")
    public String getNmTipoUnitaDoc() {
        return this.nmTipoUnitaDoc;
    }

    public void setNmTipoUnitaDoc(String nmTipoUnitaDoc) {
        this.nmTipoUnitaDoc = nmTipoUnitaDoc;
    }

    @Column(name = "TI_APPART")
    public String getTiAppart() {
        return this.tiAppart;
    }

    public void setTiAppart(String tiAppart) {
        this.tiAppart = tiAppart;
    }

}
