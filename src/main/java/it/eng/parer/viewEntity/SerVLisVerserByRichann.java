package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_LIS_VERSER_BY_RICHANN database table.
 */
@Entity
@Table(name = "SER_V_LIS_VERSER_BY_RICHANN")
@NamedQuery(name = "SerVLisVerserByRichann.findAll", query = "SELECT s FROM SerVLisVerserByRichann s")
public class SerVLisVerserByRichann implements Serializable {

    private static final long serialVersionUID = 1L;

    public SerVLisVerserByRichann() {/* Hibernate */
    }

    private SerVLisVerserByRichannId serVLisVerserByRichannId;

    @EmbeddedId()
    public SerVLisVerserByRichannId getSerVLisVerserByRichannId() {
        return serVLisVerserByRichannId;
    }

    public void setSerVLisVerserByRichannId(SerVLisVerserByRichannId serVLisVerserByRichannId) {
        this.serVLisVerserByRichannId = serVLisVerserByRichannId;
    }
}
