package it.eng.parer.entity;

import it.eng.parer.entity.constraint.FasRespFascicolo.TiOggResp;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the FAS_RESP_FASCICOLO database table.
 *
 */
@Entity
@Table(name = "FAS_RESP_FASCICOLO")
@NamedQuery(name = "FasRespFascicolo.find", query = "SELECT f FROM FasRespFascicolo f WHERE f.fasFascicolo.idFascicolo = :idFascicolo")
public class FasRespFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idRespFascicolo;
    private String cdResp;
    private String nmCognResp;
    private String nmNomeResp;
    private String tiCdResp;
    private TiOggResp tiOggResp;
    private String tiResp;
    private FasFascicolo fasFascicolo;

    public FasRespFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_RESP_FASCICOLO_IDRESPFASCICOLO_GENERATOR", sequenceName = "SFAS_RESP_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_RESP_FASCICOLO_IDRESPFASCICOLO_GENERATOR")
    @Column(name = "ID_RESP_FASCICOLO")
    public long getIdRespFascicolo() {
        return this.idRespFascicolo;
    }

    public void setIdRespFascicolo(long idRespFascicolo) {
        this.idRespFascicolo = idRespFascicolo;
    }

    @Column(name = "CD_RESP")
    public String getCdResp() {
        return this.cdResp;
    }

    public void setCdResp(String cdResp) {
        this.cdResp = cdResp;
    }

    @Column(name = "NM_COGN_RESP")
    public String getNmCognResp() {
        return this.nmCognResp;
    }

    public void setNmCognResp(String nmCognResp) {
        this.nmCognResp = nmCognResp;
    }

    @Column(name = "NM_NOME_RESP")
    public String getNmNomeResp() {
        return this.nmNomeResp;
    }

    public void setNmNomeResp(String nmNomeResp) {
        this.nmNomeResp = nmNomeResp;
    }

    @Column(name = "TI_CD_RESP")
    public String getTiCdResp() {
        return this.tiCdResp;
    }

    public void setTiCdResp(String tiCdResp) {
        this.tiCdResp = tiCdResp;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_OGG_RESP")
    public TiOggResp getTiOggResp() {
        return this.tiOggResp;
    }

    public void setTiOggResp(TiOggResp tiOggResp) {
        this.tiOggResp = tiOggResp;
    }

    @Column(name = "TI_RESP")
    public String getTiResp() {
        return this.tiResp;
    }

    public void setTiResp(String tiResp) {
        this.tiResp = tiResp;
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
}