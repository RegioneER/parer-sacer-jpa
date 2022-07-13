package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlID;

/**
 * The persistent class for the FAS_VALORE_ATTRIB_FASCICOLO database table.
 *
 */
@Entity
@Table(name = "FAS_VALORE_ATTRIB_FASCICOLO")
public class FasValoreAttribFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idValoreAttribFascicolo;
    private DecUsoModelloXsdFasc decUsoModelloXsdFasc;
    private FasFascicolo fasFascicolo;
    private DecAttribFascicolo decAttribFascicolo;
    private String dlValore;
    private DecAaTipoFascicolo decAaTipoFascicolo;

    public FasValoreAttribFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "DEC_VALORE_ATTRIB_FASCICOLO_IDVALOREATTRIBFASCICOLO_GENERATOR", sequenceName = "SDEC_VALORE_ATTRIB_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_VALORE_ATTRIB_FASCICOLO_IDVALOREATTRIBFASCICOLO_GENERATOR")
    @Column(name = "ID_VALORE_ATTRIB_FASCICOLO")
    @XmlID
    public long getIdValoreAttribFascicolo() {
        return this.idValoreAttribFascicolo;
    }

    public void setIdValoreAttribFascicolo(long idValoreAttribFascicolo) {
        this.idValoreAttribFascicolo = idValoreAttribFascicolo;
    }

    // bi-directional many-to-one association to DecUsoModelloXsdFasc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USO_MODELLO_XSD_FASC")
    public DecUsoModelloXsdFasc getDecUsoModelloXsdFasc() {
        return this.decUsoModelloXsdFasc;
    }

    public void setDecUsoModelloXsdFasc(DecUsoModelloXsdFasc decUsoModelloXsdFasc) {
        this.decUsoModelloXsdFasc = decUsoModelloXsdFasc;
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

    // bi-directional many-to-one association to DecAttribFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ATTRIB_FASCICOLO")
    public DecAttribFascicolo getDecAttribFascicolo() {
        return this.decAttribFascicolo;
    }

    public void setDecAttribFascicolo(DecAttribFascicolo decAttribFascicolo) {
        this.decAttribFascicolo = decAttribFascicolo;
    }

    @Column(name = "DL_VALORE")
    public String getDlValore() {
        return this.dlValore;
    }

    public void setDlValore(String dlValore) {
        this.dlValore = dlValore;
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

}
