package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the VRS_SESSIONE_VERS_SOSP database table.
 * 
 */
@Entity
@Table(name = "VRS_SESSIONE_VERS_SOSP")
public class VrsSessioneVersSosp implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idSessioneVersSosp;
    private BigDecimal idStrut;
    private VrsSessioneVers vrsSessioneVers;

    public VrsSessioneVersSosp() {
    }

    @Id
    @SequenceGenerator(name = "VRS_SESSIONE_VERS_SOSP_IDSESSIONEVERSSOSP_GENERATOR", sequenceName = "SVRS_SESSIONE_VERS_SOSP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_SESSIONE_VERS_SOSP_IDSESSIONEVERSSOSP_GENERATOR")
    @Column(name = "ID_SESSIONE_VERS_SOSP")
    public long getIdSessioneVersSosp() {
        return this.idSessioneVersSosp;
    }

    public void setIdSessioneVersSosp(long idSessioneVersSosp) {
        this.idSessioneVersSosp = idSessioneVersSosp;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to VrsSessioneVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SESSIONE_VERS")
    public VrsSessioneVers getVrsSessioneVers() {
        return this.vrsSessioneVers;
    }

    public void setVrsSessioneVers(VrsSessioneVers vrsSessioneVers) {
        this.vrsSessioneVers = vrsSessioneVers;
    }

}