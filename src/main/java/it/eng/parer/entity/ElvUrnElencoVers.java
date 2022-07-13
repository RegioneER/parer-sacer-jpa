package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.ElvUrnElencoVers.TiUrnElenco;

/**
 * The persistent class for the ELV_URN_ELENCO_VERS database table.
 * 
 */
@Entity
@Table(name = "ELV_URN_ELENCO_VERS")
@NamedQuery(name = "ElvUrnElencoVers.findAll", query = "SELECT s FROM ElvUrnElencoVers s")
public class ElvUrnElencoVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUrnElencoVers;
    private String dsUrn;
    private TiUrnElenco tiUrn;
    private ElvElencoVer elvElencoVers;

    public ElvUrnElencoVers() {
    }

    @Id
    @SequenceGenerator(name = "ELV_URN_ELENCO_VERS_IDURNELENCOVERS_GENERATOR", sequenceName = "SELV_URN_ELENCO_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_URN_ELENCO_VERS_IDURNELENCOVERS_GENERATOR")
    @Column(name = "ID_URN_ELENCO_VERS")
    public long getIdUrnElencoVers() {
        return this.idUrnElencoVers;
    }

    public void setIdUrnElencoVers(long idUrnElencoVers) {
        this.idUrnElencoVers = idUrnElencoVers;
    }

    @Column(name = "DS_URN")
    public String getDsUrn() {
        return this.dsUrn;
    }

    public void setDsUrn(String dsUrn) {
        this.dsUrn = dsUrn;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_URN")
    public TiUrnElenco getTiUrn() {
        return this.tiUrn;
    }

    public void setTiUrn(TiUrnElenco tiUrn) {
        this.tiUrn = tiUrn;
    }

    // bi-directional many-to-one association to ElvElencoVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS")
    public ElvElencoVer getElvElencoVers() {
        return this.elvElencoVers;
    }

    public void setElvElencoVers(ElvElencoVer elvElencoVers) {
        this.elvElencoVers = elvElencoVers;
    }

}