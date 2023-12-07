package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class ElvVSelUsrIndiceElencoId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.idElencoVers);
        hash = 37 * hash + Objects.hashCode(this.nmUserid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ElvVSelUsrIndiceElencoId other = (ElvVSelUsrIndiceElencoId) obj;
        if (!Objects.equals(this.nmUserid, other.nmUserid)) {
            return false;
        }
        if (!Objects.equals(this.idElencoVers, other.idElencoVers)) {
            return false;
        }
        return true;
    }

    private BigDecimal idElencoVers;

    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    private String nmUserid;

    @Column(name = "NM_USERID")
    public String getNmUserid() {
        return nmUserid;
    }

    public void setNmUserid(String nmUserid) {
        this.nmUserid = nmUserid;
    }
}
