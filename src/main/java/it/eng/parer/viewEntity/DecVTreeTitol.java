package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the DEC_V_TREE_TITOL database table.
 * 
 */
@Entity
@Table(name = "DEC_V_TREE_TITOL")
@NamedQuery(name = "DecVTreeTitol.findAll", query = "SELECT d FROM DecVTreeTitol d")
public class DecVTreeTitol implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cdCompositoVocePadre;
    private String cdCompositoVoceTitol;
    private String cdVoceTitol;
    private String dlNote;
    private String dsVoceTitol;
    private Date dtFinVal;
    private Date dtIniVal;
    private Date dtIstituz;
    private Date dtSoppres;
    private String flUsoClassif;
    private BigDecimal idLivelloTitol;
    private BigDecimal idTitol;
    private BigDecimal idValVoceTitol;
    private BigDecimal idVoceTitol;
    private BigDecimal idVoceTitolPadre;
    private BigDecimal niAnniConserv;
    private BigDecimal niFascic;
    private BigDecimal niFascicVociFiglie;
    private BigDecimal niLivello;
    private BigDecimal niOrdVoceTitol;
    private String nmLivelloTitol;

    public DecVTreeTitol() {
    }

    @Column(name = "CD_COMPOSITO_VOCE_PADRE")
    public String getCdCompositoVocePadre() {
        return this.cdCompositoVocePadre;
    }

    public void setCdCompositoVocePadre(String cdCompositoVocePadre) {
        this.cdCompositoVocePadre = cdCompositoVocePadre;
    }

    @Column(name = "CD_COMPOSITO_VOCE_TITOL")
    public String getCdCompositoVoceTitol() {
        return this.cdCompositoVoceTitol;
    }

    public void setCdCompositoVoceTitol(String cdCompositoVoceTitol) {
        this.cdCompositoVoceTitol = cdCompositoVoceTitol;
    }

    @Column(name = "CD_VOCE_TITOL")
    public String getCdVoceTitol() {
        return this.cdVoceTitol;
    }

    public void setCdVoceTitol(String cdVoceTitol) {
        this.cdVoceTitol = cdVoceTitol;
    }

    @Column(name = "DL_NOTE")
    public String getDlNote() {
        return this.dlNote;
    }

    public void setDlNote(String dlNote) {
        this.dlNote = dlNote;
    }

    @Column(name = "DS_VOCE_TITOL")
    public String getDsVoceTitol() {
        return this.dsVoceTitol;
    }

    public void setDsVoceTitol(String dsVoceTitol) {
        this.dsVoceTitol = dsVoceTitol;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIN_VAL")
    public Date getDtFinVal() {
        return this.dtFinVal;
    }

    public void setDtFinVal(Date dtFinVal) {
        this.dtFinVal = dtFinVal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL")
    public Date getDtIniVal() {
        return this.dtIniVal;
    }

    public void setDtIniVal(Date dtIniVal) {
        this.dtIniVal = dtIniVal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ISTITUZ")
    public Date getDtIstituz() {
        return this.dtIstituz;
    }

    public void setDtIstituz(Date dtIstituz) {
        this.dtIstituz = dtIstituz;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SOPPRES")
    public Date getDtSoppres() {
        return this.dtSoppres;
    }

    public void setDtSoppres(Date dtSoppres) {
        this.dtSoppres = dtSoppres;
    }

    @Column(name = "FL_USO_CLASSIF")
    public String getFlUsoClassif() {
        return this.flUsoClassif;
    }

    public void setFlUsoClassif(String flUsoClassif) {
        this.flUsoClassif = flUsoClassif;
    }

    @Column(name = "ID_LIVELLO_TITOL")
    public BigDecimal getIdLivelloTitol() {
        return this.idLivelloTitol;
    }

    public void setIdLivelloTitol(BigDecimal idLivelloTitol) {
        this.idLivelloTitol = idLivelloTitol;
    }

    @Column(name = "ID_TITOL")
    public BigDecimal getIdTitol() {
        return this.idTitol;
    }

    public void setIdTitol(BigDecimal idTitol) {
        this.idTitol = idTitol;
    }

    @Id
    @Column(name = "ID_VAL_VOCE_TITOL")
    public BigDecimal getIdValVoceTitol() {
        return this.idValVoceTitol;
    }

    public void setIdValVoceTitol(BigDecimal idValVoceTitol) {
        this.idValVoceTitol = idValVoceTitol;
    }

    @Id
    @Column(name = "ID_VOCE_TITOL")
    public BigDecimal getIdVoceTitol() {
        return this.idVoceTitol;
    }

    public void setIdVoceTitol(BigDecimal idVoceTitol) {
        this.idVoceTitol = idVoceTitol;
    }

    @Column(name = "ID_VOCE_TITOL_PADRE")
    public BigDecimal getIdVoceTitolPadre() {
        return this.idVoceTitolPadre;
    }

    public void setIdVoceTitolPadre(BigDecimal idVoceTitolPadre) {
        this.idVoceTitolPadre = idVoceTitolPadre;
    }

    @Column(name = "NI_ANNI_CONSERV")
    public BigDecimal getNiAnniConserv() {
        return this.niAnniConserv;
    }

    public void setNiAnniConserv(BigDecimal niAnniConserv) {
        this.niAnniConserv = niAnniConserv;
    }

    @Column(name = "NI_FASCIC")
    public BigDecimal getNiFascic() {
        return this.niFascic;
    }

    public void setNiFascic(BigDecimal niFascic) {
        this.niFascic = niFascic;
    }

    @Column(name = "NI_FASCIC_VOCI_FIGLIE")
    public BigDecimal getNiFascicVociFiglie() {
        return this.niFascicVociFiglie;
    }

    public void setNiFascicVociFiglie(BigDecimal niFascicVociFiglie) {
        this.niFascicVociFiglie = niFascicVociFiglie;
    }

    @Column(name = "NI_LIVELLO")
    public BigDecimal getNiLivello() {
        return this.niLivello;
    }

    public void setNiLivello(BigDecimal niLivello) {
        this.niLivello = niLivello;
    }

    @Column(name = "NI_ORD_VOCE_TITOL")
    public BigDecimal getNiOrdVoceTitol() {
        return this.niOrdVoceTitol;
    }

    public void setNiOrdVoceTitol(BigDecimal niOrdVoceTitol) {
        this.niOrdVoceTitol = niOrdVoceTitol;
    }

    @Column(name = "NM_LIVELLO_TITOL")
    public String getNmLivelloTitol() {
        return this.nmLivelloTitol;
    }

    public void setNmLivelloTitol(String nmLivelloTitol) {
        this.nmLivelloTitol = nmLivelloTitol;
    }

}