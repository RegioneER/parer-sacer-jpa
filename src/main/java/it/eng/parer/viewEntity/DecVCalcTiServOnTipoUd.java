package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_V_CALC_TI_SERV_ON_TIPO_UD database table.
 *
 */
@Entity
@Table(name = "DEC_V_CALC_TI_SERV_ON_TIPO_UD")
@NamedQuery(name = "DecVCalcTiServOnTipoUd.findAll", query = "SELECT d FROM DecVCalcTiServOnTipoUd d")
public class DecVCalcTiServOnTipoUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private DecVCalcTiServOnTipoUdId decVCalcTiServOnTipoUdId;
    private BigDecimal idTipoServizioAttiv;
    private BigDecimal idTipoServizioConserv;
    private String cdAlgoTariffario;

    @EmbeddedId
    public DecVCalcTiServOnTipoUdId getDecVCalcTiServOnTipoUdId() {
        return decVCalcTiServOnTipoUdId;
    }

    public void setDecVCalcTiServOnTipoUdId(DecVCalcTiServOnTipoUdId decVCalcTiServOnTipoUdId) {
        this.decVCalcTiServOnTipoUdId = decVCalcTiServOnTipoUdId;
    }

    public DecVCalcTiServOnTipoUd() {/* Hibernate */
    }

    @Column(name = "ID_TIPO_SERVIZIO_ATTIV")
    public BigDecimal getIdTipoServizioAttiv() {
        return this.idTipoServizioAttiv;
    }

    public void setIdTipoServizioAttiv(BigDecimal idTipoServizioAttiv) {
        this.idTipoServizioAttiv = idTipoServizioAttiv;
    }

    @Column(name = "ID_TIPO_SERVIZIO_CONSERV")
    public BigDecimal getIdTipoServizioConserv() {
        return this.idTipoServizioConserv;
    }

    public void setIdTipoServizioConserv(BigDecimal idTipoServizioConserv) {
        this.idTipoServizioConserv = idTipoServizioConserv;
    }

    @Id
    @Column(name = "CD_ALGO_TARIFFARIO")
    public String getCdAlgoTariffario() {
        return this.cdAlgoTariffario;
    }

    public void setCdAlgoTariffario(String cdAlgoTariffario) {
        this.cdAlgoTariffario = cdAlgoTariffario;
    }

}
