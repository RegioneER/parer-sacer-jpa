package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import it.eng.parer.entity.constraint.AroUrnVerIndiceAipUd.TiUrnVerIxAipUd;

/**
 * The persistent class for the ARO_URN_VER_INDICE_AIP_UD database table.
 * 
 */
@Entity
@Table(name = "ARO_URN_VER_INDICE_AIP_UD")
@NamedQuery(name = "AroUrnVerIndiceAipUd.findAll", query = "SELECT v FROM AroUrnVerIndiceAipUd v")
public class AroUrnVerIndiceAipUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUrnVerIndiceAipUd;
    private String dsUrn;
    private TiUrnVerIxAipUd tiUrn;
    private AroVerIndiceAipUd aroVerIndiceAipUd;

    public AroUrnVerIndiceAipUd() {
    }

    @Id
    @SequenceGenerator(name = "ARO_URN_VER_INDICE_AIP_UD_IDURNVERINDICEAIPUD_GENERATOR", sequenceName = "SARO_URN_VER_INDICE_AIP_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_URN_VER_INDICE_AIP_UD_IDURNVERINDICEAIPUD_GENERATOR")
    @Column(name = "ID_URN_VER_INDICE_AIP_UD")
    public long getIdUrnVerIndiceAipUd() {
        return this.idUrnVerIndiceAipUd;
    }

    public void setIdUrnVerIndiceAipUd(long idUrnVerIndiceAipUd) {
        this.idUrnVerIndiceAipUd = idUrnVerIndiceAipUd;
    }

    @Column(name = "DS_URN")
    public String getDsUrn() {
        return this.dsUrn;
    }

    public void setDsUrn(String dsUrn) {
        this.dsUrn = dsUrn;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_URN")
    public TiUrnVerIxAipUd getTiUrn() {
        return this.tiUrn;
    }

    public void setTiUrn(TiUrnVerIxAipUd tiUrn) {
        this.tiUrn = tiUrn;
    }

    // bi-directional many-to-one association to AroVerIndiceAipUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VER_INDICE_AIP")
    public AroVerIndiceAipUd getAroVerIndiceAipUd() {
        return this.aroVerIndiceAipUd;
    }

    public void setAroVerIndiceAipUd(AroVerIndiceAipUd aroVerIndiceAipUd) {
        this.aroVerIndiceAipUd = aroVerIndiceAipUd;
    }

}