package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the APL_V_GETVAL_PARAM_BY_APL database table.
 *
 */
@Entity
@Table(name = "APL_V_GETVAL_PARAM_BY_APL")
@NamedQuery(name = "AplVGetvalParamByApl.findAll", query = "SELECT a FROM AplVGetvalParamByApl a")
public class AplVGetvalParamByApl implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsValoreParamApplic;
    private BigDecimal idParamApplic;
    private BigDecimal idValoreParamApplic;
    private String nmParamApplic;

    public AplVGetvalParamByApl() {
    }

    @Column(name = "DS_VALORE_PARAM_APPLIC")
    public String getDsValoreParamApplic() {
        return this.dsValoreParamApplic;
    }

    public void setDsValoreParamApplic(String dsValoreParamApplic) {
        this.dsValoreParamApplic = dsValoreParamApplic;
    }

    @Column(name = "ID_PARAM_APPLIC")
    public BigDecimal getIdParamApplic() {
        return this.idParamApplic;
    }

    public void setIdParamApplic(BigDecimal idParamApplic) {
        this.idParamApplic = idParamApplic;
    }

    @Id
    @Column(name = "ID_VALORE_PARAM_APPLIC")
    public BigDecimal getIdValoreParamApplic() {
        return this.idValoreParamApplic;
    }

    public void setIdValoreParamApplic(BigDecimal idValoreParamApplic) {
        this.idValoreParamApplic = idValoreParamApplic;
    }

    @Column(name = "NM_PARAM_APPLIC")
    public String getNmParamApplic() {
        return this.nmParamApplic;
    }

    public void setNmParamApplic(String nmParamApplic) {
        this.nmParamApplic = nmParamApplic;
    }

}
