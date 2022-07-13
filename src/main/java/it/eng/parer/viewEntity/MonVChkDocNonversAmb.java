package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CHK_DOC_NONVERS_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_DOC_NONVERS_AMB")
@NamedQuery(name = "MonVChkDocNonversAmb.findAll", query = "SELECT m FROM MonVChkDocNonversAmb m")
public class MonVChkDocNonversAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flDocNonversNorisolub;
    private String flDocNonversNoverif;
    private String flDocNonversVerif;
    private BigDecimal idAmbiente;
    private BigDecimal idUserIam;

    public MonVChkDocNonversAmb() {
    }

    @Column(name = "FL_DOC_NONVERS_NORISOLUB")
    public String getFlDocNonversNorisolub() {
        return this.flDocNonversNorisolub;
    }

    public void setFlDocNonversNorisolub(String flDocNonversNorisolub) {
        this.flDocNonversNorisolub = flDocNonversNorisolub;
    }

    @Column(name = "FL_DOC_NONVERS_NOVERIF")
    public String getFlDocNonversNoverif() {
        return this.flDocNonversNoverif;
    }

    public void setFlDocNonversNoverif(String flDocNonversNoverif) {
        this.flDocNonversNoverif = flDocNonversNoverif;
    }

    @Column(name = "FL_DOC_NONVERS_VERIF")
    public String getFlDocNonversVerif() {
        return this.flDocNonversVerif;
    }

    public void setFlDocNonversVerif(String flDocNonversVerif) {
        this.flDocNonversVerif = flDocNonversVerif;
    }

    @Id
    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

}