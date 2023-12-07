package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the DEC_V_LIS_SIS_VERS_BY_TIPO_UD database table.
 *
 */
@Entity
@Table(name = "DEC_V_LIS_SIS_VERS_BY_TIPO_UD")
@NamedQuery(name = "DecVLisSisVersByTipoUd.findAll", query = "SELECT d FROM DecVLisSisVersByTipoUd d")
public class DecVLisSisVersByTipoUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date dtErog;
    private Date dtLastErog;
    private String nmSistemaVersante;
    private DecVLisSisVersByTipoUdId decVLisSisVersByTipoUdId;

    public DecVLisSisVersByTipoUd() {/* Hibernate */
    }

    @EmbeddedId
    public DecVLisSisVersByTipoUdId getDecVLisSisVersByTipoUdId() {
        return decVLisSisVersByTipoUdId;
    }

    public void setDecVLisSisVersByTipoUdId(DecVLisSisVersByTipoUdId decVLisSisVersByTipoUdId) {
        this.decVLisSisVersByTipoUdId = decVLisSisVersByTipoUdId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_EROG")
    public Date getDtErog() {
        return this.dtErog;
    }

    public void setDtErog(Date dtErog) {
        this.dtErog = dtErog;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LAST_EROG")
    public Date getDtLastErog() {
        return this.dtLastErog;
    }

    public void setDtLastErog(Date dtLastErog) {
        this.dtLastErog = dtLastErog;
    }

    @Column(name = "NM_SISTEMA_VERSANTE")
    public String getNmSistemaVersante() {
        return this.nmSistemaVersante;
    }

    public void setNmSistemaVersante(String nmSistemaVersante) {
        this.nmSistemaVersante = nmSistemaVersante;
    }

}
