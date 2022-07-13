package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the REC_DT_VERS_RECUP database table.
 *
 */
@Entity
@Table(name = "REC_DT_VERS_RECUP")
public class RecDtVersRecup implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idDtVersRecup;
    private Date dtStatoDtVersRecup;
    private Date dtVers;
    private String flMigraz;
    private String tiStatoDtVersRecup;
    private RecSessioneRecup recSessioneRecup;

    public RecDtVersRecup() {
    }

    @Id
    @SequenceGenerator(name = "REC_DT_VERS_RECUP_IDDTVERSRECUP_GENERATOR", sequenceName = "SREC_DT_VERS_RECUP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REC_DT_VERS_RECUP_IDDTVERSRECUP_GENERATOR")
    @Column(name = "ID_DT_VERS_RECUP")
    public long getIdDtVersRecup() {
        return this.idDtVersRecup;
    }

    public void setIdDtVersRecup(long idDtVersRecup) {
        this.idDtVersRecup = idDtVersRecup;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_STATO_DT_VERS_RECUP")
    public Date getDtStatoDtVersRecup() {
        return this.dtStatoDtVersRecup;
    }

    public void setDtStatoDtVersRecup(Date dtStatoDtVersRecup) {
        this.dtStatoDtVersRecup = dtStatoDtVersRecup;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_VERS")
    public Date getDtVers() {
        return this.dtVers;
    }

    public void setDtVers(Date dtVers) {
        this.dtVers = dtVers;
    }

    @Column(name = "FL_MIGRAZ")
    public String getFlMigraz() {
        return this.flMigraz;
    }

    public void setFlMigraz(String flMigraz) {
        this.flMigraz = flMigraz;
    }

    @Column(name = "TI_STATO_DT_VERS_RECUP")
    public String getTiStatoDtVersRecup() {
        return this.tiStatoDtVersRecup;
    }

    public void setTiStatoDtVersRecup(String tiStatoDtVersRecup) {
        this.tiStatoDtVersRecup = tiStatoDtVersRecup;
    }

    // bi-directional many-to-one association to RecSessioneRecup
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SESSIONE_RECUP")
    public RecSessioneRecup getRecSessioneRecup() {
        return this.recSessioneRecup;
    }

    public void setRecSessioneRecup(RecSessioneRecup recSessioneRecup) {
        this.recSessioneRecup = recSessioneRecup;
    }

}