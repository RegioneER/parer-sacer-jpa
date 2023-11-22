package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_FORMATO_PROPRIETA database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_FORMATO_PROPRIETA")
public class DecFormatoProprieta implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idFormatoProprieta;
    private String nmFormatoProprieta;
    private Integer niPunteggioDefault;
    private DecFormatoGruppoProprieta decFormatoGruppoProprieta;

    public DecFormatoProprieta() {/* Hibernate */
    }

    @Id
    @SequenceGenerator(name = "DEC_FORMATO_PROPRIETA_GENERATOR", sequenceName = "SDEC_FORMATO_PROPRIETA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FORMATO_PROPRIETA_GENERATOR")
    @Column(name = "ID_FORMATO_PROPRIETA")
    public Long getIdFormatoProprieta() {
        return idFormatoProprieta;
    }

    public void setIdFormatoProprieta(Long idFormatoProprieta) {
        this.idFormatoProprieta = idFormatoProprieta;
    }

    @Column(name = "NM_FORMATO_PROPRIETA")
    public String getNmFormatoProprieta() {
        return nmFormatoProprieta;
    }

    public void setNmFormatoProprieta(String nmFormatoProprieta) {
        this.nmFormatoProprieta = nmFormatoProprieta;
    }

    @Column(name = "NI_PUNTEGGIO_DEFAULT")
    public Integer getNiPunteggioDefault() {
        return niPunteggioDefault;
    }

    public void setNiPunteggioDefault(Integer niPunteggioDefault) {
        this.niPunteggioDefault = niPunteggioDefault;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_GRUPPO_PROPRIETA", nullable = false)
    public DecFormatoGruppoProprieta getDecFormatoGruppoProprieta() {
        return decFormatoGruppoProprieta;
    }

    public void setDecFormatoGruppoProprieta(DecFormatoGruppoProprieta decFormatoGruppoProprieta) {
        this.decFormatoGruppoProprieta = decFormatoGruppoProprieta;
    }

}
