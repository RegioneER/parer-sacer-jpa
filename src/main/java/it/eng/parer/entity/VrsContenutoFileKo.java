package it.eng.parer.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the VRS_CONTENUTO_FILE database table.
 */
@Entity
@Table(name = "VRS_CONTENUTO_FILE_KO")
public class VrsContenutoFileKo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idContenutoFileKo;

    private byte[] blContenutoFileSessione;

    private BigDecimal idStrut;

    private VrsFileSessioneKo vrsFileSessioneKo;

    public VrsContenutoFileKo() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_CONTENUTO_FILE_KO")
    @GenericGenerator(name = "SVRS_CONTENUTO_FILE_ID_CONTENUTO_FILE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVRS_CONTENUTO_FILE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVRS_CONTENUTO_FILE_ID_CONTENUTO_FILE_GENERATOR")
    public Long getIdContenutoFileKo() {
        return this.idContenutoFileKo;
    }

    public void setIdContenutoFileKo(Long idContenutoFileKo) {
        this.idContenutoFileKo = idContenutoFileKo;
    }

    @Lob()
    @Column(name = "BL_CONTENUTO_FILE_SESSIONE")
    public byte[] getBlContenutoFileSessione() {
        return this.blContenutoFileSessione;
    }

    public void setBlContenutoFileSessione(byte[] blContenutoFileSessione) {
        this.blContenutoFileSessione = blContenutoFileSessione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to VrsFileSessione
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILE_SESSIONE_KO")
    public VrsFileSessioneKo getVrsFileSessioneKo() {
        return this.vrsFileSessioneKo;
    }

    public void setVrsFileSessioneKo(VrsFileSessioneKo vrsFileSessioneKo) {
        this.vrsFileSessioneKo = vrsFileSessioneKo;
    }
}
