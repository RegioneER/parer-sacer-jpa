package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_TIPO_RAPPR_AMMESSO database table.
 * 
 */
@Entity
@Table(name = "DEC_TIPO_RAPPR_AMMESSO")
@NamedQuery(name = "DecTipoRapprAmmesso.findAll", query = "SELECT d FROM DecTipoRapprAmmesso d")
public class DecTipoRapprAmmesso implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idTipoRapprAmmesso;
    private DecTipoCompDoc decTipoCompDoc;
    private DecTipoRapprComp decTipoRapprComp;

    public DecTipoRapprAmmesso() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_RAPPR_AMMESSO_IDTIPORAPPRAMMESSO_GENERATOR", sequenceName = "SDEC_TIPO_RAPPR_AMMESSO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_RAPPR_AMMESSO_IDTIPORAPPRAMMESSO_GENERATOR")
    @Column(name = "ID_TIPO_RAPPR_AMMESSO")
    @XmlID
    public long getIdTipoRapprAmmesso() {
        return this.idTipoRapprAmmesso;
    }

    public void setIdTipoRapprAmmesso(long idTipoRapprAmmesso) {
        this.idTipoRapprAmmesso = idTipoRapprAmmesso;
    }

    // bi-directional many-to-one association to DecTipoCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_COMP_DOC")
    @XmlInverseReference(mappedBy = "decTipoRapprAmmessos")
    public DecTipoCompDoc getDecTipoCompDoc() {
        return this.decTipoCompDoc;
    }

    public void setDecTipoCompDoc(DecTipoCompDoc decTipoCompDoc) {
        this.decTipoCompDoc = decTipoCompDoc;
    }

    // bi-directional many-to-one association to DecTipoRapprComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_RAPPR_COMP")
    @XmlInverseReference(mappedBy = "decTipoRapprAmmessos")
    public DecTipoRapprComp getDecTipoRapprComp() {
        return this.decTipoRapprComp;
    }

    public void setDecTipoRapprComp(DecTipoRapprComp decTipoRapprComp) {
        this.decTipoRapprComp = decTipoRapprComp;
    }

}