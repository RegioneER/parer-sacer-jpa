package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the PROVA_NO_SECUREFILE database table.
 */
// @Entity
// @Table(name = "PROVA_NO_SECUREFILE")
public class ProvaNoSecurefile implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idRec;

    private byte[] blRec;

    public ProvaNoSecurefile() {/* Hibernate */
    }

    @Id
    // "PROVA_NO_SECUREFILE_GENERATOR",
    // sequenceName = "SPROVA_NO_SECUREFILE",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROVA_NO_SECUREFILE_GENERATOR")
    @Column(name = "ID_REC")
    @GenericGenerator(name = "SPROVA_NO_SECUREFILE_ID_REC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SPROVA_NO_SECUREFILE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SPROVA_NO_SECUREFILE_ID_REC_GENERATOR")
    public Long getIdRec() {
        return this.idRec;
    }

    public void setIdRec(Long idRec) {
        this.idRec = idRec;
    }

    @Lob()
    @Column(name = "BL_REC")
    public byte[] getBlRec() {
        return this.blRec;
    }

    public void setBlRec(byte[] blRec) {
        this.blRec = blRec;
    }
}
