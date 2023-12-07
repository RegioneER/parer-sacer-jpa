package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class SerVJobContenutoBloccatoId implements Serializable {

    private BigDecimal idContenutoVerSerie;

    @Column(name = "ID_CONTENUTO_VER_SERIE")
    public BigDecimal getIdContenutoVerSerie() {
        return idContenutoVerSerie;
    }

    public void setIdContenutoVerSerie(BigDecimal idContenutoVerSerie) {
        this.idContenutoVerSerie = idContenutoVerSerie;
    }

    private String nmJob;

    @Column(name = "NM_JOB")
    public String getNmJob() {
        return nmJob;
    }

    public void setNmJob(String nmJob) {
        this.nmJob = nmJob;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idContenutoVerSerie);
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
        final SerVJobContenutoBloccatoId other = (SerVJobContenutoBloccatoId) obj;
        if (!Objects.equals(this.nmJob, other.nmJob)) {
            return false;
        }
        if (!Objects.equals(this.idContenutoVerSerie, other.idContenutoVerSerie)) {
            return false;
        }
        return true;
    }

}
