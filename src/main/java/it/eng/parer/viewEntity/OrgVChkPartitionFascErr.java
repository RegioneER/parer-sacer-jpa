package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ORG_V_CHK_PARTITION_FASC_ERR database table.
 *
 */
@Entity
@Table(name = "ORG_V_CHK_PARTITION_FASC_ERR")
public class OrgVChkPartitionFascErr implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdPartitionSesfascerr;

    private String flPartSesfascerrOk;

    public OrgVChkPartitionFascErr() {
    }

    @Column(name = "CD_PARTITION_SESFASCERR")
    public String getCdPartitionSesfascerr() {
        return cdPartitionSesfascerr;
    }

    public void setCdPartitionSesfascerr(String cdPartitionSesfascerr) {
        this.cdPartitionSesfascerr = cdPartitionSesfascerr;
    }

    @Id
    @Column(name = "FL_PART_SESFASCERR_OK")
    public String getFlPartSesfascerrOk() {
        return flPartSesfascerrOk;
    }

    public void setFlPartSesfascerrOk(String flPartSesfascerrOk) {
        this.flPartSesfascerrOk = flPartSesfascerrOk;
    }

}
