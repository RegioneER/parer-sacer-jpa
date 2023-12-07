package it.eng.parer.grantedViewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the ORG_V_CHK_SERV_FATT_BY_STRUT database table.
 */
@Entity
@Table(schema = "SACER_IAM", name = "ORG_V_CHK_SERV_FATT_BY_STRUT")
public class OrgVChkServFattByStrut implements Serializable {

    private static final long serialVersionUID = 1L;

    private String flEliminaEnteStrut;

    public OrgVChkServFattByStrut() {/* Hibernate */
    }

    @Column(name = "FL_ELIMINA_ENTE_STRUT", columnDefinition = "char(1)")
    public String getFlEliminaEnteStrut() {
        return this.flEliminaEnteStrut;
    }

    public void setFlEliminaEnteStrut(String flEliminaEnteStrut) {
        this.flEliminaEnteStrut = flEliminaEnteStrut;
    }

    private OrgVChkServFattByStrutId orgVChkServFattByStrutId;

    @EmbeddedId()
    public OrgVChkServFattByStrutId getOrgVChkServFattByStrutId() {
        return orgVChkServFattByStrutId;
    }

    public void setOrgVChkServFattByStrutId(OrgVChkServFattByStrutId orgVChkServFattByStrutId) {
        this.orgVChkServFattByStrutId = orgVChkServFattByStrutId;
    }
}
