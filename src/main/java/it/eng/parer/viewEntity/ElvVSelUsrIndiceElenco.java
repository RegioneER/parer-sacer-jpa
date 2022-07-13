package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ELV_V_SEL_USR_INDICE_ELENCO database table.
 * 
 */
@Entity
@Table(name = "ELV_V_SEL_USR_INDICE_ELENCO")
@NamedQuery(name = "ElvVSelUsrIndiceElenco.findAll", query = "SELECT e FROM ElvVSelUsrIndiceElenco e")
public class ElvVSelUsrIndiceElenco implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idElencoVers;
    private String nmUserid;

    public ElvVSelUsrIndiceElenco() {
    }

    @Id
    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    @Id
    @Column(name = "NM_USERID")
    public String getNmUserid() {
        return this.nmUserid;
    }

    public void setNmUserid(String nmUserid) {
        this.nmUserid = nmUserid;
    }

}