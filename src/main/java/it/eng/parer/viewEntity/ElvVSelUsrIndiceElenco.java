package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ELV_V_SEL_USR_INDICE_ELENCO database table.
 */
@Entity
@Table(name = "ELV_V_SEL_USR_INDICE_ELENCO")
@NamedQuery(name = "ElvVSelUsrIndiceElenco.findAll", query = "SELECT e FROM ElvVSelUsrIndiceElenco e")
public class ElvVSelUsrIndiceElenco implements Serializable {

    private static final long serialVersionUID = 1L;

    public ElvVSelUsrIndiceElenco() {/* Hibernate */
    }

    private ElvVSelUsrIndiceElencoId elvVSelUsrIndiceElencoId;

    @EmbeddedId()
    public ElvVSelUsrIndiceElencoId getElvVSelUsrIndiceElencoId() {
        return elvVSelUsrIndiceElencoId;
    }

    public void setElvVSelUsrIndiceElencoId(ElvVSelUsrIndiceElencoId elvVSelUsrIndiceElencoId) {
        this.elvVSelUsrIndiceElencoId = elvVSelUsrIndiceElencoId;
    }
}
