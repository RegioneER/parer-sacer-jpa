package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;

/**
 * The persistent class for the DEC_TI_EVE_STATO_ELENCO_VERS database table.
 *
 */
@Entity
@Table(name = "DEC_TI_EVE_STATO_ELENCO_VERS")
@NamedQuery(name = "DecTiEveStatoElencoVers.findAll", query = "SELECT d FROM DecTiEveStatoElencoVers d")
public class DecTiEveStatoElencoVers implements Serializable {

    private static final long serialVersionUID = 1L;

    private long idTiEveStatoElencoVers;
    private String cdTiEveStatoElencoVers;
    private String dsTiEveStatoElencoVers;

    public DecTiEveStatoElencoVers() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TI_EVE_STATO_ELENCO_VERS_IDTIEVESTATOELENCOVERS_GENERATOR", sequenceName = "SDEC_TI_EVE_STATO_ELENCO_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TI_EVE_STATO_ELENCO_VERS_IDTIEVESTATOELENCOVERS_GENERATOR")
    @Column(name = "ID_TI_EVE_STATO_ELENCO_VERS")
    @XmlID
    public long getIdTiEveStatoElencoVers() {
        return this.idTiEveStatoElencoVers;
    }

    public void setIdTiEveStatoElencoVers(long idTiEveStatoElencoVers) {
        this.idTiEveStatoElencoVers = idTiEveStatoElencoVers;
    }

    @Column(name = "CD_TI_EVE_STATO_ELENCO_VERS")
    public String getCdTiEveStatoElencoVers() {
        return this.cdTiEveStatoElencoVers;
    }

    public void setCdTiEveStatoElencoVers(String cdTiEveStatoElencoVers) {
        this.cdTiEveStatoElencoVers = cdTiEveStatoElencoVers;
    }

    @Column(name = "DS_TI_EVE_STATO_ELENCO_VERS")
    public String getDsTiEveStatoElencoVers() {
        return this.dsTiEveStatoElencoVers;
    }

    public void setDsTiEveStatoElencoVers(String dsTiEveStatoElencoVers) {
        this.dsTiEveStatoElencoVers = dsTiEveStatoElencoVers;
    }

}
