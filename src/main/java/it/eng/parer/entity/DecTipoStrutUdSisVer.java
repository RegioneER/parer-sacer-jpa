package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlID;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the DEC_TIPO_STRUT_UD_SIS_VERS database table.
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_TIPO_STRUT_UD_SIS_VERS")
public class DecTipoStrutUdSisVer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idTipoStrutUdSisVers;

    private DecTipoStrutUnitaDoc decTipoStrutUnitaDoc;

    private AplSistemaVersante aplSistemaVersante;

    public DecTipoStrutUdSisVer() {/* Hibernate */
    }

    @Id
    // "DEC_TIPO_STRUT_UD_SIS_VERS_IDTIPOSTRUTUDSISVERS_GENERATOR",
    // sequenceName =
    // "SDEC_TIPO_STRUT_UD_SIS_VERS",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_TIPO_STRUT_UD_SIS_VERS_IDTIPOSTRUTUDSISVERS_GENERATOR")
    @Column(name = "ID_TIPO_STRUT_UD_SIS_VERS")
    @XmlID
    @GenericGenerator(name = "SDEC_TIPO_STRUT_UD_SIS_VERS_ID_TIPO_STRUT_UD_SIS_VERS_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_TIPO_STRUT_UD_SIS_VERS"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_TIPO_STRUT_UD_SIS_VERS_ID_TIPO_STRUT_UD_SIS_VERS_GENERATOR")
    public Long getIdTipoStrutUdSisVers() {
        return this.idTipoStrutUdSisVers;
    }

    public void setIdTipoStrutUdSisVers(Long idTipoStrutUdSisVers) {
        this.idTipoStrutUdSisVers = idTipoStrutUdSisVers;
    }

    // bi-directional many-to-one association to DecTipoStrutUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_STRUT_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decTipoStrutUdSisVers")
    public DecTipoStrutUnitaDoc getDecTipoStrutUnitaDoc() {
        return this.decTipoStrutUnitaDoc;
    }

    public void setDecTipoStrutUnitaDoc(DecTipoStrutUnitaDoc decTipoStrutUnitaDoc) {
        this.decTipoStrutUnitaDoc = decTipoStrutUnitaDoc;
    }

    // @Column(name = "ID_SISTEMA_VERSANTE")
    // public BigDecimal getIdSistemaVersante() {
    // return this.idSistemaVersante;
    // }
    //
    // public void setIdSistemaVersante(BigDecimal idSistemaVersante) {
    // this.idSistemaVersante = idSistemaVersante;
    // }

    // bi-directional many-to-one association to DecTipoStrutUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SISTEMA_VERSANTE")
    public // @XmlInverseReference(mappedBy = "decTipoStrutUdSisVers")
    AplSistemaVersante getAplSistemaVersante() {
        return this.aplSistemaVersante;
    }

    public void setAplSistemaVersante(AplSistemaVersante aplSistemaVersante) {
        this.aplSistemaVersante = aplSistemaVersante;
    }
}
