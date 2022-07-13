package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_ESTENSIONE_FILE database table.
 * 
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_ESTENSIONE_FILE")
public class DecEstensioneFile implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idEstensioneFile;
    private String cdEstensioneFile;
    private DecFormatoFileStandard decFormatoFileStandard;

    public DecEstensioneFile() {
    }

    @Id
    @SequenceGenerator(name = "DEC_ESTENSIONE_FILE_IDESTENSIONEFILE_GENERATOR", sequenceName = "SDEC_ESTENSIONE_FILE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_ESTENSIONE_FILE_IDESTENSIONEFILE_GENERATOR")
    @Column(name = "ID_ESTENSIONE_FILE")

    public long getIdEstensioneFile() {
        return this.idEstensioneFile;
    }

    public void setIdEstensioneFile(long idEstensioneFile) {
        this.idEstensioneFile = idEstensioneFile;
    }

    @Column(name = "CD_ESTENSIONE_FILE")
    public String getCdEstensioneFile() {
        return this.cdEstensioneFile;
    }

    public void setCdEstensioneFile(String cdEstensioneFile) {
        this.cdEstensioneFile = cdEstensioneFile;
    }

    // bi-directional many-to-one association to DecFormatoFileStandard
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_FILE_STANDARD")
    @XmlInverseReference(mappedBy = "decEstensioneFiles")
    public DecFormatoFileStandard getDecFormatoFileStandard() {
        return this.decFormatoFileStandard;
    }

    public void setDecFormatoFileStandard(DecFormatoFileStandard decFormatoFileStandard) {
        this.decFormatoFileStandard = decFormatoFileStandard;
    }

}