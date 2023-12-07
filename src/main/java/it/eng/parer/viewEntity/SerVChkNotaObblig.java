package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_CHK_NOTA_OBBLIG database table.
 * 
 */
@Entity
@Table(name = "SER_V_CHK_NOTA_OBBLIG")
@NamedQuery(name = "SerVChkNotaObblig.findAll", query = "SELECT s FROM SerVChkNotaObblig s")
public class SerVChkNotaObblig implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flOkNoteObblig;
    private BigDecimal idVerSerie;

    public SerVChkNotaObblig() {/* Hibernate */
    }

    @Column(name = "FL_OK_NOTE_OBBLIG", columnDefinition = "char(1)")
    public String getFlOkNoteObblig() {
        return this.flOkNoteObblig;
    }

    public void setFlOkNoteObblig(String flOkNoteObblig) {
        this.flOkNoteObblig = flOkNoteObblig;
    }

    @Id
    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

}
