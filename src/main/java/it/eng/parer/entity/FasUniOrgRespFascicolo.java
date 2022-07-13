package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the FAS_UNI_ORG_RESP_FASCICOLO database table.
 *
 */
@Entity
@Table(name = "FAS_UNI_ORG_RESP_FASCICOLO")
@NamedQuery(name = "FasUniOrgRespFascicolo.find", query = "SELECT f FROM FasUniOrgRespFascicolo f WHERE f.fasFascicolo.idFascicolo = :idFascicolo")
public class FasUniOrgRespFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idUniOrgRespFascicolo;
    private String cdUniOrgResp;
    private FasFascicolo fasFascicolo;

    public FasUniOrgRespFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_UNI_ORG_RESP_FASCICOLO_IDUNIORGRESPFASCICOLO_GENERATOR", sequenceName = "SFAS_UNI_ORG_RESP_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_UNI_ORG_RESP_FASCICOLO_IDUNIORGRESPFASCICOLO_GENERATOR")
    @Column(name = "ID_UNI_ORG_RESP_FASCICOLO")
    public long getIdUniOrgRespFascicolo() {
        return this.idUniOrgRespFascicolo;
    }

    public void setIdUniOrgRespFascicolo(long idUniOrgRespFascicolo) {
        this.idUniOrgRespFascicolo = idUniOrgRespFascicolo;
    }

    @Column(name = "CD_UNI_ORG_RESP")
    public String getCdUniOrgResp() {
        return this.cdUniOrgResp;
    }

    public void setCdUniOrgResp(String cdUniOrgResp) {
        this.cdUniOrgResp = cdUniOrgResp;
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
}