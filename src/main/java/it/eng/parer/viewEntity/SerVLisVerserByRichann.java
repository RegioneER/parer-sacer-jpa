package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the SER_V_LIS_VERSER_BY_RICHANN database table.
 *
 */
@Entity
@Table(name = "SER_V_LIS_VERSER_BY_RICHANN")
@NamedQuery(name = "SerVLisVerserByRichann.findAll", query = "SELECT s FROM SerVLisVerserByRichann s")
public class SerVLisVerserByRichann implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idRichAnnulVers;
    private BigDecimal idVerSerie;

    public SerVLisVerserByRichann() {
    }

    @Id
    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return this.idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
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
