package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

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

    public SerVChkNotaObblig() {
    }

    @Column(name = "FL_OK_NOTE_OBBLIG")
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