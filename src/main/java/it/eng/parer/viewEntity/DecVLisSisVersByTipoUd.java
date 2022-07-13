package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

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
    private BigDecimal idSistemaVersante;
    private BigDecimal idTipoUnitaDoc;
    private String nmSistemaVersante;

    public DecVLisSisVersByTipoUd() {
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_EROG")
    public Date getDtErog() {
        return this.dtErog;
    }

    public void setDtErog(Date dtErog) {
        this.dtErog = dtErog;
    }

    @Id
    @Column(name = "ID_SISTEMA_VERSANTE")
    public BigDecimal getIdSistemaVersante() {
        return this.idSistemaVersante;
    }

    public void setIdSistemaVersante(BigDecimal idSistemaVersante) {
        this.idSistemaVersante = idSistemaVersante;
    }

    @Id
    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return this.idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }

    @Column(name = "NM_SISTEMA_VERSANTE")
    public String getNmSistemaVersante() {
        return this.nmSistemaVersante;
    }

    public void setNmSistemaVersante(String nmSistemaVersante) {
        this.nmSistemaVersante = nmSistemaVersante;
    }

}
