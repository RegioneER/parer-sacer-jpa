package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_FILE_VER_INDICE_AIP_UD database table.
 *
 */
@Entity
@Table(name = "ARO_FILE_VER_INDICE_AIP_UD")
public class AroFileVerIndiceAipUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idFileVerIndiceAip;
    private String blFileVerIndiceAip;
    private BigDecimal idStrut;
    private BigDecimal mmCreazione;
    private AroVerIndiceAipUd aroVerIndiceAipUd;

    public AroFileVerIndiceAipUd() {
    }

    @Id
    @SequenceGenerator(name = "ARO_FILE_VER_INDICE_AIP_UD_IDFILEVERINDICEAIP_GENERATOR", sequenceName = "SARO_FILE_VER_INDICE_AIP_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_FILE_VER_INDICE_AIP_UD_IDFILEVERINDICEAIP_GENERATOR")
    @Column(name = "ID_FILE_VER_INDICE_AIP")
    public long getIdFileVerIndiceAip() {
        return this.idFileVerIndiceAip;
    }

    public void setIdFileVerIndiceAip(long idFileVerIndiceAip) {
        this.idFileVerIndiceAip = idFileVerIndiceAip;
    }

    @Lob()
    @Column(name = "BL_FILE_VER_INDICE_AIP")
    public String getBlFileVerIndiceAip() {
        return this.blFileVerIndiceAip;
    }

    public void setBlFileVerIndiceAip(String blFileVerIndiceAip) {
        this.blFileVerIndiceAip = blFileVerIndiceAip;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "MM_CREAZIONE")
    public BigDecimal getMmCreazione() {
        return this.mmCreazione;
    }

    public void setMmCreazione(BigDecimal mmCreazione) {
        this.mmCreazione = mmCreazione;
    }

    // bi-directional many-to-one association to AroVerIndiceAipUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VER_INDICE_AIP")
    public AroVerIndiceAipUd getAroVerIndiceAipUd() {
        return this.aroVerIndiceAipUd;
    }

    public void setAroVerIndiceAipUd(AroVerIndiceAipUd aroVerIndiceAipUd) {
        this.aroVerIndiceAipUd = aroVerIndiceAipUd;
    }

}
