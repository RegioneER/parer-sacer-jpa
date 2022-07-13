package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_V_LIS_MODIF_BY_UD database table.
 *
 */
@Entity
@Table(name = "ELV_V_LIS_MODIF_BY_UD")
@NamedQuery(name = "ElvVLisModifByUd.findAll", query = "SELECT e FROM ElvVLisModifByUd e")
public class ElvVLisModifByUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private String tiModif;
    private BigDecimal idElencoVers;
    private Date dtVers;
    private BigDecimal idUnitaDoc;
    private BigDecimal idModif;
    private String dsUrnModif;
    private String dsUrnRappVers;
    private String dsHashRappVers;
    private String dsAlgoHashRappVers;
    private String cdEncodingHashRappVers;

    public ElvVLisModifByUd() {
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS")
    public Date getDtVers() {
        return this.dtVers;
    }

    public void setDtVers(Date dtVers) {
        this.dtVers = dtVers;
    }

    @Column(name = "TI_MODIF")
    public String getTiModif() {
        return this.tiModif;
    }

    public void setTiModif(String tiModif) {
        this.tiModif = tiModif;
    }

    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    @Column(name = "DS_URN_MODIF")
    public String getDsUrnModif() {
        return this.dsUrnModif;
    }

    public void setDsUrnModif(String dsUrnModif) {
        this.dsUrnModif = dsUrnModif;
    }

    @Column(name = "DS_URN_RAPP_VERS")
    public String getDsUrnRappVers() {
        return this.dsUrnRappVers;
    }

    public void setDsUrnRappVers(String dsUrnRappVers) {
        this.dsUrnRappVers = dsUrnRappVers;
    }

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Id
    @Column(name = "ID_MODIF")
    public BigDecimal getIdModif() {
        return this.idModif;
    }

    public void setIdModif(BigDecimal idModif) {
        this.idModif = idModif;
    }

    @Column(name = "DS_HASH_RAPP_VERS")
    public String getDsHashRappVers() {
        return this.dsHashRappVers;
    }

    public void setDsHashRappVers(String dsHashRappVers) {
        this.dsHashRappVers = dsHashRappVers;
    }

    @Column(name = "DS_ALGO_HASH_RAPP_VERS")
    public String getDsAlgoHashRappVers() {
        return this.dsAlgoHashRappVers;
    }

    public void setDsAlgoHashRappVers(String dsAlgoHashRappVers) {
        this.dsAlgoHashRappVers = dsAlgoHashRappVers;
    }

    @Column(name = "CD_ENCODING_HASH_RAPP_VERS")
    public String getCdEncodingHashRappVers() {
        return this.cdEncodingHashRappVers;
    }

    public void setCdEncodingHashRappVers(String cdEncodingHashRappVers) {
        this.cdEncodingHashRappVers = cdEncodingHashRappVers;
    }
}
