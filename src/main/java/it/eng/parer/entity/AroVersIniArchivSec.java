package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_VERS_INI_ARCHIV_SEC database table.
 */
@Entity
@Table(name = "ARO_VERS_INI_ARCHIV_SEC")
@NamedQuery(name = "AroVersIniArchivSec.findAll", query = "SELECT a FROM AroVersIniArchivSec a")
public class AroVersIniArchivSec implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idVersIniArchivSec;

    private String cdFascic;

    private String cdSottofascic;

    private String dsClassif;

    private String dsOggettoFascic;

    private String dsOggettoSottofascic;

    private AroVersIniUnitaDoc aroVersIniUnitaDoc;

    public AroVersIniArchivSec() {/* Hibernate */
    }

    @Id
    // "ARO_VERS_INI_ARCHIV_SEC_IDVERSINIARCHIVSEC_GENERATOR",
    // sequenceName =
    // "SARO_VERS_INI_ARCHIV_SEC",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ARO_VERS_INI_ARCHIV_SEC_IDVERSINIARCHIVSEC_GENERATOR")
    @Column(name = "ID_VERS_INI_ARCHIV_SEC")
    @GenericGenerator(name = "SARO_VERS_INI_ARCHIV_SEC_ID_VERS_INI_ARCHIV_SEC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_VERS_INI_ARCHIV_SEC"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_VERS_INI_ARCHIV_SEC_ID_VERS_INI_ARCHIV_SEC_GENERATOR")
    public Long getIdVersIniArchivSec() {
        return this.idVersIniArchivSec;
    }

    public void setIdVersIniArchivSec(Long idVersIniArchivSec) {
        this.idVersIniArchivSec = idVersIniArchivSec;
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

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERS_INI_UNITA_DOC")
    public AroVersIniUnitaDoc getAroVersIniUnitaDoc() {
        return this.aroVersIniUnitaDoc;
    }

    public void setAroVersIniUnitaDoc(AroVersIniUnitaDoc aroVersIniUnitaDoc) {
        this.aroVersIniUnitaDoc = aroVersIniUnitaDoc;
    }

}
