package it.eng.parer.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_VERS_INI_DOC database table.
 */
@Entity
@Table(name = "ARO_VERS_INI_DOC")
@NamedQuery(name = "AroVersIniDoc.findAll", query = "SELECT a FROM AroVersIniDoc a")
public class AroVersIniDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idVersIniDoc;

    private String dlDoc;

    private String dsAutoreDoc;

    private AroDoc aroDoc;

    private AroVersIniUnitaDoc aroVersIniUnitaDoc;

    private List<AroVersIniComp> aroVersIniComps = new ArrayList<>();

    private List<AroVersIniDatiSpec> aroVersIniDatiSpecs = new ArrayList<>();

    public AroVersIniDoc() {/* Hibernate */
    }

    @Id
    // "ARO_VERS_INI_DOC_IDVERSINIDOC_GENERATOR",
    // sequenceName = "SARO_VERS_INI_DOC",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_VERS_INI_DOC_IDVERSINIDOC_GENERATOR")
    @Column(name = "ID_VERS_INI_DOC")
    @GenericGenerator(name = "SARO_VERS_INI_DOC_ID_VERS_INI_DOC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_VERS_INI_DOC"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_VERS_INI_DOC_ID_VERS_INI_DOC_GENERATOR")
    public Long getIdVersIniDoc() {
        return this.idVersIniDoc;
    }

    public void setIdVersIniDoc(Long idVersIniDoc) {
        this.idVersIniDoc = idVersIniDoc;
    }

    @Column(name = "DL_DOC")
    public String getDlDoc() {
        return this.dlDoc;
    }

    public void setDlDoc(String dlDoc) {
        this.dlDoc = dlDoc;
    }

    @Column(name = "DS_AUTORE_DOC")
    public String getDsAutoreDoc() {
        return this.dsAutoreDoc;
    }

    public void setDsAutoreDoc(String dsAutoreDoc) {
        this.dsAutoreDoc = dsAutoreDoc;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOC")
    public AroDoc getAroDoc() {
        return this.aroDoc;
    }

    public void setAroDoc(AroDoc aroDoc) {
        this.aroDoc = aroDoc;
    }

    // bi-directional many-to-one association to AroVersIniUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERS_INI_UNITA_DOC")
    public AroVersIniUnitaDoc getAroVersIniUnitaDoc() {
        return this.aroVersIniUnitaDoc;
    }

    public void setAroVersIniUnitaDoc(AroVersIniUnitaDoc aroVersIniUnitaDoc) {
        this.aroVersIniUnitaDoc = aroVersIniUnitaDoc;
    }

    // bi-directional many-to-one association to AroVersIniComp
    @OneToMany(mappedBy = "aroVersIniDoc")
    public List<AroVersIniComp> getAroVersIniComps() {
        return this.aroVersIniComps;
    }

    public void setAroVersIniComps(List<AroVersIniComp> aroVersIniComps) {
        this.aroVersIniComps = aroVersIniComps;
    }

    // bi-directional many-to-one association to AroVersIniComp
    @OneToMany(mappedBy = "aroVersIniDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroVersIniDatiSpec> getAroVersIniDatiSpecs() {
        return this.aroVersIniDatiSpecs;
    }

    public void setAroVersIniDatiSpecs(List<AroVersIniDatiSpec> aroVersIniDatiSpecs) {
        this.aroVersIniDatiSpecs = aroVersIniDatiSpecs;
    }

}
