package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the VOL_APPART_DOC_VOLUME database table.
 */
@Entity
@Table(name = "VOL_APPART_DOC_VOLUME")
public class VolAppartDocVolume implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idAppartDocVolume;

    private String flValida;

    private BigDecimal idStrut;

    private String ntGenericheDoc;

    private List<VolAppartCompVolume> volAppartCompVolumes = new ArrayList<>();

    private AroDoc aroDoc;

    private VolAppartUnitaDocVolume volAppartUnitaDocVolume;

    public VolAppartDocVolume() {/* Hibernate */
    }

    @Id
    // "VOL_APPART_DOC_VOLUME_IDAPPARTDOCVOLUME_GENERATOR",
    // sequenceName = "SVOL_APPART_DOC_VOLUME",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VOL_APPART_DOC_VOLUME_IDAPPARTDOCVOLUME_GENERATOR")
    @Column(name = "ID_APPART_DOC_VOLUME")
    @GenericGenerator(name = "SVOL_APPART_DOC_VOLUME_ID_APPART_DOC_VOLUME_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVOL_APPART_DOC_VOLUME"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVOL_APPART_DOC_VOLUME_ID_APPART_DOC_VOLUME_GENERATOR")
    public Long getIdAppartDocVolume() {
        return this.idAppartDocVolume;
    }

    public void setIdAppartDocVolume(Long idAppartDocVolume) {
        this.idAppartDocVolume = idAppartDocVolume;
    }

    @Column(name = "FL_VALIDA", columnDefinition = "char(1)")
    public String getFlValida() {
        return this.flValida;
    }

    public void setFlValida(String flValida) {
        this.flValida = flValida;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NT_GENERICHE_DOC")
    public String getNtGenericheDoc() {
        return this.ntGenericheDoc;
    }

    public void setNtGenericheDoc(String ntGenericheDoc) {
        this.ntGenericheDoc = ntGenericheDoc;
    }

    // bi-directional many-to-one association to VolAppartCompVolume
    @OneToMany(mappedBy = "volAppartDocVolume", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
    public List<VolAppartCompVolume> getVolAppartCompVolumes() {
        return this.volAppartCompVolumes;
    }

    public void setVolAppartCompVolumes(List<VolAppartCompVolume> volAppartCompVolumes) {
        this.volAppartCompVolumes = volAppartCompVolumes;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_DOC")
    public AroDoc getAroDoc() {
        return this.aroDoc;
    }

    public void setAroDoc(AroDoc aroDoc) {
        this.aroDoc = aroDoc;
    }

    // bi-directional many-to-one association to VolAppartUnitaDocVolume
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_APPART_UNITA_DOC_VOLUME")
    public VolAppartUnitaDocVolume getVolAppartUnitaDocVolume() {
        return this.volAppartUnitaDocVolume;
    }

    public void setVolAppartUnitaDocVolume(VolAppartUnitaDocVolume volAppartUnitaDocVolume) {
        this.volAppartUnitaDocVolume = volAppartUnitaDocVolume;
    }

}
