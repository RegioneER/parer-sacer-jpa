package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ARO_FILE_RICH_ANNUL_VERS database table.
 * 
 */
@Entity
@Table(name = "ARO_FILE_RICH_ANNUL_VERS")
@NamedQuery(name = "AroFileRichAnnulVers.findAll", query = "SELECT a FROM AroFileRichAnnulVers a")
public class AroFileRichAnnulVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFileRichAnnulVers;
    private String blFile;
    private String tiFile;
    private AroRichAnnulVers aroRichAnnulVers;

    public AroFileRichAnnulVers() {
    }

    @Id
    @SequenceGenerator(name = "ARO_FILE_RICH_ANNUL_VERS_IDFILERICHANNULVERS_GENERATOR", sequenceName = "SARO_FILE_RICH_ANNUL_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_FILE_RICH_ANNUL_VERS_IDFILERICHANNULVERS_GENERATOR")
    @Column(name = "ID_FILE_RICH_ANNUL_VERS")
    public long getIdFileRichAnnulVers() {
        return this.idFileRichAnnulVers;
    }

    public void setIdFileRichAnnulVers(long idFileRichAnnulVers) {
        this.idFileRichAnnulVers = idFileRichAnnulVers;
    }

    @Lob
    @Column(name = "BL_FILE")
    public String getBlFile() {
        return this.blFile;
    }

    public void setBlFile(String blFile) {
        this.blFile = blFile;
    }

    @Column(name = "TI_FILE")
    public String getTiFile() {
        return this.tiFile;
    }

    public void setTiFile(String tiFile) {
        this.tiFile = tiFile;
    }

    // bi-directional many-to-one association to AroRichAnnulVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RICH_ANNUL_VERS")
    public AroRichAnnulVers getAroRichAnnulVers() {
        return this.aroRichAnnulVers;
    }

    public void setAroRichAnnulVers(AroRichAnnulVers aroRichAnnulVers) {
        this.aroRichAnnulVers = aroRichAnnulVers;
    }

}