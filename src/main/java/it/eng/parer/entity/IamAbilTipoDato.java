package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the IAM_ABIL_TIPO_DATO database table.
 * 
 */
@Entity
@Table(name = "IAM_ABIL_TIPO_DATO")
public class IamAbilTipoDato implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idAbilTipoDato;
    private BigDecimal idTipoDatoApplic;
    private String nmClasseTipoDato;
    private IamAbilOrganiz iamAbilOrganiz;

    public IamAbilTipoDato() {
    }

    @Id
    @SequenceGenerator(name = "IAM_ABIL_TIPO_DATO_IDABILTIPODATO_GENERATOR", sequenceName = "SIAM_ABIL_TIPO_DATO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IAM_ABIL_TIPO_DATO_IDABILTIPODATO_GENERATOR")
    @Column(name = "ID_ABIL_TIPO_DATO")
    public long getIdAbilTipoDato() {
        return this.idAbilTipoDato;
    }

    public void setIdAbilTipoDato(long idAbilTipoDato) {
        this.idAbilTipoDato = idAbilTipoDato;
    }

    @Column(name = "ID_TIPO_DATO_APPLIC")
    public BigDecimal getIdTipoDatoApplic() {
        return this.idTipoDatoApplic;
    }

    public void setIdTipoDatoApplic(BigDecimal idTipoDatoApplic) {
        this.idTipoDatoApplic = idTipoDatoApplic;
    }

    @Column(name = "NM_CLASSE_TIPO_DATO")
    public String getNmClasseTipoDato() {
        return this.nmClasseTipoDato;
    }

    public void setNmClasseTipoDato(String nmClasseTipoDato) {
        this.nmClasseTipoDato = nmClasseTipoDato;
    }

    // bi-directional many-to-one association to IamAbilOrganiz
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ABIL_ORGANIZ")
    public IamAbilOrganiz getIamAbilOrganiz() {
        return this.iamAbilOrganiz;
    }

    public void setIamAbilOrganiz(IamAbilOrganiz iamAbilOrganiz) {
        this.iamAbilOrganiz = iamAbilOrganiz;
    }

}