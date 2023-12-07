package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_CALC_DIM_SERIE database table.
 *
 */
@Entity
@Table(name = "SER_V_CALC_DIM_SERIE")
@NamedQuery(name = "SerVCalcDimSerie.findAll", query = "SELECT s FROM SerVCalcDimSerie s")
public class SerVCalcDimSerie implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idContenutoVerSerie;
    private BigDecimal niMbSizeContenutoEff;

    public SerVCalcDimSerie() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_CONTENUTO_VER_SERIE")
    public BigDecimal getIdContenutoVerSerie() {
        return this.idContenutoVerSerie;
    }

    public void setIdContenutoVerSerie(BigDecimal idContenutoVerSerie) {
        this.idContenutoVerSerie = idContenutoVerSerie;
    }

    @Column(name = "NI_MB_SIZE_CONTENUTO_EFF")
    public BigDecimal getNiMbSizeContenutoEff() {
        return this.niMbSizeContenutoEff;
    }

    public void setNiMbSizeContenutoEff(BigDecimal niMbSizeContenutoEff) {
        this.niMbSizeContenutoEff = niMbSizeContenutoEff;
    }

}
