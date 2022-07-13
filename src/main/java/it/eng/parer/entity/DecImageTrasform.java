package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_IMAGE_TRASFORM database table.
 *
 */
@Entity
@Table(name = "DEC_IMAGE_TRASFORM")
public class DecImageTrasform implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idImageTrasform;
    private byte[] blImageTrasform;
    private Date dtLastModImageTrasform;
    private Date dtLastScaricoImageTrasform;
    private String nmImageTrasform;
    private DecTrasformTipoRappr decTrasformTipoRappr;

    public DecImageTrasform() {
    }

    @Id
    @SequenceGenerator(name = "DEC_IMAGE_TRASFORM_IDIMAGETRASFORM_GENERATOR", sequenceName = "SDEC_IMAGE_TRASFORM", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_IMAGE_TRASFORM_IDIMAGETRASFORM_GENERATOR")
    @Column(name = "ID_IMAGE_TRASFORM")
    @XmlID
    public long getIdImageTrasform() {
        return this.idImageTrasform;
    }

    public void setIdImageTrasform(long idImageTrasform) {
        this.idImageTrasform = idImageTrasform;
    }

    @Lob
    @Column(name = "BL_IMAGE_TRASFORM")
    @XmlTransient
    public byte[] getBlImageTrasform() {
        return this.blImageTrasform;
    }

    public void setBlImageTrasform(byte[] blImageTrasform) {
        this.blImageTrasform = blImageTrasform;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LAST_MOD_IMAGE_TRASFORM")
    public Date getDtLastModImageTrasform() {
        return this.dtLastModImageTrasform;
    }

    public void setDtLastModImageTrasform(Date dtLastModImageTrasform) {
        this.dtLastModImageTrasform = dtLastModImageTrasform;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LAST_SCARICO_IMAGE_TRASFORM")
    public Date getDtLastScaricoImageTrasform() {
        return this.dtLastScaricoImageTrasform;
    }

    public void setDtLastScaricoImageTrasform(Date dtLastScaricoImageTrasform) {
        this.dtLastScaricoImageTrasform = dtLastScaricoImageTrasform;
    }

    @Column(name = "NM_IMAGE_TRASFORM")
    public String getNmImageTrasform() {
        return this.nmImageTrasform;
    }

    public void setNmImageTrasform(String nmImageTrasform) {
        this.nmImageTrasform = nmImageTrasform;
    }

    // bi-directional many-to-one association to DecTrasformTipoRappr
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TRASFORM_TIPO_RAPPR")
    @XmlInverseReference(mappedBy = "decImageTrasforms")
    public DecTrasformTipoRappr getDecTrasformTipoRappr() {
        return this.decTrasformTipoRappr;
    }

    public void setDecTrasformTipoRappr(DecTrasformTipoRappr decTrasformTipoRappr) {
        this.decTrasformTipoRappr = decTrasformTipoRappr;
    }

}
