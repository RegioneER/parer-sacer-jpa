package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the DEC_MODELLO_XSD_FASCICOLO database table.
 *
 */
@Entity
@Table(name = "DEC_MODELLO_XSD_FASCICOLO")
@NamedQuery(name = "DecModelloXsdFascicolo.findAll", query = "SELECT d FROM DecModelloXsdFascicolo d")
public class DecModelloXsdFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idModelloXsdFascicolo;
    private String blXsd;
    private String cdXsd;
    private String dsXsd;
    private Date dtIstituz;
    private Date dtSoppres;
    private String flDefault;
    private String tiModelloXsd;
    private String tiUsoModelloXsd;
    private AplSistemaMigraz aplSistemaMigraz;
    private OrgAmbiente orgAmbiente;
    private List<DecUsoModelloXsdFasc> decUsoModelloXsdFascs;
    private List<FasXmlFascicolo> fasXmlFascicolos;
    private List<FasXsdMetaVerAipFasc> fasXsdMetaVerAipFascs;
    private List<DecModelloXsdAttribFascicolo> decModelloXsdAttribFascicolos;

    public DecModelloXsdFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "DEC_MODELLO_XSD_FASCICOLO_IDMODELLOXSDFASCICOLO_GENERATOR", sequenceName = "SDEC_MODELLO_XSD_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_MODELLO_XSD_FASCICOLO_IDMODELLOXSDFASCICOLO_GENERATOR")
    @Column(name = "ID_MODELLO_XSD_FASCICOLO")
    public long getIdModelloXsdFascicolo() {
        return this.idModelloXsdFascicolo;
    }

    public void setIdModelloXsdFascicolo(long idModelloXsdFascicolo) {
        this.idModelloXsdFascicolo = idModelloXsdFascicolo;
    }

    @Lob
    @Column(name = "BL_XSD")
    public String getBlXsd() {
        return this.blXsd;
    }

    public void setBlXsd(String blXsd) {
        this.blXsd = blXsd;
    }

    @Column(name = "CD_XSD")
    public String getCdXsd() {
        return this.cdXsd;
    }

    public void setCdXsd(String cdXsd) {
        this.cdXsd = cdXsd;
    }

    @Column(name = "DS_XSD")
    public String getDsXsd() {
        return this.dsXsd;
    }

    public void setDsXsd(String dsXsd) {
        this.dsXsd = dsXsd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ISTITUZ")
    public Date getDtIstituz() {
        return this.dtIstituz;
    }

    public void setDtIstituz(Date dtIstituz) {
        this.dtIstituz = dtIstituz;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SOPPRES")
    public Date getDtSoppres() {
        return this.dtSoppres;
    }

    public void setDtSoppres(Date dtSoppres) {
        this.dtSoppres = dtSoppres;
    }

    @Column(name = "FL_DEFAULT")
    public String getFlDefault() {
        return this.flDefault;
    }

    public void setFlDefault(String flDefault) {
        this.flDefault = flDefault;
    }

    @Column(name = "TI_MODELLO_XSD")
    public String getTiModelloXsd() {
        return this.tiModelloXsd;
    }

    public void setTiModelloXsd(String tiModelloXsd) {
        this.tiModelloXsd = tiModelloXsd;
    }

    @Column(name = "TI_USO_MODELLO_XSD")
    public String getTiUsoModelloXsd() {
        return this.tiUsoModelloXsd;
    }

    public void setTiUsoModelloXsd(String tiUsoModelloXsd) {
        this.tiUsoModelloXsd = tiUsoModelloXsd;
    }

    // bi-directional many-to-one association to AplSistemaMigraz
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SISTEMA_MIGRAZ")
    public AplSistemaMigraz getAplSistemaMigraz() {
        return this.aplSistemaMigraz;
    }

    public void setAplSistemaMigraz(AplSistemaMigraz aplSistemaMigraz) {
        this.aplSistemaMigraz = aplSistemaMigraz;
    }

    // bi-directional many-to-one association to OrgAmbiente
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AMBIENTE")
    public OrgAmbiente getOrgAmbiente() {
        return this.orgAmbiente;
    }

    public void setOrgAmbiente(OrgAmbiente orgAmbiente) {
        this.orgAmbiente = orgAmbiente;
    }

    // bi-directional many-to-one association to DecUsoModelloXsdFasc
    @OneToMany(mappedBy = "decModelloXsdFascicolo")
    public List<DecUsoModelloXsdFasc> getDecUsoModelloXsdFascs() {
        return this.decUsoModelloXsdFascs;
    }

    public void setDecUsoModelloXsdFascs(List<DecUsoModelloXsdFasc> decUsoModelloXsdFascs) {
        this.decUsoModelloXsdFascs = decUsoModelloXsdFascs;
    }

    public DecUsoModelloXsdFasc addDecUsoModelloXsdFasc(DecUsoModelloXsdFasc decUsoModelloXsdFasc) {
        getDecUsoModelloXsdFascs().add(decUsoModelloXsdFasc);
        decUsoModelloXsdFasc.setDecModelloXsdFascicolo(this);

        return decUsoModelloXsdFasc;
    }

    public DecUsoModelloXsdFasc removeDecUsoModelloXsdFasc(DecUsoModelloXsdFasc decUsoModelloXsdFasc) {
        getDecUsoModelloXsdFascs().remove(decUsoModelloXsdFasc);
        decUsoModelloXsdFasc.setDecModelloXsdFascicolo(null);

        return decUsoModelloXsdFasc;
    }

    // bi-directional many-to-one association to FasXmlFascicolo
    @OneToMany(mappedBy = "decModelloXsdFascicolo")
    public List<FasXmlFascicolo> getFasXmlFascicolos() {
        return fasXmlFascicolos;
    }

    public void setFasXmlFascicolos(List<FasXmlFascicolo> fasXmlFascicolos) {
        this.fasXmlFascicolos = fasXmlFascicolos;
    }

    // bi-directional many-to-one association to FasXsdMetaVerAipFasc
    @OneToMany(mappedBy = "decModelloXsdFascicolo")
    public List<FasXsdMetaVerAipFasc> getFasXsdMetaVerAipFascs() {
        return fasXsdMetaVerAipFascs;
    }

    public void setFasXsdMetaVerAipFascs(List<FasXsdMetaVerAipFasc> fasXsdMetaVerAipFascs) {
        this.fasXsdMetaVerAipFascs = fasXsdMetaVerAipFascs;
    }

    // bi-directional one-to-many association to DecModelloXsdAttribFascicolo
    @OneToMany(mappedBy = "decModelloXsdFascicolo")
    public List<DecModelloXsdAttribFascicolo> getDecModelloXsdAttribFascicolos() {
        return this.decModelloXsdAttribFascicolos;
    }

    public void setDecModelloXsdAttribFascicolos(List<DecModelloXsdAttribFascicolo> decModelloXsdAttribFascicolos) {
        this.decModelloXsdAttribFascicolos = decModelloXsdAttribFascicolos;
    }

    public DecModelloXsdAttribFascicolo addDecModelloXsdAttribFascicolo(
            DecModelloXsdAttribFascicolo decModelloXsdAttribFascicolo) {
        getDecModelloXsdAttribFascicolos().add(decModelloXsdAttribFascicolo);
        decModelloXsdAttribFascicolo.setDecModelloXsdFascicolo(this);

        return decModelloXsdAttribFascicolo;
    }

    public DecModelloXsdAttribFascicolo removeDecModelloXsdAttribFascicolo(
            DecModelloXsdAttribFascicolo decModelloXsdAttribFascicolo) {
        getDecModelloXsdAttribFascicolos().remove(decModelloXsdAttribFascicolo);
        decModelloXsdAttribFascicolo.setDecModelloXsdFascicolo(null);

        return decModelloXsdAttribFascicolo;
    }
}
