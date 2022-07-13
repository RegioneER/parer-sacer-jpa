/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.parer.entity;

import javax.persistence.*;

/**
 *
 * @author fioravanti_f
 */
@Entity
@Table(name = "DEC_ERR_SACER")
@NamedQueries({ @NamedQuery(name = "DecErrSacer.findAll", query = "SELECT d FROM DecErrSacer d"),
        @NamedQuery(name = "DecErrSacer.findByCodClasse", query = "SELECT d FROM DecErrSacer d WHERE d.decClasseErrSacer.cdClasseErrSacer = :codClasse ORDER BY d.cdErr"),
        @NamedQuery(name = "DecErrSacer.findByIdClasse", query = "SELECT d FROM DecErrSacer d WHERE d.decClasseErrSacer.idClasseErrSacer = :idClasse ORDER BY d.cdErr") })
public class DecErrSacer {

    private static final long serialVersionUID = 1L;
    private long idErrSacer;
    private String cdErr;
    private String dsErr;
    private String dsErrFiltro;
    private String tiErrSacer;
    private DecClasseErrSacer decClasseErrSacer;

    public DecErrSacer() {
    }

    @Id
    @SequenceGenerator(name = "DEC_ERR_SACER_IDERRSACER_GENERATOR", sequenceName = "SDEC_ERR_SACER", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_ERR_SACER_IDERRSACER_GENERATOR")
    @Column(name = "ID_ERR_SACER")
    public long getIdErrSacer() {
        return idErrSacer;
    }

    public void setIdErrSacer(long idErrSacer) {
        this.idErrSacer = idErrSacer;
    }

    @Column(name = "CD_ERR")
    public String getCdErr() {
        return cdErr;
    }

    public void setCdErr(String cdErr) {
        this.cdErr = cdErr;
    }

    @Column(name = "DS_ERR")
    public String getDsErr() {
        return dsErr;
    }

    public void setDsErr(String dsErr) {
        this.dsErr = dsErr;
    }

    @Column(name = "DS_ERR_FILTRO")
    public String getDsErrFiltro() {
        return dsErrFiltro;
    }

    public void setDsErrFiltro(String dsErrFiltro) {
        this.dsErrFiltro = dsErrFiltro;
    }

    @Column(name = "TI_ERR_SACER")
    public String getTiErrSacer() {
        return tiErrSacer;
    }

    public void setTiErrSacer(String tiErrSacer) {
        this.tiErrSacer = tiErrSacer;
    }

    // bi-directional many-to-one association to DecAaTipoFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLASSE_ERR_SACER")
    public DecClasseErrSacer getDecClasseErrSacer() {
        return decClasseErrSacer;
    }

    public void setDecClasseErrSacer(DecClasseErrSacer decClasseErrSacer) {
        this.decClasseErrSacer = decClasseErrSacer;
    }

}
