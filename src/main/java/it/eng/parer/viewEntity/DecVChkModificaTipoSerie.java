package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_V_CHK_MODIFICA_TIPO_SERIE database table.
 *
 */
@Entity
@Table(name = "DEC_V_CHK_MODIFICA_TIPO_SERIE")
@NamedQuery(name = "DecVChkModificaTipoSerie.findAll", query = "SELECT d FROM DecVChkModificaTipoSerie d")
public class DecVChkModificaTipoSerie implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flModificaTipoSerie;
    private BigDecimal idTipoSerie;

    public DecVChkModificaTipoSerie() {/* Hibernate */
    }

    @Column(name = "FL_MODIFICA_TIPO_SERIE", columnDefinition = "char(1)")
    public String getFlModificaTipoSerie() {
        return this.flModificaTipoSerie;
    }

    public void setFlModificaTipoSerie(String flModificaTipoSerie) {
        this.flModificaTipoSerie = flModificaTipoSerie;
    }

    @Id
    @Column(name = "ID_TIPO_SERIE")
    public BigDecimal getIdTipoSerie() {
        return this.idTipoSerie;
    }

    public void setIdTipoSerie(BigDecimal idTipoSerie) {
        this.idTipoSerie = idTipoSerie;
    }

}
