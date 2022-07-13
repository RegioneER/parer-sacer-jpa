package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the APL_SISTEMA_MIGRAZ database table.
 * 
 */
@Entity
@Cacheable(true)
@Table(name = "APL_SISTEMA_MIGRAZ")
public class AplSistemaMigraz implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idSistemaMigraz;
    private String dsSistemaMigraz;
    private String nmSistemaMigraz;
    private List<OrgUsoSistemaMigraz> orgUsoSistemaMigrazs;

    public AplSistemaMigraz() {
    }

    @Id
    @SequenceGenerator(name = "APL_SISTEMA_MIGRAZ_IDSISTEMAMIGRAZ_GENERATOR", sequenceName = "SAPL_SISTEMA_MIGRAZ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APL_SISTEMA_MIGRAZ_IDSISTEMAMIGRAZ_GENERATOR")
    @Column(name = "ID_SISTEMA_MIGRAZ")
    public long getIdSistemaMigraz() {
        return this.idSistemaMigraz;
    }

    public void setIdSistemaMigraz(long idSistemaMigraz) {
        this.idSistemaMigraz = idSistemaMigraz;
    }

    @Column(name = "DS_SISTEMA_MIGRAZ")
    public String getDsSistemaMigraz() {
        return this.dsSistemaMigraz;
    }

    public void setDsSistemaMigraz(String dsSistemaMigraz) {
        this.dsSistemaMigraz = dsSistemaMigraz;
    }

    @Column(name = "NM_SISTEMA_MIGRAZ")
    public String getNmSistemaMigraz() {
        return this.nmSistemaMigraz;
    }

    public void setNmSistemaMigraz(String nmSistemaMigraz) {
        this.nmSistemaMigraz = nmSistemaMigraz;
    }

    // bi-directional many-to-one association to OrgUsoSistemaMigraz
    @OneToMany(mappedBy = "aplSistemaMigraz")
    public List<OrgUsoSistemaMigraz> getOrgUsoSistemaMigrazs() {
        return this.orgUsoSistemaMigrazs;
    }

    public void setOrgUsoSistemaMigrazs(List<OrgUsoSistemaMigraz> orgUsoSistemaMigrazs) {
        this.orgUsoSistemaMigrazs = orgUsoSistemaMigrazs;
    }

}