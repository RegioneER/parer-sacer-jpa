package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the OST_V_CHK_USO_TBS database table.
 *
 */
@Entity
@Table(name = "OST_V_CHK_USO_TBS")
@NamedQuery(name = "OstVChkUsoTb.findAll", query = "SELECT o FROM OstVChkUsoTb o")
public class OstVChkUsoTb implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flOk;
    private String nmTablespace;

    public OstVChkUsoTb() {
    }

    @Column(name = "FL_OK")
    public String getFlOk() {
        return this.flOk;
    }

    public void setFlOk(String flOk) {
        this.flOk = flOk;
    }

    @Id
    @Column(name = "NM_TABLESPACE")
    public String getNmTablespace() {
        return this.nmTablespace;
    }

    public void setNmTablespace(String nmTablespace) {
        this.nmTablespace = nmTablespace;
    }

}
