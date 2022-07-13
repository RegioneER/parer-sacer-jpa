package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_USO_MODELLO_TIPO_SERIE database table.
 *
 */
@Entity
@Table(name = "DEC_USO_MODELLO_TIPO_SERIE")
@NamedQuery(name = "DecUsoModelloTipoSerie.findAll", query = "SELECT d FROM DecUsoModelloTipoSerie d")
public class DecUsoModelloTipoSerie implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idUsoModelloTipoSerie;
    private DecModelloTipoSerie decModelloTipoSerie;
    private OrgStrut orgStrut;

    public DecUsoModelloTipoSerie() {
    }

    @Id
    @SequenceGenerator(name = "DEC_USO_MODELLO_TIPO_SERIE_IDUSOMODELLOTIPOSERIE_GENERATOR", sequenceName = "SDEC_USO_MODELLO_TIPO_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_USO_MODELLO_TIPO_SERIE_IDUSOMODELLOTIPOSERIE_GENERATOR")
    @Column(name = "ID_USO_MODELLO_TIPO_SERIE")
    @XmlID
    public long getIdUsoModelloTipoSerie() {
        return this.idUsoModelloTipoSerie;
    }

    public void setIdUsoModelloTipoSerie(long idUsoModelloTipoSerie) {
        this.idUsoModelloTipoSerie = idUsoModelloTipoSerie;
    }

    // bi-directional many-to-one association to DecModelloTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODELLO_TIPO_SERIE")
    public DecModelloTipoSerie getDecModelloTipoSerie() {
        return this.decModelloTipoSerie;
    }

    public void setDecModelloTipoSerie(DecModelloTipoSerie decModelloTipoSerie) {
        this.decModelloTipoSerie = decModelloTipoSerie;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "decUsoModelloTipoSeries")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

}
