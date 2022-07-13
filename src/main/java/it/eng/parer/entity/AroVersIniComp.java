package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * The persistent class for the ARO_VERS_INI_COMP database table.
 * 
 */
@Entity
@Table(name = "ARO_VERS_INI_COMP")
@NamedQuery(name = "AroVersIniComp.findAll", query = "SELECT a FROM AroVersIniComp a")
public class AroVersIniComp implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idVersIniComp;
    private String dlUrnCompVers;
    private String dsIdCompVers;
    private String dsNomeCompVers;
    private AroCompDoc aroCompDoc;
    private AroVersIniDoc aroVersIniDoc;
    private List<AroVersIniDatiSpec> aroVersIniDatiSpecs;

    public AroVersIniComp() {
    }

    @Id
    @SequenceGenerator(name = "ARO_VERS_INI_COMP_IDVERSINICOMP_GENERATOR", sequenceName = "SARO_VERS_INI_COMP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_VERS_INI_COMP_IDVERSINICOMP_GENERATOR")
    @Column(name = "ID_VERS_INI_COMP")
    public long getIdVersIniComp() {
        return this.idVersIniComp;
    }

    public void setIdVersIniComp(long idVersIniComp) {
        this.idVersIniComp = idVersIniComp;
    }

    @Column(name = "DL_URN_COMP_VERS")
    public String getDlUrnCompVers() {
        return this.dlUrnCompVers;
    }

    public void setDlUrnCompVers(String dlUrnCompVers) {
        this.dlUrnCompVers = dlUrnCompVers;
    }

    @Column(name = "DS_ID_COMP_VERS")
    public String getDsIdCompVers() {
        return this.dsIdCompVers;
    }

    public void setDsIdCompVers(String dsIdCompVers) {
        this.dsIdCompVers = dsIdCompVers;
    }

    @Column(name = "DS_NOME_COMP_VERS")
    public String getDsNomeCompVers() {
        return this.dsNomeCompVers;
    }

    public void setDsNomeCompVers(String dsNomeCompVers) {
        this.dsNomeCompVers = dsNomeCompVers;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERS_INI_DOC")
    public AroVersIniDoc getAroVersIniDoc() {
        return this.aroVersIniDoc;
    }

    public void setAroVersIniDoc(AroVersIniDoc aroVersIniDoc) {
        this.aroVersIniDoc = aroVersIniDoc;
    }

    // bi-directional many-to-one association to AroVersIniComp
    @OneToMany(mappedBy = "aroVersIniComp", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroVersIniDatiSpec> getAroVersIniDatiSpecs() {
        return this.aroVersIniDatiSpecs;
    }

    public void setAroVersIniDatiSpecs(List<AroVersIniDatiSpec> aroVersIniDatiSpecs) {
        this.aroVersIniDatiSpecs = aroVersIniDatiSpecs;
    }

}