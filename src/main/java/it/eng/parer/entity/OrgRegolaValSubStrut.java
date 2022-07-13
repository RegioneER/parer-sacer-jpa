package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlID;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the ORG_REGOLA_VAL_SUB_STRUT database table.
 *
 */
@Entity
@Table(name = "ORG_REGOLA_VAL_SUB_STRUT")
@NamedQuery(name = "OrgRegolaValSubStrut.findAll", query = "SELECT o FROM OrgRegolaValSubStrut o")
public class OrgRegolaValSubStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idRegolaValSubStrut;
    private Date dtIstituz;
    private Date dtSoppres;
    private List<OrgCampoValSubStrut> orgCampoValSubStruts;
    private DecTipoDoc decTipoDoc;
    private DecTipoUnitaDoc decTipoUnitaDoc;

    public OrgRegolaValSubStrut() {
    }

    @Id
    @SequenceGenerator(name = "ORG_REGOLA_VAL_SUB_STRUT_IDREGOLAVALSUBSTRUT_GENERATOR", sequenceName = "SORG_REGOLA_VAL_SUB_STRUT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_REGOLA_VAL_SUB_STRUT_IDREGOLAVALSUBSTRUT_GENERATOR")
    @Column(name = "ID_REGOLA_VAL_SUB_STRUT")
    @XmlID
    public long getIdRegolaValSubStrut() {
        return this.idRegolaValSubStrut;
    }

    public void setIdRegolaValSubStrut(long idRegolaValSubStrut) {
        this.idRegolaValSubStrut = idRegolaValSubStrut;
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

    // bi-directional many-to-one association to OrgCampoValSubStrut
    @OneToMany(mappedBy = "orgRegolaValSubStrut", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    public List<OrgCampoValSubStrut> getOrgCampoValSubStruts() {
        return this.orgCampoValSubStruts;
    }

    public void setOrgCampoValSubStruts(List<OrgCampoValSubStrut> orgCampoValSubStruts) {
        this.orgCampoValSubStruts = orgCampoValSubStruts;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC")
    @XmlInverseReference(mappedBy = "orgRegolaValSubStruts")
    public DecTipoDoc getDecTipoDoc() {
        return this.decTipoDoc;
    }

    public void setDecTipoDoc(DecTipoDoc decTipoDoc) {
        this.decTipoDoc = decTipoDoc;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    @XmlInverseReference(mappedBy = "orgRegolaValSubStruts")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

}
