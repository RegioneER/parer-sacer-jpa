package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ARO_UPD_ARCHIV_SEC database table.
 * 
 */
@Entity
@Table(name = "ARO_UPD_ARCHIV_SEC")
@NamedQuery(name = "AroUpdArchivSec.findAll", query = "SELECT a FROM AroUpdArchivSec a")
public class AroUpdArchivSec implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUpdArchivSec;
    private String cdFascic;
    private String cdSottofascic;
    private String dsClassif;
    private String dsOggettoFascic;
    private String dsOggettoSottofascic;
    private AroUpdUnitaDoc aroUpdUnitaDoc;

    public AroUpdArchivSec() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UPD_ARCHIV_SEC_IDUPDARCHIVSEC_GENERATOR", sequenceName = "SARO_UPD_ARCHIV_SEC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UPD_ARCHIV_SEC_IDUPDARCHIVSEC_GENERATOR")
    @Column(name = "ID_UPD_ARCHIV_SEC")
    public long getIdUpdArchivSec() {
        return this.idUpdArchivSec;
    }

    public void setIdUpdArchivSec(long idUpdArchivSec) {
        this.idUpdArchivSec = idUpdArchivSec;
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

    // bi-directional one-to-one association to AroUpdUnitaDoc
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }

}