package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the ARO_BUSTA_CRITTOG database table.
 * 
 */
@Entity
@Table(name = "ARO_BUSTA_CRITTOG")
public class AroBustaCrittog implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idBustaCrittog;
    private BigDecimal idStrut;
    private BigDecimal pgBustaCrittog;
    private AroCompDoc aroCompDoc;
    private DecFormatoFileStandard decFormatoFileStandard;
    private List<AroFirmaComp> aroFirmaComps;
    private List<AroMarcaComp> aroMarcaComps;

    public AroBustaCrittog() {
    }

    @Id
    @SequenceGenerator(name = "ARO_BUSTA_CRITTOG_IDBUSTACRITTOG_GENERATOR", sequenceName = "SARO_BUSTA_CRITTOG", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_BUSTA_CRITTOG_IDBUSTACRITTOG_GENERATOR")
    @Column(name = "ID_BUSTA_CRITTOG")
    public long getIdBustaCrittog() {
        return this.idBustaCrittog;
    }

    public void setIdBustaCrittog(long idBustaCrittog) {
        this.idBustaCrittog = idBustaCrittog;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "PG_BUSTA_CRITTOG")
    public BigDecimal getPgBustaCrittog() {
        return this.pgBustaCrittog;
    }

    public void setPgBustaCrittog(BigDecimal pgBustaCrittog) {
        this.pgBustaCrittog = pgBustaCrittog;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

    // bi-directional many-to-one association to DecFormatoFileStandard
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_FILE_CALC")
    public DecFormatoFileStandard getDecFormatoFileStandard() {
        return this.decFormatoFileStandard;
    }

    public void setDecFormatoFileStandard(DecFormatoFileStandard decFormatoFileStandard) {
        this.decFormatoFileStandard = decFormatoFileStandard;
    }

    // bi-directional many-to-one association to AroFirmaComp
    @OneToMany(mappedBy = "aroBustaCrittog")
    public List<AroFirmaComp> getAroFirmaComps() {
        return this.aroFirmaComps;
    }

    public void setAroFirmaComps(List<AroFirmaComp> aroFirmaComps) {
        this.aroFirmaComps = aroFirmaComps;
    }

    // bi-directional many-to-one association to AroMarcaComp
    @OneToMany(mappedBy = "aroBustaCrittog")
    public List<AroMarcaComp> getAroMarcaComps() {
        return this.aroMarcaComps;
    }

    public void setAroMarcaComps(List<AroMarcaComp> aroMarcaComps) {
        this.aroMarcaComps = aroMarcaComps;
    }

}