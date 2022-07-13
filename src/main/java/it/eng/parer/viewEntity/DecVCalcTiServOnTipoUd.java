package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_V_CALC_TI_SERV_ON_TIPO_UD database table.
 *
 */
@Entity
@Table(name = "DEC_V_CALC_TI_SERV_ON_TIPO_UD")
@NamedQuery(name = "DecVCalcTiServOnTipoUd.findAll", query = "SELECT d FROM DecVCalcTiServOnTipoUd d")
public class DecVCalcTiServOnTipoUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idCategTipoUnitaDoc;
    private BigDecimal idStrut;
    private BigDecimal idTipoServizioAttiv;
    private BigDecimal idTipoServizioConserv;
    private String cdAlgoTariffario;

    public DecVCalcTiServOnTipoUd() {
    }

    @Id
    @Column(name = "ID_CATEG_TIPO_UNITA_DOC")
    public BigDecimal getIdCategTipoUnitaDoc() {
        return this.idCategTipoUnitaDoc;
    }

    public void setIdCategTipoUnitaDoc(BigDecimal idCategTipoUnitaDoc) {
        this.idCategTipoUnitaDoc = idCategTipoUnitaDoc;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
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
