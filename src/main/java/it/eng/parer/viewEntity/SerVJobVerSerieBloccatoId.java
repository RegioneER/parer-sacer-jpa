package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author manuel.bertuzzi@eng.it
 */
@Embeddable
public class SerVJobVerSerieBloccatoId implements Serializable {

    private BigDecimal idVerSerie;
    private String nmJob;

    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

    @Column(name = "NM_JOB")
    public String getNmJob() {
        return this.nmJob;
    }

    public void setNmJob(String nmJob) {
        this.nmJob = nmJob;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idVerSerie);
        hash = 83 * hash + Objects.hashCode(this.nmJob);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SerVJobVerSerieBloccatoId other = (SerVJobVerSerieBloccatoId) obj;
        if (!Objects.equals(this.nmJob, other.nmJob)) {
            return false;
        }
        if (!Objects.equals(this.idVerSerie, other.idVerSerie)) {
            return false;
        }
        return true;
    }

}
