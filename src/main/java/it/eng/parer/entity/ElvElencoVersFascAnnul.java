package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ELV_ELENCO_VERS_FASC_ANNUL database table.
 *
 */
@Entity
@Table(name = "ELV_ELENCO_VERS_FASC_ANNUL")
@NamedQuery(name = "ElvElencoVersFascAnnul.findAll", query = "SELECT e FROM ElvElencoVersFascAnnul e")
public class ElvElencoVersFascAnnul implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idElencoVersFascAnnul;
    private String dsUrnFascicoloAnnul;
    private FasFascicolo fasFascicolo;
    private ElvElencoVersFasc elvElencoVersFasc;

    public ElvElencoVersFascAnnul() {
    }

    @Id
    @SequenceGenerator(name = "ELV_ELENCO_VERS_FASC_ANNUL_IDELENCOVERSFASCANNUL_GENERATOR", sequenceName = "SELV_ELENCO_VERS_FASC_ANNUL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_ELENCO_VERS_FASC_ANNUL_IDELENCOVERSFASCANNUL_GENERATOR")
    @Column(name = "ID_ELENCO_VERS_FASC_ANNUL")
    public long getIdElencoVersFascAnnul() {
        return this.idElencoVersFascAnnul;
    }

    public void setIdElencoVersFascAnnul(long idElencoVersFascAnnul) {
        this.idElencoVersFascAnnul = idElencoVersFascAnnul;
    }

    @Column(name = "DS_URN_FASCICOLO_ANNUL")
    public String getDsUrnFascicoloAnnul() {
        return this.dsUrnFascicoloAnnul;
    }

    public void setDsUrnFascicoloAnnul(String dsUrnFascicoloAnnul) {
        this.dsUrnFascicoloAnnul = dsUrnFascicoloAnnul;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
    }

    // bi-directional many-to-one association to ElvElencoVersFasc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS_FASC")
    public ElvElencoVersFasc getElvElencoVersFasc() {
        return this.elvElencoVersFasc;
    }

    public void setElvElencoVersFasc(ElvElencoVersFasc elvElencoVerFasc) {
        this.elvElencoVersFasc = elvElencoVerFasc;
    }

}
