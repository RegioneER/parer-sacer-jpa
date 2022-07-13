package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_V_CHK_NOTA_OBBLIG database table.
 * 
 */
@Entity
@Table(name = "ARO_V_CHK_NOTA_OBBLIG")
@NamedQuery(name = "AroVChkNotaObblig.findAll", query = "SELECT s FROM AroVChkNotaObblig s")
public class AroVChkNotaObblig implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flOkNoteObblig;
    private BigDecimal idVerIndiceAip;

    public AroVChkNotaObblig() {
    }

    @Column(name = "FL_OK_NOTE_OBBLIG")
    public String getFlOkNoteObblig() {
        return this.flOkNoteObblig;
    }

    public void setFlOkNoteObblig(String flOkNoteObblig) {
        this.flOkNoteObblig = flOkNoteObblig;
    }

    @Id
    @Column(name = "ID_VER_INDICE_AIP")
    public BigDecimal getIdVerIndiceAip() {
        return this.idVerIndiceAip;
    }

    public void setIdVerIndiceAip(BigDecimal idVerIndiceAip) {
        this.idVerIndiceAip = idVerIndiceAip;
    }

}