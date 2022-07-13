package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the VOL_V_CNT_UD_DOC_COMP_TIPO_UD database table.
 * 
 */
@Entity
@Table(name = "VOL_V_CNT_UD_DOC_COMP_TIPO_UD")
public class VolVCntUdDocCompTipoUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idVolumeConserv;
    private BigDecimal niComp;
    private BigDecimal niDoc;
    private BigDecimal niUd;
    private String nmTipoUnitaDoc;

    public VolVCntUdDocCompTipoUd() {
    }

    @Column(name = "ID_VOLUME_CONSERV")
    public BigDecimal getIdVolumeConserv() {
        return this.idVolumeConserv;
    }

    public void setIdVolumeConserv(BigDecimal idVolumeConserv) {
        this.idVolumeConserv = idVolumeConserv;
    }

    @Column(name = "NI_COMP")
    public BigDecimal getNiComp() {
        return this.niComp;
    }

    public void setNiComp(BigDecimal niComp) {
        this.niComp = niComp;
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }

    @Id
    @Column(name = "NM_TIPO_UNITA_DOC")
    public String getNmTipoUnitaDoc() {
        return this.nmTipoUnitaDoc;
    }

    public void setNmTipoUnitaDoc(String nmTipoUnitaDoc) {
        this.nmTipoUnitaDoc = nmTipoUnitaDoc;
    }

}