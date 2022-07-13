package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlID;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_TIPO_STRUT_UD_REG database table.
 * 
 */
@Entity
@Table(name = "DEC_TIPO_STRUT_UD_REG")
@NamedQuery(name = "DecTipoStrutUdReg.findAll", query = "SELECT d FROM DecTipoStrutUdReg d")
public class DecTipoStrutUdReg implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idTipoStrutUdReg;
    private DecRegistroUnitaDoc decRegistroUnitaDoc;
    private DecTipoStrutUnitaDoc decTipoStrutUnitaDoc;

    public DecTipoStrutUdReg() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_STRUT_UD_REG_IDTIPOSTRUTUDREG_GENERATOR", sequenceName = "SDEC_TIPO_STRUT_UD_REG")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_STRUT_UD_REG_IDTIPOSTRUTUDREG_GENERATOR")
    @Column(name = "ID_TIPO_STRUT_UD_REG")
    @XmlID
    public long getIdTipoStrutUdReg() {
        return this.idTipoStrutUdReg;
    }

    public void setIdTipoStrutUdReg(long idTipoStrutUdReg) {
        this.idTipoStrutUdReg = idTipoStrutUdReg;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_UNITA_DOC")
    // @XmlInverseReference(mappedBy = "decTipoStrutUdRegs")
    public DecRegistroUnitaDoc getDecRegistroUnitaDoc() {
        return this.decRegistroUnitaDoc;
    }

    public void setDecRegistroUnitaDoc(DecRegistroUnitaDoc decRegistroUnitaDoc) {
        this.decRegistroUnitaDoc = decRegistroUnitaDoc;
    }

    // bi-directional many-to-one association to DecTipoStrutUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_STRUT_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decTipoStrutUdRegs")
    public DecTipoStrutUnitaDoc getDecTipoStrutUnitaDoc() {
        return this.decTipoStrutUnitaDoc;
    }

    public void setDecTipoStrutUnitaDoc(DecTipoStrutUnitaDoc decTipoStrutUnitaDoc) {
        this.decTipoStrutUnitaDoc = decTipoStrutUnitaDoc;
    }

}