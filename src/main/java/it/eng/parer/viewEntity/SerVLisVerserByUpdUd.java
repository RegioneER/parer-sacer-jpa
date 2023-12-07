package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_LIS_VERSER_BY_UPD_UD database table.
 */
@Entity
@Table(name = "SER_V_LIS_VERSER_BY_UPD_UD")
@NamedQuery(name = "SerVLisVerserByUpdUd.findAll", query = "SELECT s FROM SerVLisVerserByUpdUd s")
public class SerVLisVerserByUpdUd implements Serializable {

    private static final long serialVersionUID = 1L;

    public SerVLisVerserByUpdUd() {/* Hibernate */
    }

    private SerVLisVerserByUpdUdId serVLisVerserByUpdUdId;

    @EmbeddedId()
    public SerVLisVerserByUpdUdId getSerVLisVerserByUpdUdId() {
        return serVLisVerserByUpdUdId;
    }

    public void setSerVLisVerserByUpdUdId(SerVLisVerserByUpdUdId serVLisVerserByUpdUdId) {
        this.serVLisVerserByUpdUdId = serVLisVerserByUpdUdId;
    }
}
