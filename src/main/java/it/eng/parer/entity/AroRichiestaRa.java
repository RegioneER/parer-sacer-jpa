package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import it.eng.parer.entity.constraint.AroRichiestaRa.AroRichiestaTiStato;

/**
 * The persistent class for the ARO_RICHIESTA_RA database table.
 *
 */
@Entity
@Table(name = "ARO_RICHIESTA_RA")
@NamedQuery(name = "AroRichiestaRa.findAll", query = "SELECT a FROM AroRichiestaRa a")
public class AroRichiestaRa implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idRichiestaRa;
    private Date tsInizio;
    private Date tsFine;
    private BigDecimal priorita;
    private OrgStrut orgStrut;
    private IamUser iamUser;
    private AroRichiestaTiStato tiStato;
    private String cdErrore;
    private String note;
    private List<AroAipRestituzioneArchivio> aroAipRestituzioneArchivios;

    public AroRichiestaRa() {
    }

    @Id
    @SequenceGenerator(name = "ARO_RICHIESTA_RA_IDRICHIESTARA_GENERATOR", sequenceName = "SARO_RICHIESTA_RA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_RICHIESTA_RA_IDRICHIESTARA_GENERATOR")
    @Column(name = "ID_RICHIESTA_RA")
    public long getIdRichiestaRa() {
        return this.idRichiestaRa;
    }

    public void setIdRichiestaRa(long idRichiestaRa) {
        this.idRichiestaRa = idRichiestaRa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_INIZIO")
    public Date getTsInizio() {
        return this.tsInizio;
    }

    public void setTsInizio(Date tsInizio) {
        this.tsInizio = tsInizio;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_FINE")
    public Date getTsFine() {
        return this.tsFine;
    }

    public void setTsFine(Date tsFine) {
        this.tsFine = tsFine;
    }

    @Column(name = "PRIORITA")
    public BigDecimal getPriorita() {
        return this.priorita;
    }

    public void setPriorita(BigDecimal priorita) {
        this.priorita = priorita;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO")
    public AroRichiestaTiStato getTiStato() {
        return this.tiStato;
    }

    public void setTiStato(AroRichiestaTiStato tiStato) {
        this.tiStato = tiStato;
    }

    @Column(name = "CD_ERRORE")
    public String getCdErrore() {
        return this.cdErrore;
    }

    public void setCdErrore(String cdErrore) {
        this.cdErrore = cdErrore;
    }

    @Column(name = "NOTE")
    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

    // bi-directional many-to-one association to AroAipRestituzioneArchivio
    @OneToMany(mappedBy = "aroRichiestaRa", cascade = CascadeType.PERSIST)
    public List<AroAipRestituzioneArchivio> getAroAipRestituzioneArchivios() {
        return this.aroAipRestituzioneArchivios;
    }

    public void setAroAipRestituzioneArchivios(List<AroAipRestituzioneArchivio> aroAipRestituzioneArchivios) {
        this.aroAipRestituzioneArchivios = aroAipRestituzioneArchivios;
    }

    public AroAipRestituzioneArchivio addAroAipRestituzioneArchivio(
            AroAipRestituzioneArchivio aroAipRestituzioneArchivio) {
        getAroAipRestituzioneArchivios().add(aroAipRestituzioneArchivio);
        aroAipRestituzioneArchivio.setAroRichiestaRa(this);
        return aroAipRestituzioneArchivio;
    }

    public AroAipRestituzioneArchivio removeAroAipRestituzioneArchivio(
            AroAipRestituzioneArchivio aroAipRestituzioneArchivio) {
        getAroAipRestituzioneArchivios().remove(aroAipRestituzioneArchivio);
        aroAipRestituzioneArchivio.setAroRichiestaRa(null);

        return aroAipRestituzioneArchivio;
    }
}
