package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ORG_USO_SISTEMA_MIGRAZ database table.
 * 
 */
@Entity
@Cacheable(true)
@Table(name = "ORG_USO_SISTEMA_MIGRAZ")
public class OrgUsoSistemaMigraz implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUsoSistemaMigraz;
    private AplSistemaMigraz aplSistemaMigraz;
    private OrgStrut orgStrut;

    public OrgUsoSistemaMigraz() {
    }

    @Id
    @SequenceGenerator(name = "ORG_USO_SISTEMA_MIGRAZ_IDUSOSISTEMAMIGRAZ_GENERATOR", sequenceName = "SORG_USO_SISTEMA_MIGRAZ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_USO_SISTEMA_MIGRAZ_IDUSOSISTEMAMIGRAZ_GENERATOR")
    @Column(name = "ID_USO_SISTEMA_MIGRAZ")
    public long getIdUsoSistemaMigraz() {
        return this.idUsoSistemaMigraz;
    }

    public void setIdUsoSistemaMigraz(long idUsoSistemaMigraz) {
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
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

}