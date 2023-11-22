package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
        // hibernate
    }

    @Column(name = "FL_OK_NOTE_OBBLIG", columnDefinition = "CHAR")
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