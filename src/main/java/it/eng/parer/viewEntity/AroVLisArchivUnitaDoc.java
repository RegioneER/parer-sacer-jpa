package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_V_LIS_ARCHIV_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_V_LIS_ARCHIV_UNITA_DOC")
public class AroVLisArchivUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cdFascic;
    private String cdSottofascic;
    private String dsClassif;
    private String dsOggettoFascic;
    private String dsOggettoSottofascic;
    private BigDecimal idArchivSec;
    private BigDecimal idUnitaDoc;

    public AroVLisArchivUnitaDoc() {
    }

    @Column(name = "CD_FASCIC")
    public String getCdFascic() {
        return this.cdFascic;
    }

    public void setCdFascic(String cdFascic) {
        this.cdFascic = cdFascic;
    }

    @Column(name = "CD_SOTTOFASCIC")
    public String getCdSottofascic() {
        return this.cdSottofascic;
    }

    public void setCdSottofascic(String cdSottofascic) {
        this.cdSottofascic = cdSottofascic;
    }

    @Column(name = "DS_CLASSIF")
    public String getDsClassif() {
        return this.dsClassif;
    }

    public void setDsClassif(String dsClassif) {
        this.dsClassif = dsClassif;
    }

    @Column(name = "DS_OGGETTO_FASCIC")
    public String getDsOggettoFascic() {
        return this.dsOggettoFascic;
    }

    public void setDsOggettoFascic(String dsOggettoFascic) {
        this.dsOggettoFascic = dsOggettoFascic;
    }

    @Column(name = "DS_OGGETTO_SOTTOFASCIC")
    public String getDsOggettoSottofascic() {
        return this.dsOggettoSottofascic;
    }

    public void setDsOggettoSottofascic(String dsOggettoSottofascic) {
        this.dsOggettoSottofascic = dsOggettoSottofascic;
    }

    @Id
    @Column(name = "ID_ARCHIV_SEC")
    public BigDecimal getIdArchivSec() {
        return this.idArchivSec;
    }

    public void setIdArchivSec(BigDecimal idArchivSec) {
        this.idArchivSec = idArchivSec;
    }

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

}