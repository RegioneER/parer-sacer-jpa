package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the DEC_TIPO_SERIE_CREATA_AUTOM database table.
 * 
 */
@Entity
@Table(name = "DEC_TIPO_SERIE_CREATA_AUTOM")
@NamedQuery(name = "DecTipoSerieCreataAutom.findAll", query = "SELECT d FROM DecTipoSerieCreataAutom d")
public class DecTipoSerieCreataAutom implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idTipoSerieCreataAutom;
    private Date dtCreaAutom;
    private DecTipoSerie decTipoSerie;

    public DecTipoSerieCreataAutom() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_SERIE_CREATA_AUTOM_IDTIPOSERIECREATAAUTOM_GENERATOR", sequenceName = "SDEC_TIPO_SERIE_CREATA_AUTOM", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_SERIE_CREATA_AUTOM_IDTIPOSERIECREATAAUTOM_GENERATOR")
    @Column(name = "ID_TIPO_SERIE_CREATA_AUTOM")
    public long getIdTipoSerieCreataAutom() {
        return this.idTipoSerieCreataAutom;
    }

    public void setIdTipoSerieCreataAutom(long idTipoSerieCreataAutom) {
        this.idTipoSerieCreataAutom = idTipoSerieCreataAutom;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREA_AUTOM")
    public Date getDtCreaAutom() {
        return this.dtCreaAutom;
    }

    public void setDtCreaAutom(Date dtCreaAutom) {
        this.dtCreaAutom = dtCreaAutom;
    }

    // bi-directional many-to-one association to DecTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERIE")
    public DecTipoSerie getDecTipoSerie() {
        return this.decTipoSerie;
    }

    public void setDecTipoSerie(DecTipoSerie decTipoSerie) {
        this.decTipoSerie = decTipoSerie;
    }

}