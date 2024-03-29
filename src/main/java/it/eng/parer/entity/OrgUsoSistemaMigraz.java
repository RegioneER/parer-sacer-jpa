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
 * The persistent class for the ORG_USO_SISTEMA_MIGRAZ database table.
 */
@Entity
@Cacheable(true)
@Table(name = "ORG_USO_SISTEMA_MIGRAZ")
public class OrgUsoSistemaMigraz implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUsoSistemaMigraz;

    private AplSistemaMigraz aplSistemaMigraz;

    private OrgStrut orgStrut;

    public OrgUsoSistemaMigraz() {/* Hibernate */
    }

    @Id
    @XmlID
    // "ORG_USO_SISTEMA_MIGRAZ_IDUSOSISTEMAMIGRAZ_GENERATOR",
    // sequenceName =
    // "SORG_USO_SISTEMA_MIGRAZ",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ORG_USO_SISTEMA_MIGRAZ_IDUSOSISTEMAMIGRAZ_GENERATOR")
    @Column(name = "ID_USO_SISTEMA_MIGRAZ")
    @GenericGenerator(name = "SORG_USO_SISTEMA_MIGRAZ_ID_USO_SISTEMA_MIGRAZ_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SORG_USO_SISTEMA_MIGRAZ"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SORG_USO_SISTEMA_MIGRAZ_ID_USO_SISTEMA_MIGRAZ_GENERATOR")
    public Long getIdUsoSistemaMigraz() {
        return this.idUsoSistemaMigraz;
    }

    public void setIdUsoSistemaMigraz(Long idUsoSistemaMigraz) {
        this.idUsoSistemaMigraz = idUsoSistemaMigraz;
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

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "orgUsoSistemaMigrazs")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

}
