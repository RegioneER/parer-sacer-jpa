package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlIDREF;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_USO_FORMATO_FILE_STANDARD database table.
 * 
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_USO_FORMATO_FILE_STANDARD")
public class DecUsoFormatoFileStandard implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUsoFormatoFileAmmesso;
    private BigDecimal niOrdUso;
    private DecFormatoFileDoc decFormatoFileDoc;
    private DecFormatoFileStandard decFormatoFileStandard;

    public DecUsoFormatoFileStandard() {
    }

    @Id
    @SequenceGenerator(name = "DEC_USO_FORMATO_FILE_STANDARD_IDUSOFORMATOFILEAMMESSO_GENERATOR", sequenceName = "SDEC_USO_FORMATO_FILE_STANDARD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_USO_FORMATO_FILE_STANDARD_IDUSOFORMATOFILEAMMESSO_GENERATOR")
    @Column(name = "ID_USO_FORMATO_FILE_AMMESSO")
    public long getIdUsoFormatoFileAmmesso() {
        return this.idUsoFormatoFileAmmesso;
    }

    public void setIdUsoFormatoFileAmmesso(long idUsoFormatoFileAmmesso) {
        this.idUsoFormatoFileAmmesso = idUsoFormatoFileAmmesso;
    }

    @Column(name = "NI_ORD_USO")
    public BigDecimal getNiOrdUso() {
        return this.niOrdUso;
    }

    public void setNiOrdUso(BigDecimal niOrdUso) {
        this.niOrdUso = niOrdUso;
    }

    // bi-directional many-to-one association to DecFormatoFileDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_FILE_DOC")
    @XmlInverseReference(mappedBy = "decUsoFormatoFileStandards")
    public DecFormatoFileDoc getDecFormatoFileDoc() {
        return this.decFormatoFileDoc;
    }

    public void setDecFormatoFileDoc(DecFormatoFileDoc decFormatoFileDoc) {
        this.decFormatoFileDoc = decFormatoFileDoc;
    }

    // bi-directional many-to-one association to DecFormatoFileStandard
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_FILE_STANDARD")
    public DecFormatoFileStandard getDecFormatoFileStandard() {
        return this.decFormatoFileStandard;
    }

    public void setDecFormatoFileStandard(DecFormatoFileStandard decFormatoFileStandard) {
        this.decFormatoFileStandard = decFormatoFileStandard;
    }

}