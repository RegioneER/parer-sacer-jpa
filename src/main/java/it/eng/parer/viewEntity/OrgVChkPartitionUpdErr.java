package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ORG_V_CHK_PARTITION_UPD_ERR database table.
 * 
 */
@Entity
@Table(name = "ORG_V_CHK_PARTITION_UPD_ERR")
@NamedQuery(name = "OrgVChkPartitionUpdErr.findAll", query = "SELECT o FROM OrgVChkPartitionUpdErr o")
public class OrgVChkPartitionUpdErr implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cdPartitionSesupderr;
    private String flPartSesupderrOk;

    public OrgVChkPartitionUpdErr() {
    }

    @Column(name = "CD_PARTITION_SESUPDERR")
    public String getCdPartitionSesupderr() {
        return this.cdPartitionSesupderr;
    }

    public void setCdPartitionSesupderr(String cdPartitionSesupderr) {
        this.cdPartitionSesupderr = cdPartitionSesupderr;
    }

    @Id
    @Column(name = "FL_PART_SESUPDERR_OK")
    public String getFlPartSesupderrOk() {
        return this.flPartSesupderrOk;
    }

    public void setFlPartSesupderrOk(String flPartSesupderrOk) {
        this.flPartSesupderrOk = flPartSesupderrOk;
    }

}