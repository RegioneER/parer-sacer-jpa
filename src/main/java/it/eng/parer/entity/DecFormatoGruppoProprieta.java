package it.eng.parer.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_FORMATO_GRUPPO_PROPRIETA database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_FORMATO_GRUPPO_PROPRIETA")
public class DecFormatoGruppoProprieta implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idFormatoGruppoProprieta;
    private String nmFormatoGruppoProprieta;
    private List<DecFormatoProprieta> decFormatoProprietas = new ArrayList<>();

    public DecFormatoGruppoProprieta() {/* Hibernate */
    }

    @Id
    @SequenceGenerator(name = "DEC_FORMATO_GRUPPO_PROPRIETA_GENERATOR", sequenceName = "SDEC_FORMATO_GRUPPO_PROPRIETA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FORMATO_GRUPPO_PROPRIETA_GENERATOR")
    @Column(name = "ID_FORMATO_GRUPPO_PROPRIETA")
    public Long getIdFormatoGruppoProprieta() {
        return idFormatoGruppoProprieta;
    }

    public void setIdFormatoGruppoProprieta(Long idFormatoGruppoProprieta) {
        this.idFormatoGruppoProprieta = idFormatoGruppoProprieta;
    }

    @Column(name = "NM_FORMATO_GRUPPO_PROPRIETA")
    public String getNmFormatoGruppoProprieta() {
        return nmFormatoGruppoProprieta;
    }

    public void setNmFormatoGruppoProprieta(String nmFormatoGruppoProprieta) {
        this.nmFormatoGruppoProprieta = nmFormatoGruppoProprieta;
    }

    @OneToMany(mappedBy = "decFormatoGruppoProprieta")
    public List<DecFormatoProprieta> getDecFormatoProprietas() {
        return decFormatoProprietas;
    }

    public void setDecFormatoProprietas(List<DecFormatoProprieta> decFormatoProprietas) {
        this.decFormatoProprietas = decFormatoProprietas;
    }

}
