package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the VOL_FILE_VOLUME_CONSERV database table.
 */
@Entity
@Table(name = "VOL_FILE_VOLUME_CONSERV")
public class VolFileVolumeConserv implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFileVolumeConserv;

    private byte[] blFileVolumeConserv;

    private String tiFileVolumeConserv;

    private VolVolumeConserv volVolumeConserv;

    public VolFileVolumeConserv() {/* Hibernate */
    }

    @Id
    // "VOL_FILE_VOLUME_CONSERV_IDFILEVOLUMECONSERV_GENERATOR",
    // sequenceName =
    // "SVOL_FILE_VOLUME_CONSERV",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VOL_FILE_VOLUME_CONSERV_IDFILEVOLUMECONSERV_GENERATOR")
    @Column(name = "ID_FILE_VOLUME_CONSERV")
    @GenericGenerator(name = "SVOL_FILE_VOLUME_CONSERV_ID_FILE_VOLUME_CONSERV_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVOL_FILE_VOLUME_CONSERV"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVOL_FILE_VOLUME_CONSERV_ID_FILE_VOLUME_CONSERV_GENERATOR")
    public Long getIdFileVolumeConserv() {
        return this.idFileVolumeConserv;
    }

    public void setIdFileVolumeConserv(Long idFileVolumeConserv) {
        this.idFileVolumeConserv = idFileVolumeConserv;
    }

    @Lob()
    @Column(name = "BL_FILE_VOLUME_CONSERV")
    public byte[] getBlFileVolumeConserv() {
        return this.blFileVolumeConserv;
    }

    public void setBlFileVolumeConserv(byte[] blFileVolumeConserv) {
        this.blFileVolumeConserv = blFileVolumeConserv;
    }

    @Column(name = "TI_FILE_VOLUME_CONSERV")
    public String getTiFileVolumeConserv() {
        return this.tiFileVolumeConserv;
    }

    public void setTiFileVolumeConserv(String tiFileVolumeConserv) {
        this.tiFileVolumeConserv = tiFileVolumeConserv;
    }

    // bi-directional many-to-one association to VolVolumeConserv
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
            CascadeType.DETACH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VOLUME_CONSERV")
    public VolVolumeConserv getVolVolumeConserv() {
        return this.volVolumeConserv;
    }

    public void setVolVolumeConserv(VolVolumeConserv volVolumeConserv) {
        this.volVolumeConserv = volVolumeConserv;
    }

}
