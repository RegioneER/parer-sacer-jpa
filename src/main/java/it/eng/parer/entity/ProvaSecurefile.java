package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the PROVA_SECUREFILE database table.
 *
 */
@Entity
@Table(name = "PROVA_SECUREFILE")
public class ProvaSecurefile implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idRec;
    private byte[] blRec;

    public ProvaSecurefile() {
    }

    @Id
    @SequenceGenerator(name = "PROVA_SECUREFILE_GENERATOR", sequenceName = "SPROVA_SECUREFILE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROVA_SECUREFILE_GENERATOR")
    @Column(name = "ID_REC")
    public long getIdRec() {
        return this.idRec;
    }

    public void setIdRec(long idRec) {
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