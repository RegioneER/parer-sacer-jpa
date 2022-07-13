package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_V_TREE_CATEG_TIPO_UD database table.
 *
 */
@Entity
@Table(name = "DEC_V_TREE_CATEG_TIPO_UD")
@NamedQuery(name = "DecVTreeCategTipoUd.findAll", query = "SELECT d FROM DecVTreeCategTipoUd d")
public class DecVTreeCategTipoUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdCategTipoUnitaDoc;
    private String dlIdCategTipoUnitaDoc;
    private String dlPathCategTipoUnitaDoc;
    private BigDecimal idCategTipoUnitaDoc;

    public DecVTreeCategTipoUd() {
    }

    @Column(name = "CD_CATEG_TIPO_UNITA_DOC")
    public String getCdCategTipoUnitaDoc() {
        return this.cdCategTipoUnitaDoc;
    }

    public void setCdCategTipoUnitaDoc(String cdCategTipoUnitaDoc) {
        this.cdCategTipoUnitaDoc = cdCategTipoUnitaDoc;
    }

    @Column(name = "DL_ID_CATEG_TIPO_UNITA_DOC")
    public String getDlIdCategTipoUnitaDoc() {
        return this.dlIdCategTipoUnitaDoc;
    }

    public void setDlIdCategTipoUnitaDoc(String dlIdCategTipoUnitaDoc) {
        this.dlIdCategTipoUnitaDoc = dlIdCategTipoUnitaDoc;
    }

    @Column(name = "DL_PATH_CATEG_TIPO_UNITA_DOC")
    public String getDlPathCategTipoUnitaDoc() {
        return this.dlPathCategTipoUnitaDoc;
    }

    public void setDlPathCategTipoUnitaDoc(String dlPathCategTipoUnitaDoc) {
        this.dlPathCategTipoUnitaDoc = dlPathCategTipoUnitaDoc;
    }

    @Id
    @Column(name = "ID_CATEG_TIPO_UNITA_DOC")
    public BigDecimal getIdCategTipoUnitaDoc() {
        return this.idCategTipoUnitaDoc;
    }

    public void setIdCategTipoUnitaDoc(BigDecimal idCategTipoUnitaDoc) {
        this.idCategTipoUnitaDoc = idCategTipoUnitaDoc;
    }

}
