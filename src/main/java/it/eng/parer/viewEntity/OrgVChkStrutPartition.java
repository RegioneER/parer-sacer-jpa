package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ORG_V_CHK_STRUT_PARTITION database table.
 *
 */
@Entity
@Table(name = "ORG_V_CHK_STRUT_PARTITION")
@NamedQuery(name = "OrgVChkStrutPartition.findAll", query = "SELECT o FROM OrgVChkStrutPartition o")
public class OrgVChkStrutPartition implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flPartOk;
    private BigDecimal idStrut;

    public OrgVChkStrutPartition() {/* Hibernate */
    }

    @Column(name = "FL_PART_OK", columnDefinition = "char(1)")
    public String getFlPartOk() {
        return this.flPartOk;
    }

    public void setFlPartOk(String flPartOk) {
        this.flPartOk = flPartOk;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

}
