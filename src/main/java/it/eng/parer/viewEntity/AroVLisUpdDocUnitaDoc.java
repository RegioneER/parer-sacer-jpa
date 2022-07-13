package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the ARO_V_LIS_UPD_DOC_UNITA_DOC database table.
 *
 */
@Entity
@Table(name = "ARO_V_LIS_UPD_DOC_UNITA_DOC")
public class AroVLisUpdDocUnitaDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsElemento;
    private String flUpdDatiSpec;
    private String flUpdDatiSpecMigraz;
    private String flUpdProfiloDoc;
    private BigDecimal idDoc;
    private BigDecimal idUpdDocUnitaDoc;
    private BigDecimal idUpdUnitaDoc;
    private String nmTipoDoc;
    private BigDecimal pgDoc;
    private BigDecimal tiDocOrd;

    public AroVLisUpdDocUnitaDoc() {
    }

    @Column(name = "DS_ELEMENTO")
    public String getDsElemento() {
        return this.dsElemento;
    }

    public void setDsElemento(String dsElemento) {
        this.dsElemento = dsElemento;
    }

    @Column(name = "FL_UPD_DATI_SPEC")
    public String getFlUpdDatiSpec() {
        return this.flUpdDatiSpec;
    }

    public void setFlUpdDatiSpec(String flUpdDatiSpec) {
        this.flUpdDatiSpec = flUpdDatiSpec;
    }

    @Column(name = "FL_UPD_DATI_SPEC_MIGRAZ")
    public String getFlUpdDatiSpecMigraz() {
        return this.flUpdDatiSpecMigraz;
    }

    public void setFlUpdDatiSpecMigraz(String flUpdDatiSpecMigraz) {
        this.flUpdDatiSpecMigraz = flUpdDatiSpecMigraz;
    }

    @Column(name = "FL_UPD_PROFILO_DOC")
    public String getFlUpdProfiloDoc() {
        return this.flUpdProfiloDoc;
    }

    public void setFlUpdProfiloDoc(String flUpdProfiloDoc) {
        this.flUpdProfiloDoc = flUpdProfiloDoc;
    }

    @Column(name = "ID_DOC")
    public BigDecimal getIdDoc() {
        return this.idDoc;
    }

    public void setIdDoc(BigDecimal idDoc) {
        this.idDoc = idDoc;
    }

    @Id
    @Column(name = "ID_UPD_DOC_UNITA_DOC")
    public BigDecimal getIdUpdDocUnitaDoc() {
        return this.idUpdDocUnitaDoc;
    }

    public void setIdUpdDocUnitaDoc(BigDecimal idUpdDocUnitaDoc) {
        this.idUpdDocUnitaDoc = idUpdDocUnitaDoc;
    }

    @Column(name = "ID_UPD_UNITA_DOC")
    public BigDecimal getIdUpdUnitaDoc() {
        return this.idUpdUnitaDoc;
    }

    public void setIdUpdUnitaDoc(BigDecimal idUpdUnitaDoc) {
        this.idUpdUnitaDoc = idUpdUnitaDoc;
    }

    @Column(name = "NM_TIPO_DOC")
    public String getNmTipoDoc() {
        return this.nmTipoDoc;
    }

    public void setNmTipoDoc(String nmTipoDoc) {
        this.nmTipoDoc = nmTipoDoc;
    }

    @Column(name = "PG_DOC")
    public BigDecimal getPgDoc() {
        return this.pgDoc;
    }

    public void setPgDoc(BigDecimal pgDoc) {
        this.pgDoc = pgDoc;
    }

    @Column(name = "TI_DOC_ORD")
    public BigDecimal getTiDocOrd() {
        return this.tiDocOrd;
    }

    public void setTiDocOrd(BigDecimal tiDocOrd) {
        this.tiDocOrd = tiDocOrd;
    }
}
