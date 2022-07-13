package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DEC_TIPO_FASCICOLO database table.
 *
 */
@Entity
@Table(name = "DEC_TIPO_FASCICOLO")
@NamedQueries({ @NamedQuery(name = "DecTipoFascicolo.findAll", query = "SELECT d FROM DecTipoFascicolo d"),
        @NamedQuery(name = "DecTipoFascicolo.findById", query = "SELECT d FROM DecTipoFascicolo d WHERE d.idTipoFascicolo = :idTipoFascicolo") })
public class DecTipoFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idTipoFascicolo;
    private String dsTipoFascicolo;
    private Date dtIstituz;
    private Date dtSoppres;
    private String nmTipoFascicolo;
    private List<DecAaTipoFascicolo> decAaTipoFascicolos;
    private OrgStrut orgStrut;
    private List<FasFascicolo> fasFascicolos;
    private List<DecSelCriterioRaggrFasc> decSelCriterioRaggrFascicolos;
    private List<DecAttribFascicolo> decAttribFascicolos;

    public DecTipoFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_FASCICOLO_IDTIPOFASCICOLO_GENERATOR", sequenceName = "SDEC_TIPO_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_FASCICOLO_IDTIPOFASCICOLO_GENERATOR")
    @Column(name = "ID_TIPO_FASCICOLO")
    public long getIdTipoFascicolo() {
        return this.idTipoFascicolo;
    }

    public void setIdTipoFascicolo(long idTipoFascicolo) {
        this.idTipoFascicolo = idTipoFascicolo;
    }

    @Column(name = "DS_TIPO_FASCICOLO")
    public String getDsTipoFascicolo() {
        return this.dsTipoFascicolo;
    }

    public void setDsTipoFascicolo(String dsTipoFascicolo) {
        this.dsTipoFascicolo = dsTipoFascicolo;
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

    @Column(name = "NM_TIPO_FASCICOLO")
    public String getNmTipoFascicolo() {
        return this.nmTipoFascicolo;
    }

    public void setNmTipoFascicolo(String nmTipoFascicolo) {
        this.nmTipoFascicolo = nmTipoFascicolo;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlTransient
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to DecAaTipoFascicolo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "decTipoFascicolo", fetch = FetchType.LAZY)
    public List<DecAaTipoFascicolo> getDecAaTipoFascicolos() {
        return this.decAaTipoFascicolos;
    }

    public void setDecAaTipoFascicolos(List<DecAaTipoFascicolo> decAaTipoFascicolos) {
        this.decAaTipoFascicolos = decAaTipoFascicolos;
    }

    // bi-directional many-to-one association to FasFascicolo
    @OneToMany(mappedBy = "decTipoFascicolo")
    @XmlTransient
    public List<FasFascicolo> getFasFascicolos() {
        return this.fasFascicolos;
    }

    public void setFasFascicolos(List<FasFascicolo> fasFascicolos) {
        this.fasFascicolos = fasFascicolos;
    }

    // bi-directional many-to-one association to DecSelCriterioRaggrFasc
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "decTipoFascicolo", fetch = FetchType.LAZY)
    public List<DecSelCriterioRaggrFasc> getDecSelCriterioRaggrFascicolos() {
        return this.decSelCriterioRaggrFascicolos;
    }

    public void setDecSelCriterioRaggrFascicolos(List<DecSelCriterioRaggrFasc> decSelCriterioRaggrFascicolos) {
        this.decSelCriterioRaggrFascicolos = decSelCriterioRaggrFascicolos;
    }

    // bi-directional one-to-many association to DecAttribFascicolo
    @OneToMany(mappedBy = "decTipoFascicolo")
    @XmlTransient
    public List<DecAttribFascicolo> getDecAttribFascicolos() {
        return this.decAttribFascicolos;
    }

    public void setDecAttribFascicolos(List<DecAttribFascicolo> decAttribFascicolos) {
        this.decAttribFascicolos = decAttribFascicolos;
    }

    public DecAttribFascicolo addAplValoreParamApplic(DecAttribFascicolo decAttribFascicolo) {
        getDecAttribFascicolos().add(decAttribFascicolo);
        decAttribFascicolo.setDecTipoFascicolo(this);

        return decAttribFascicolo;
    }

    public DecAttribFascicolo removeAplValoreParamApplic(DecAttribFascicolo decAttribFascicolo) {
        getDecAttribFascicolos().remove(decAttribFascicolo);
        decAttribFascicolo.setDecTipoFascicolo(null);

        return decAttribFascicolo;
    }

}
