package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the SER_V_LIS_VERSER_BY_UPD_UD database table.
 *
 */
@Entity
@Table(name = "SER_V_LIS_VERSER_BY_UPD_UD")
@NamedQuery(name = "SerVLisVerserByUpdUd.findAll", query = "SELECT s FROM SerVLisVerserByUpdUd s")
public class SerVLisVerserByUpdUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private BigDecimal idVerSerie;

    public SerVLisVerserByUpdUd() {
    }

    @Id
    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Id
    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

}
