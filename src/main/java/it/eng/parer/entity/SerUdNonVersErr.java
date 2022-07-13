package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the SER_UD_NON_VERS_ERR database table.
 * 
 */
@Entity
@Table(name = "SER_UD_NON_VERS_ERR")
@NamedQuery(name = "SerUdNonVersErr.findAll", query = "SELECT s FROM SerUdNonVersErr s")
public class SerUdNonVersErr implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUdNonVersErr;
    private SerErrContenutoVerSerie serErrContenutoVerSerie;
    private VrsUnitaDocNonVer vrsUnitaDocNonVer;

    public SerUdNonVersErr() {
    }

    @Id
    @SequenceGenerator(name = "SER_UD_NON_VERS_ERR_IDUDNONVERSERR_GENERATOR", sequenceName = "SSER_UD_NON_VERS_ERR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_UD_NON_VERS_ERR_IDUDNONVERSERR_GENERATOR")
    @Column(name = "ID_UD_NON_VERS_ERR")
    public long getIdUdNonVersErr() {
        return this.idUdNonVersErr;
    }

    public void setIdUdNonVersErr(long idUdNonVersErr) {
        this.idUdNonVersErr = idUdNonVersErr;
    }

    // bi-directional many-to-one association to SerErrContenutoVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_CONTENUTO_VER_SERIE")
    public SerErrContenutoVerSerie getSerErrContenutoVerSerie() {
        return this.serErrContenutoVerSerie;
    }

    public void setSerErrContenutoVerSerie(SerErrContenutoVerSerie serErrContenutoVerSerie) {
        this.serErrContenutoVerSerie = serErrContenutoVerSerie;
    }

    // bi-directional many-to-one association to VrsUnitaDocNonVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC_NON_VERS")
    public VrsUnitaDocNonVer getVrsUnitaDocNonVer() {
        return this.vrsUnitaDocNonVer;
    }

    public void setVrsUnitaDocNonVer(VrsUnitaDocNonVer vrsUnitaDocNonVer) {
        this.vrsUnitaDocNonVer = vrsUnitaDocNonVer;
    }

}