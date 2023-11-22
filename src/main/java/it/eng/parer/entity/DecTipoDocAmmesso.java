package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlID;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the DEC_TIPO_DOC_AMMESSO database table.
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_TIPO_DOC_AMMESSO")
public class DecTipoDocAmmesso implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idTipoDocAmmesso;

    private String flObbl;

    private String tiDoc;

    private DecTipoDoc decTipoDoc;

    private DecTipoStrutUnitaDoc decTipoStrutUnitaDoc;

    public DecTipoDocAmmesso() {/* Hibernate */
    }

    @Id
    // "DEC_TIPO_DOC_AMMESSO_IDTIPODOCAMMESSO_GENERATOR",
    // sequenceName = "SDEC_TIPO_DOC_AMMESSO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_TIPO_DOC_AMMESSO_IDTIPODOCAMMESSO_GENERATOR")
    @Column(name = "ID_TIPO_DOC_AMMESSO")
    @XmlID
    @GenericGenerator(name = "SDEC_TIPO_DOC_AMMESSO_ID_TIPO_DOC_AMMESSO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_TIPO_DOC_AMMESSO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_TIPO_DOC_AMMESSO_ID_TIPO_DOC_AMMESSO_GENERATOR")
    public Long getIdTipoDocAmmesso() {
        return this.idTipoDocAmmesso;
    }

    public void setIdTipoDocAmmesso(Long idTipoDocAmmesso) {
        this.idTipoDocAmmesso = idTipoDocAmmesso;
    }

    @Column(name = "FL_OBBL", columnDefinition = "char(1)")
    public String getFlObbl() {
        return this.flObbl;
    }

    public void setFlObbl(String flObbl) {
        this.flObbl = flObbl;
    }

    @Column(name = "TI_DOC")
    public String getTiDoc() {
        return this.tiDoc;
    }

    public void setTiDoc(String tiDoc) {
        this.tiDoc = tiDoc;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC")
    @XmlInverseReference(mappedBy = "decTipoDocAmmessos")
    public DecTipoDoc getDecTipoDoc() {
        return this.decTipoDoc;
    }

    public void setDecTipoDoc(DecTipoDoc decTipoDoc) {
        this.decTipoDoc = decTipoDoc;
    }

    // bi-directional many-to-one association to DecTipoStrutUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_STRUT_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decTipoDocAmmessos")
    public DecTipoStrutUnitaDoc getDecTipoStrutUnitaDoc() {
        return this.decTipoStrutUnitaDoc;
    }

    public void setDecTipoStrutUnitaDoc(DecTipoStrutUnitaDoc decTipoStrutUnitaDoc) {
        this.decTipoStrutUnitaDoc = decTipoStrutUnitaDoc;
    }

}
