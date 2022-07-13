package it.eng.parer.grantedViewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ORG_V_TREE_AMBITO_TERRIT database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.ORG_V_TREE_AMBITO_TERRIT")
public class OrgVTreeAmbitoTerrit implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdAmbitoTerrit;
    private String dsTreeCdAmbitoTerrit;
    private String dsTreeIdAmbitoTerrit;
    private BigDecimal idAmbitoTerrit;
    private BigDecimal idAmbitoTerritPadre;
    private String tiAmbitoTerrit;

    public OrgVTreeAmbitoTerrit() {
    }

    @Column(name = "CD_AMBITO_TERRIT")
    public String getCdAmbitoTerrit() {
        return this.cdAmbitoTerrit;
    }

    public void setCdAmbitoTerrit(String cdAmbitoTerrit) {
        this.cdAmbitoTerrit = cdAmbitoTerrit;
    }

    @Column(name = "DS_TREE_CD_AMBITO_TERRIT")
    public String getDsTreeCdAmbitoTerrit() {
        return this.dsTreeCdAmbitoTerrit;
    }

    public void setDsTreeCdAmbitoTerrit(String dsTreeCdAmbitoTerrit) {
        this.dsTreeCdAmbitoTerrit = dsTreeCdAmbitoTerrit;
    }

    @Column(name = "DS_TREE_ID_AMBITO_TERRIT")
    public String getDsTreeIdAmbitoTerrit() {
        return this.dsTreeIdAmbitoTerrit;
    }

    public void setDsTreeIdAmbitoTerrit(String dsTreeIdAmbitoTerrit) {
        this.dsTreeIdAmbitoTerrit = dsTreeIdAmbitoTerrit;
    }

    @Id
    @Column(name = "ID_AMBITO_TERRIT")
    public BigDecimal getIdAmbitoTerrit() {
        return this.idAmbitoTerrit;
    }

    public void setIdAmbitoTerrit(BigDecimal idAmbitoTerrit) {
        this.idAmbitoTerrit = idAmbitoTerrit;
    }

    @Column(name = "ID_AMBITO_TERRIT_PADRE")
    public BigDecimal getIdAmbitoTerritPadre() {
        return this.idAmbitoTerritPadre;
    }

    public void setIdAmbitoTerritPadre(BigDecimal idAmbitoTerritPadre) {
        this.idAmbitoTerritPadre = idAmbitoTerritPadre;
    }

    @Column(name = "TI_AMBITO_TERRIT")
    public String getTiAmbitoTerrit() {
        return this.tiAmbitoTerrit;
    }

    public void setTiAmbitoTerrit(String tiAmbitoTerrit) {
        this.tiAmbitoTerrit = tiAmbitoTerrit;
    }

}
