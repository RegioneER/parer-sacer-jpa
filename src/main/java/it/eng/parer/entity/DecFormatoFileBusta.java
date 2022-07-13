package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_FORMATO_FILE_BUSTA database table.
 * 
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_FORMATO_FILE_BUSTA")
public class DecFormatoFileBusta implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFormatoFileBusta;
    private String tiFormatoFirmaMarca;
    private DecFormatoFileStandard decFormatoFileStandard;

    public DecFormatoFileBusta() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FORMATO_FILE_BUSTA_IDFORMATOFILEBUSTA_GENERATOR", sequenceName = "SDEC_FORMATO_FILE_BUSTA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FORMATO_FILE_BUSTA_IDFORMATOFILEBUSTA_GENERATOR")
    @Column(name = "ID_FORMATO_FILE_BUSTA")
    public long getIdFormatoFileBusta() {
        return this.idFormatoFileBusta;
    }

    public void setIdFormatoFileBusta(long idFormatoFileBusta) {
        this.idFormatoFileBusta = idFormatoFileBusta;
    }

    @Column(name = "TI_FORMATO_FIRMA_MARCA")
    public String getTiFormatoFirmaMarca() {
        return this.tiFormatoFirmaMarca;
    }

    public void setTiFormatoFirmaMarca(String tiFormatoFirmaMarca) {
        this.tiFormatoFirmaMarca = tiFormatoFirmaMarca;
    }

    // bi-directional many-to-one association to DecFormatoFileStandard
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_FILE_STANDARD")
    @XmlInverseReference(mappedBy = "decFormatoFileBustas")
    public DecFormatoFileStandard getDecFormatoFileStandard() {
        return this.decFormatoFileStandard;
    }

    public void setDecFormatoFileStandard(DecFormatoFileStandard decFormatoFileStandard) {
        this.decFormatoFileStandard = decFormatoFileStandard;
    }

}