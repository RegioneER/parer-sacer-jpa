package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the DEC_USO_MODELLO_XSD_FASC database table.
 *
 */
@Entity
@Table(name = "DEC_USO_MODELLO_XSD_FASC")
@NamedQuery(name = "DecUsoModelloXsdFasc.findAll", query = "SELECT d FROM DecUsoModelloXsdFasc d")
public class DecUsoModelloXsdFasc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idUsoModelloXsdFasc;
    private String flStandard;
    private DecAaTipoFascicolo decAaTipoFascicolo;
    private DecModelloXsdFascicolo decModelloXsdFascicolo;
    private Date dtIstituz;
    private Date dtSoppres;
    private List<FasValoreAttribFascicolo> fasValoreAttribFascicolos;

    public DecUsoModelloXsdFasc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_USO_MODELLO_XSD_FASC_IDUSOMODELLOXSDFASC_GENERATOR", sequenceName = "SDEC_USO_MODELLO_XSD_FASC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_USO_MODELLO_XSD_FASC_IDUSOMODELLOXSDFASC_GENERATOR")
    @Column(name = "ID_USO_MODELLO_XSD_FASC")
    public long getIdUsoModelloXsdFasc() {
        return this.idUsoModelloXsdFasc;
    }

    public void setIdUsoModelloXsdFasc(long idUsoModelloXsdFasc) {
        this.idUsoModelloXsdFasc = idUsoModelloXsdFasc;
    }

    @Column(name = "FL_STANDARD")
    public String getFlStandard() {
        return this.flStandard;
    }

    public void setFlStandard(String flStandard) {
        this.flStandard = flStandard;
    }

    // bi-directional many-to-one association to DecAaTipoFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AA_TIPO_FASCICOLO")
    public DecAaTipoFascicolo getDecAaTipoFascicolo() {
        return this.decAaTipoFascicolo;
    }

    public void setDecAaTipoFascicolo(DecAaTipoFascicolo decAaTipoFascicolo) {
        this.decAaTipoFascicolo = decAaTipoFascicolo;
    }

    // bi-directional many-to-one association to DecModelloXsdFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODELLO_XSD_FASCICOLO")
    public DecModelloXsdFascicolo getDecModelloXsdFascicolo() {
        return this.decModelloXsdFascicolo;
    }

    public void setDecModelloXsdFascicolo(DecModelloXsdFascicolo decModelloXsdFascicolo) {
        this.decModelloXsdFascicolo = decModelloXsdFascicolo;
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

    // bi-directional one-to-many association to FasValoreAttribFascicolo
    @OneToMany(mappedBy = "decUsoModelloXsdFasc", cascade = CascadeType.REMOVE)
    public List<FasValoreAttribFascicolo> getFasValoreAttribFascicolos() {
        return this.fasValoreAttribFascicolos;
    }

    public void setFasValoreAttribFascicolos(List<FasValoreAttribFascicolo> fasValoreAttribFascicolos) {
        this.fasValoreAttribFascicolos = fasValoreAttribFascicolos;
    }

    public FasValoreAttribFascicolo addFasValoreAttribFascicolo(FasValoreAttribFascicolo fasValoreAttribFascicolo) {
        getFasValoreAttribFascicolos().add(fasValoreAttribFascicolo);
        fasValoreAttribFascicolo.setDecUsoModelloXsdFasc(this);

        return fasValoreAttribFascicolo;
    }

    public FasValoreAttribFascicolo removeFasValoreAttribFascicolo(FasValoreAttribFascicolo fasValoreAttribFascicolo) {
        getFasValoreAttribFascicolos().remove(fasValoreAttribFascicolo);
        fasValoreAttribFascicolo.setDecUsoModelloXsdFasc(null);

        return fasValoreAttribFascicolo;
    }
}
