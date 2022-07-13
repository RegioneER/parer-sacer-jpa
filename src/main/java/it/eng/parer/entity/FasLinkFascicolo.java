package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the FAS_LINK_FASCICOLO database table.
 *
 */
@Entity
@Table(name = "FAS_LINK_FASCICOLO")
@NamedQueries({
        @NamedQuery(name = "FasLinkFascicolo.find", query = "SELECT f FROM FasLinkFascicolo f WHERE f.fasFascicolo.idFascicolo = :idFascicolo"),
        @NamedQuery(name = "FasLinkFascicolo.findByIdFasLink", query = "SELECT f FROM FasLinkFascicolo f WHERE f.fasFascicoloLink.idFascicolo = :idFascicolo "
                + "ORDER BY f.fasFascicoloLink.cdKeyOrd DESC") })
public class FasLinkFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idLinkFascicolo;
    private BigDecimal aaFascicoloLink;
    private String cdKeyFascicoloLink;
    private String dsLink;
    private FasFascicolo fasFascicolo;
    private FasFascicolo fasFascicoloLink;

    public FasLinkFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_LINK_FASCICOLO_IDLINKFASCICOLO_GENERATOR", sequenceName = "SFAS_LINK_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_LINK_FASCICOLO_IDLINKFASCICOLO_GENERATOR")
    @Column(name = "ID_LINK_FASCICOLO")
    public long getIdLinkFascicolo() {
        return this.idLinkFascicolo;
    }

    public void setIdLinkFascicolo(long idLinkFascicolo) {
        this.idLinkFascicolo = idLinkFascicolo;
    }

    @Column(name = "AA_FASCICOLO_LINK")
    public BigDecimal getAaFascicoloLink() {
        return this.aaFascicoloLink;
    }

    public void setAaFascicoloLink(BigDecimal aaFascicoloLink) {
        this.aaFascicoloLink = aaFascicoloLink;
    }

    @Column(name = "CD_KEY_FASCICOLO_LINK")
    public String getCdKeyFascicoloLink() {
        return this.cdKeyFascicoloLink;
    }

    public void setCdKeyFascicoloLink(String cdKeyFascicoloLink) {
        this.cdKeyFascicoloLink = cdKeyFascicoloLink;
    }

    @Column(name = "DS_LINK")
    public String getDsLink() {
        return this.dsLink;
    }

    public void setDsLink(String dsLink) {
        this.dsLink = dsLink;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO_LINK")
    public FasFascicolo getFasFascicoloLink() {
        return this.fasFascicoloLink;
    }

    public void setFasFascicoloLink(FasFascicolo fasFascicoloLink) {
        this.fasFascicoloLink = fasFascicoloLink;
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

    @Transient
    public boolean hasLink() {
        boolean result = this.fasFascicoloLink != null;
        return result;
    }
}