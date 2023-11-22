package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the FAS_LINK_FASCICOLO database table.
 */
@Entity
@Table(name = "FAS_LINK_FASCICOLO")
@NamedQueries({
        @NamedQuery(name = "FasLinkFascicolo.find", query = "SELECT f FROM FasLinkFascicolo f WHERE f.fasFascicolo.idFascicolo = :idFascicolo"),
        @NamedQuery(name = "FasLinkFascicolo.findByIdFasLink", query = "SELECT f FROM FasLinkFascicolo f WHERE f.fasFascicoloLink.idFascicolo = :idFascicolo "
                + "ORDER BY f.fasFascicoloLink.cdKeyOrd DESC") })
public class FasLinkFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idLinkFascicolo;

    private BigDecimal aaFascicoloLink;

    private String cdKeyFascicoloLink;

    private String dsLink;

    private FasFascicolo fasFascicolo;

    private FasFascicolo fasFascicoloLink;

    public FasLinkFascicolo() {/* Hibernate */
    }

    @Id
    // "FAS_LINK_FASCICOLO_IDLINKFASCICOLO_GENERATOR",
    // sequenceName = "SFAS_LINK_FASCICOLO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_LINK_FASCICOLO_IDLINKFASCICOLO_GENERATOR")
    @Column(name = "ID_LINK_FASCICOLO")
    @GenericGenerator(name = "SFAS_LINK_FASCICOLO_ID_LINK_FASCICOLO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_LINK_FASCICOLO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_LINK_FASCICOLO_ID_LINK_FASCICOLO_GENERATOR")
    public Long getIdLinkFascicolo() {
        return this.idLinkFascicolo;
    }

    public void setIdLinkFascicolo(Long idLinkFascicolo) {
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
