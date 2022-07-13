package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_FORMATO_FILE_STANDARD database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_FORMATO_FILE_STANDARD")
public class DecFormatoFileStandard implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idFormatoFileStandard;
    private String cdVersione;
    private String dsCopyright;
    private String dsFormatoFileStandard;
    private String flFormatoConcat;
    private String nmFormatoFileStandard;
    private String nmMimetypeFile;
    private String tiEsitoContrFormato;
    private List<AroCompDoc> aroCompDocs;
    private List<DecEstensioneFile> decEstensioneFiles;
    private List<DecFormatoFileBusta> decFormatoFileBustas;
    private List<DecUsoFormatoFileStandard> decUsoFormatoFileStandards;
    private List<AroBustaCrittog> aroBustaCrittogs;
    private List<DecTipoRapprComp> decTipoRapprComps;
    private List<DecFormatoValutazione> decFormatoValutaziones;

    public DecFormatoFileStandard() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FORMATO_FILE_STANDARD_IDFORMATOFILESTANDARD_GENERATOR", sequenceName = "SDEC_FORMATO_FILE_STANDARD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FORMATO_FILE_STANDARD_IDFORMATOFILESTANDARD_GENERATOR")
    @Column(name = "ID_FORMATO_FILE_STANDARD")

    public long getIdFormatoFileStandard() {
        return this.idFormatoFileStandard;
    }

    public void setIdFormatoFileStandard(long idFormatoFileStandard) {
        this.idFormatoFileStandard = idFormatoFileStandard;
    }

    @Column(name = "CD_VERSIONE")
    public String getCdVersione() {
        return this.cdVersione;
    }

    public void setCdVersione(String cdVersione) {
        this.cdVersione = cdVersione;
    }

    @Column(name = "DS_COPYRIGHT")
    public String getDsCopyright() {
        return this.dsCopyright;
    }

    public void setDsCopyright(String dsCopyright) {
        this.dsCopyright = dsCopyright;
    }

    @Column(name = "DS_FORMATO_FILE_STANDARD")
    public String getDsFormatoFileStandard() {
        return this.dsFormatoFileStandard;
    }

    public void setDsFormatoFileStandard(String dsFormatoFileStandard) {
        this.dsFormatoFileStandard = dsFormatoFileStandard;
    }

    @Column(name = "FL_FORMATO_CONCAT")
    public String getFlFormatoConcat() {
        return this.flFormatoConcat;
    }

    public void setFlFormatoConcat(String flFormatoConcat) {
        this.flFormatoConcat = flFormatoConcat;
    }

    @Column(name = "NM_FORMATO_FILE_STANDARD")
    public String getNmFormatoFileStandard() {
        return this.nmFormatoFileStandard;
    }

    public void setNmFormatoFileStandard(String nmFormatoFileStandard) {
        this.nmFormatoFileStandard = nmFormatoFileStandard;
    }

    @Column(name = "NM_MIMETYPE_FILE")
    public String getNmMimetypeFile() {
        return this.nmMimetypeFile;
    }

    public void setNmMimetypeFile(String nmMimetypeFile) {
        this.nmMimetypeFile = nmMimetypeFile;
    }

    @Column(name = "TI_ESITO_CONTR_FORMATO")
    public String getTiEsitoContrFormato() {
        return this.tiEsitoContrFormato;
    }

    public void setTiEsitoContrFormato(String tiEsitoContrFormato) {
        this.tiEsitoContrFormato = tiEsitoContrFormato;
    }

    // bi-directional many-to-one association to AroCompDoc
    @OneToMany(mappedBy = "decFormatoFileStandard")
    @XmlTransient
    public List<AroCompDoc> getAroCompDocs() {
        return this.aroCompDocs;
    }

    public void setAroCompDocs(List<AroCompDoc> aroCompDocs) {
        this.aroCompDocs = aroCompDocs;
    }

    // bi-directional many-to-one association to DecEstensioneFile
    @OneToMany(mappedBy = "decFormatoFileStandard")
    public List<DecEstensioneFile> getDecEstensioneFiles() {
        return this.decEstensioneFiles;
    }

    public void setDecEstensioneFiles(List<DecEstensioneFile> decEstensioneFiles) {
        this.decEstensioneFiles = decEstensioneFiles;
    }

    // bi-directional many-to-one association to DecFormatoFileBusta
    @OneToMany(mappedBy = "decFormatoFileStandard")
    public List<DecFormatoFileBusta> getDecFormatoFileBustas() {
        return this.decFormatoFileBustas;
    }

    public void setDecFormatoFileBustas(List<DecFormatoFileBusta> decFormatoFileBustas) {
        this.decFormatoFileBustas = decFormatoFileBustas;
    }

    // bi-directional many-to-one association to DecUsoFormatoFileStandard
    @OneToMany(mappedBy = "decFormatoFileStandard", cascade = { CascadeType.ALL })
    @XmlInverseReference(mappedBy = "decFormatoFileStandard")
    public List<DecUsoFormatoFileStandard> getDecUsoFormatoFileStandards() {
        return this.decUsoFormatoFileStandards;
    }

    public void setDecUsoFormatoFileStandards(List<DecUsoFormatoFileStandard> decUsoFormatoFileStandards) {
        this.decUsoFormatoFileStandards = decUsoFormatoFileStandards;
    }

    // bi-directional many-to-one association to AroBustaCrittog
    @OneToMany(mappedBy = "decFormatoFileStandard")
    @XmlTransient
    public List<AroBustaCrittog> getAroBustaCrittogs() {
        return this.aroBustaCrittogs;
    }

    public void setAroBustaCrittogs(List<AroBustaCrittog> aroBustaCrittogs) {
        this.aroBustaCrittogs = aroBustaCrittogs;
    }

    // bi-directional many-to-one association to DecTipoRapprComp
    @OneToMany(mappedBy = "decFormatoFileStandard", cascade = CascadeType.PERSIST)
    @XmlIDREF
    public List<DecTipoRapprComp> getDecTipoRapprComps() {
        return this.decTipoRapprComps;
    }

    public void setDecTipoRapprComps(List<DecTipoRapprComp> decTipoRapprComps) {
        this.decTipoRapprComps = decTipoRapprComps;
    }

    @OneToMany(mappedBy = "decFormatoFileStandard")
    @XmlInverseReference(mappedBy = "decFormatoFileStandard")
    public List<DecFormatoValutazione> getDecFormatoValutaziones() {
        return decFormatoValutaziones;
    }

    public void setDecFormatoValutaziones(List<DecFormatoValutazione> decFormatoValutaziones) {
        this.decFormatoValutaziones = decFormatoValutaziones;
    }

}
