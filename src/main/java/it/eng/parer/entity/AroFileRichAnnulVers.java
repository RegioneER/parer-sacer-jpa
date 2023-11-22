package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_FILE_RICH_ANNUL_VERS database table.
 */
@Entity
@Table(name = "ARO_FILE_RICH_ANNUL_VERS")
@NamedQuery(name = "AroFileRichAnnulVers.findAll", query = "SELECT a FROM AroFileRichAnnulVers a")
public class AroFileRichAnnulVers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFileRichAnnulVers;

    private String blFile;

    private String tiFile;

    private AroRichAnnulVers aroRichAnnulVers;

    public AroFileRichAnnulVers() {/* Hibernate */
    }

    @Id
    // "ARO_FILE_RICH_ANNUL_VERS_IDFILERICHANNULVERS_GENERATOR",
    // sequenceName =
    // "SARO_FILE_RICH_ANNUL_VERS",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ARO_FILE_RICH_ANNUL_VERS_IDFILERICHANNULVERS_GENERATOR")
    @Column(name = "ID_FILE_RICH_ANNUL_VERS")
    @GenericGenerator(name = "SARO_FILE_RICH_ANNUL_VERS_ID_FILE_RICH_ANNUL_VERS_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_FILE_RICH_ANNUL_VERS"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_FILE_RICH_ANNUL_VERS_ID_FILE_RICH_ANNUL_VERS_GENERATOR")
    public Long getIdFileRichAnnulVers() {
        return this.idFileRichAnnulVers;
    }

    public void setIdFileRichAnnulVers(Long idFileRichAnnulVers) {
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
