package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.ElvUrnFileElencoVers.TiUrnFileElenco;

/**
 * The persistent class for the ELV_URN_FILE_ELENCO_VERS database table.
 * 
 */
@Entity
@Table(name = "ELV_URN_FILE_ELENCO_VERS")
@NamedQuery(name = "ElvUrnFileElencoVers.findAll", query = "SELECT s FROM ElvUrnFileElencoVers s")
public class ElvUrnFileElencoVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUrnFileElencoVers;
    private String dsUrn;
    private TiUrnFileElenco tiUrn;
    private ElvFileElencoVer elvFileElencoVers;

    public ElvUrnFileElencoVers() {
    }

    @Id
    @SequenceGenerator(name = "ELV_URN_FILE_ELENCO_VERS_IDURNFILEELENCOVERS_GENERATOR", sequenceName = "SELV_URN_FILE_ELENCO_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_URN_FILE_ELENCO_VERS_IDURNFILEELENCOVERS_GENERATOR")
    @Column(name = "ID_URN_FILE_ELENCO_VERS")
    public long getIdUrnFileElencoVers() {
        return this.idUrnFileElencoVers;
    }

    public void setIdUrnFileElencoVers(long idUrnFileElencoVers) {
        this.idUrnFileElencoVers = idUrnFileElencoVers;
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
    public TiUrnFileElenco getTiUrn() {
        return this.tiUrn;
    }

    public void setTiUrn(TiUrnFileElenco tiUrn) {
        this.tiUrn = tiUrn;
    }

    // bi-directional many-to-one association to ElvFileElencoVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILE_ELENCO_VERS")
    public ElvFileElencoVer getElvFileElencoVers() {
        return this.elvFileElencoVers;
    }

    public void setElvFileElencoVers(ElvFileElencoVer elvFileElencoVers) {
        this.elvFileElencoVers = elvFileElencoVers;
    }

}