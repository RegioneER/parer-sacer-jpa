package it.eng.parer.grantedEntity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the ORG_DISCIP_STRUT database table.
 *
 */
@Entity
@Table(name = "ORG_DISCIP_STRUT", schema = "SACER_IAM")
public class OrgDiscipStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idDiscipStrut;
    private long idAccordoEnte;
    private long idOrganizIam;
    private Date dtDiscipStrut;
    private byte[] blDiscipStrut;
    private long idEnteConvenz;

    public OrgDiscipStrut() {
    }

    @Id
    @SequenceGenerator(name = "ORG_DISCIP_STRUT_IDDISCIPSTRUT_GENERATOR", sequenceName = "SACER_IAM.SORG_DISCIP_STRUT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_DISCIP_STRUT_IDDISCIPSTRUT_GENERATOR")
    @Column(name = "ID_DISCIP_STRUT")
    public long getIdDiscipStrut() {
        return this.idDiscipStrut;
    }

    public void setIdDiscipStrut(long idDiscipStrut) {
        this.idDiscipStrut = idDiscipStrut;
    }

    @Column(name = "ID_ACCORDO_ENTE")
    public long getIdAccordoEnte() {
        return this.idAccordoEnte;
    }

    public void setIdAccordoEnte(long idAccordoEnte) {
        this.idAccordoEnte = idAccordoEnte;
    }

    @Column(name = "ID_ORGANIZ_IAM")
    public long getIdOrganizIam() {
        return this.idOrganizIam;
    }

    public void setIdOrganizIam(long idOrganizIam) {
        this.idOrganizIam = idOrganizIam;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_DISCIP_STRUT")
    public Date getDtDiscipStrut() {
        return this.dtDiscipStrut;
    }

    public void setDtDiscipStrut(Date dtDiscipStrut) {
        this.dtDiscipStrut = dtDiscipStrut;
    }

    @Lob
    @Column(name = "BL_DISCIP_STRUT")
    public byte[] getBlDiscipStrut() {
        return this.blDiscipStrut;
    }

    public void setBlDiscipStrut(byte[] blDiscipStrut) {
        this.blDiscipStrut = blDiscipStrut;
    }

    @Column(name = "ID_ENTE_CONVENZ")
    public long getIdEnteConvenz() {
        return idEnteConvenz;
    }

    public void setIdEnteConvenz(long idEnteConvenz) {
        this.idEnteConvenz = idEnteConvenz;
    }

}
