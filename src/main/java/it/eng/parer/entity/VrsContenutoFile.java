package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the VRS_CONTENUTO_FILE database table.
 *
 */
@Entity

@Table(name = "VRS_CONTENUTO_FILE")
public class VrsContenutoFile implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idContenutoFile;
    private byte[] blContenutoFileSessione;
    private BigDecimal idStrut;
    private VrsFileSessione vrsFileSessione;

    public VrsContenutoFile() {
    }

    @Id
    @SequenceGenerator(name = "VRS_CONTENUTO_FILE_IDCONTENUTOFILE_GENERATOR", sequenceName = "SVRS_CONTENUTO_FILE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_CONTENUTO_FILE_IDCONTENUTOFILE_GENERATOR")
    @Column(name = "ID_CONTENUTO_FILE")
    public long getIdContenutoFile() {
        return this.idContenutoFile;
    }

    public void setIdContenutoFile(long idContenutoFile) {
        this.idContenutoFile = idContenutoFile;
    }

    @Lob()
    @Column(name = "BL_CONTENUTO_FILE_SESSIONE")
    public byte[] getBlContenutoFileSessione() {
        return this.blContenutoFileSessione;
    }

    public void setBlContenutoFileSessione(byte[] blContenutoFileSessione) {
        this.blContenutoFileSessione = blContenutoFileSessione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to VrsFileSessione
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILE_SESSIONE")
    public VrsFileSessione getVrsFileSessione() {
        return this.vrsFileSessione;
    }

    public void setVrsFileSessione(VrsFileSessione vrsFileSessione) {
        this.vrsFileSessione = vrsFileSessione;
    }

}
