package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the VRS_FILE_SESSIONE database table.
 * 
 */
@Entity
@Table(name = "VRS_FILE_SESSIONE")
public class VrsFileSessione implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFileSessione;
    private BigDecimal idStrut;
    private String nmFileSessione;
    private BigDecimal pgFileSessione;
    private String tiStatoFileSessione;
    private List<VrsContenutoFile> vrsContenutoFiles;
    private VrsDatiSessioneVers vrsDatiSessioneVers;

    public VrsFileSessione() {
    }

    @Id
    @SequenceGenerator(name = "VRS_FILE_SESSIONE_IDFILESESSIONE_GENERATOR", sequenceName = "SVRS_FILE_SESSIONE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_FILE_SESSIONE_IDFILESESSIONE_GENERATOR")
    @Column(name = "ID_FILE_SESSIONE")
    public long getIdFileSessione() {
        return this.idFileSessione;
    }

    public void setIdFileSessione(long idFileSessione) {
        this.idFileSessione = idFileSessione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NM_FILE_SESSIONE")
    public String getNmFileSessione() {
        return this.nmFileSessione;
    }

    public void setNmFileSessione(String nmFileSessione) {
        this.nmFileSessione = nmFileSessione;
    }

    @Column(name = "PG_FILE_SESSIONE")
    public BigDecimal getPgFileSessione() {
        return this.pgFileSessione;
    }

    public void setPgFileSessione(BigDecimal pgFileSessione) {
        this.pgFileSessione = pgFileSessione;
    }

    @Column(name = "TI_STATO_FILE_SESSIONE")
    public String getTiStatoFileSessione() {
        return this.tiStatoFileSessione;
    }

    public void setTiStatoFileSessione(String tiStatoFileSessione) {
        this.tiStatoFileSessione = tiStatoFileSessione;
    }

    // bi-directional many-to-one association to VrsContenutoFile
    @OneToMany(mappedBy = "vrsFileSessione")
    public List<VrsContenutoFile> getVrsContenutoFiles() {
        return this.vrsContenutoFiles;
    }

    public void setVrsContenutoFiles(List<VrsContenutoFile> vrsContenutoFiles) {
        this.vrsContenutoFiles = vrsContenutoFiles;
    }

    // bi-directional many-to-one association to VrsDatiSessioneVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATI_SESSIONE_VERS")
    public VrsDatiSessioneVers getVrsDatiSessioneVers() {
        return this.vrsDatiSessioneVers;
    }

    public void setVrsDatiSessioneVers(VrsDatiSessioneVers vrsDatiSessioneVers) {
        this.vrsDatiSessioneVers = vrsDatiSessioneVers;
    }

}