package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import org.apache.commons.lang3.Validate;

/**
 * The persistent class for the MON_CONTA_UD_DOC_COMP database table.
 *
 */
@Entity
@Table(name = "MON_CONTA_UD_DOC_COMP")
@NamedQuery(name = "MonContaUdDocComp.findAll", query = "SELECT m FROM MonContaUdDocComp m")
public class MonContaUdDocComp implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idContaUdDocComp;
    private BigDecimal aaKeyUnitaDoc;
    private Date dtRifConta;
    private BigDecimal idStrut;
    private BigDecimal niCompAgg;
    private BigDecimal niCompAnnulUd;
    private BigDecimal niCompVers;
    private BigDecimal niDocAgg;
    private BigDecimal niDocAnnulUd;
    private BigDecimal niDocVers;
    private BigDecimal niSizeAgg;
    private BigDecimal niSizeAnnulUd;
    private BigDecimal niSizeVers;
    private BigDecimal niUnitaDocAnnul;
    private BigDecimal niUnitaDocVers;
    private DecRegistroUnitaDoc decRegistroUnitaDoc;
    private long idDecRegistroUnitaDoc;
    private DecTipoDoc decTipoDoc;
    private long idDecTipoDoc;
    private DecTipoUnitaDoc decTipoUnitaDoc;
    private long idDecTipoUnitaDoc;
    private OrgSubStrut orgSubStrut;
    private long idOrgSubStrut;

    public MonContaUdDocComp() {
    }

    // NON MODIFICARE USATO DA CALCOLO CONTENUTO SACER
    public MonContaUdDocComp(Object dtRifConta, long idStrut, long idOrgSubStrut, long idDecRegistroUnitaDoc,
            BigDecimal aaKeyUnitaDoc, long idDecTipoUnitaDoc, long idDecTipoDoc, Object niComp, Object niSize,
            String tipoConteggio) {
        Validate.noNullElements(Arrays.asList(dtRifConta, idStrut, idOrgSubStrut, idDecRegistroUnitaDoc, aaKeyUnitaDoc,
                idDecTipoUnitaDoc, idDecTipoDoc, niComp, niSize, tipoConteggio));
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
        this.dtRifConta = (Date) dtRifConta;
        this.idStrut = new BigDecimal(idStrut);
        this.idDecRegistroUnitaDoc = idDecRegistroUnitaDoc;
        this.idDecTipoDoc = idDecTipoDoc;
        this.idDecTipoUnitaDoc = idDecTipoUnitaDoc;
        this.idOrgSubStrut = idOrgSubStrut;
        this.niCompAgg = new BigDecimal(0);
        this.niCompAnnulUd = new BigDecimal(0);
        this.niCompVers = new BigDecimal(0);
        this.niDocAgg = new BigDecimal(0);
        this.niDocAnnulUd = new BigDecimal(0);
        this.niDocVers = new BigDecimal(0);
        this.niSizeAgg = new BigDecimal(0);
        this.niSizeAnnulUd = new BigDecimal(0);
        this.niSizeVers = new BigDecimal(0);
        this.niUnitaDocAnnul = new BigDecimal(0);
        this.niUnitaDocVers = new BigDecimal(0);

        switch (TipoConteggio.valueOf(tipoConteggio)) {
        case COMP_VERS:
            this.niCompVers = (BigDecimal) niComp;
            this.niSizeVers = (BigDecimal) niSize;
            break;
        case COMP_AGG:
            this.niCompAgg = (BigDecimal) niComp;
            this.niSizeAgg = (BigDecimal) niSize;
            break;
        case COMP_ANNULL:
            this.niCompAnnulUd = (BigDecimal) niComp;
            this.niSizeAnnulUd = (BigDecimal) niSize;
            break;
        }

    }

    // NON MODIFICARE USATO DA CALCOLO CONTENUTO SACER
    public MonContaUdDocComp(Object dtRifConta, long idStrut, long idOrgSubStrut, long idDecRegistroUnitaDoc,
            BigDecimal aaKeyUnitaDoc, long idDecTipoUnitaDoc, long idDecTipoDoc, Object niElems, String tipoConteggio) {
        Validate.noNullElements(Arrays.asList(dtRifConta, idStrut, idOrgSubStrut, idDecRegistroUnitaDoc, aaKeyUnitaDoc,
                idDecTipoUnitaDoc, idDecTipoDoc, niElems, tipoConteggio));
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
        this.dtRifConta = (Date) dtRifConta;
        this.idStrut = new BigDecimal(idStrut);
        this.idDecRegistroUnitaDoc = idDecRegistroUnitaDoc;
        this.idDecTipoDoc = idDecTipoDoc;
        this.idDecTipoUnitaDoc = idDecTipoUnitaDoc;
        this.idOrgSubStrut = idOrgSubStrut;
        this.niCompAgg = new BigDecimal(0);
        this.niCompAnnulUd = new BigDecimal(0);
        this.niCompVers = new BigDecimal(0);
        this.niDocAgg = new BigDecimal(0);
        this.niDocAnnulUd = new BigDecimal(0);
        this.niDocVers = new BigDecimal(0);
        this.niSizeAgg = new BigDecimal(0);
        this.niSizeAnnulUd = new BigDecimal(0);
        this.niSizeVers = new BigDecimal(0);
        this.niUnitaDocAnnul = new BigDecimal(0);
        this.niUnitaDocVers = new BigDecimal(0);

        switch (TipoConteggio.valueOf(tipoConteggio)) {
        case UD_VERS:
            this.niUnitaDocVers = (BigDecimal) niElems;
            break;
        case UD_ANNULL:
            this.niUnitaDocAnnul = (BigDecimal) niElems;
            break;
        case DOC_VERS:
            this.niDocVers = (BigDecimal) niElems;
            break;
        case DOC_ANNULL:
            this.niDocAnnulUd = (BigDecimal) niElems;
            break;
        case DOC_AGG:
            this.niDocAgg = (BigDecimal) niElems;
            break;
        }

    }

    // // NON MODIFICARE USATO DA CALCOLO CONTENUTO SACER
    // public MonContaUdDocComp(Date dtRifConta, BigDecimal idStrut, long idOrgSubStrut,
    // long idDecRegistroUnitaDoc, BigDecimal aaKeyUnitaDoc, long idDecTipoUnitaDoc, long idDecTipoDoc,
    // BigDecimal niUnitaDocVers, BigDecimal niDocVers, BigDecimal niCompVers, BigDecimal niSizeVers,
    // BigDecimal niDocAgg, BigDecimal niCompAgg, BigDecimal niSizeAgg,
    // BigDecimal niUnitaDocAnnul, BigDecimal niDocAnnulUd, BigDecimal niCompAnnulUd, BigDecimal niSizeAnnulUd ) {
    // this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    // this.dtRifConta = dtRifConta;
    // this.idStrut = idStrut;
    // this.niCompAgg = niCompAgg;
    // this.niCompAnnulUd = niCompAnnulUd;
    // this.niCompVers = niCompVers;
    // this.niDocAgg = niDocAgg;
    // this.niDocAnnulUd = niDocAnnulUd;
    // this.niDocVers = niDocVers;
    // this.niSizeAgg = niSizeAgg;
    // this.niSizeAnnulUd = niSizeAnnulUd;
    // this.niSizeVers = niSizeVers;
    // this.niUnitaDocAnnul = niUnitaDocAnnul;
    // this.niUnitaDocVers = niUnitaDocVers;
    // this.idDecRegistroUnitaDoc = idDecRegistroUnitaDoc;
    // this.idDecTipoDoc = idDecTipoDoc;
    // this.idDecTipoUnitaDoc = idDecTipoUnitaDoc;
    // this.idOrgSubStrut = idOrgSubStrut;
    // }

    @Id
    @SequenceGenerator(name = "MON_CONTA_UD_DOC_COMP_IDCONTAUDDOCCOMP_GENERATOR", sequenceName = "SMON_CONTA_UD_DOC_COMP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MON_CONTA_UD_DOC_COMP_IDCONTAUDDOCCOMP_GENERATOR")
    @Column(name = "ID_CONTA_UD_DOC_COMP")
    public long getIdContaUdDocComp() {
        return this.idContaUdDocComp;
    }

    public void setIdContaUdDocComp(long idContaUdDocComp) {
        this.idContaUdDocComp = idContaUdDocComp;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return this.dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_COMP_AGG")
    public BigDecimal getNiCompAgg() {
        return this.niCompAgg;
    }

    public void setNiCompAgg(BigDecimal niCompAgg) {
        this.niCompAgg = niCompAgg;
    }

    @Column(name = "NI_COMP_ANNUL_UD")
    public BigDecimal getNiCompAnnulUd() {
        return this.niCompAnnulUd;
    }

    public void setNiCompAnnulUd(BigDecimal niCompAnnulUd) {
        this.niCompAnnulUd = niCompAnnulUd;
    }

    @Column(name = "NI_COMP_VERS")
    public BigDecimal getNiCompVers() {
        return this.niCompVers;
    }

    public void setNiCompVers(BigDecimal niCompVers) {
        this.niCompVers = niCompVers;
    }

    @Column(name = "NI_DOC_AGG")
    public BigDecimal getNiDocAgg() {
        return this.niDocAgg;
    }

    public void setNiDocAgg(BigDecimal niDocAgg) {
        this.niDocAgg = niDocAgg;
    }

    @Column(name = "NI_DOC_ANNUL_UD")
    public BigDecimal getNiDocAnnulUd() {
        return this.niDocAnnulUd;
    }

    public void setNiDocAnnulUd(BigDecimal niDocAnnulUd) {
        this.niDocAnnulUd = niDocAnnulUd;
    }

    @Column(name = "NI_DOC_VERS")
    public BigDecimal getNiDocVers() {
        return this.niDocVers;
    }

    public void setNiDocVers(BigDecimal niDocVers) {
        this.niDocVers = niDocVers;
    }

    @Column(name = "NI_SIZE_AGG")
    public BigDecimal getNiSizeAgg() {
        return this.niSizeAgg;
    }

    public void setNiSizeAgg(BigDecimal niSizeAgg) {
        this.niSizeAgg = niSizeAgg;
    }

    @Column(name = "NI_SIZE_ANNUL_UD")
    public BigDecimal getNiSizeAnnulUd() {
        return this.niSizeAnnulUd;
    }

    public void setNiSizeAnnulUd(BigDecimal niSizeAnnulUd) {
        this.niSizeAnnulUd = niSizeAnnulUd;
    }

    @Column(name = "NI_SIZE_VERS")
    public BigDecimal getNiSizeVers() {
        return this.niSizeVers;
    }

    public void setNiSizeVers(BigDecimal niSizeVers) {
        this.niSizeVers = niSizeVers;
    }

    @Column(name = "NI_UNITA_DOC_ANNUL")
    public BigDecimal getNiUnitaDocAnnul() {
        return this.niUnitaDocAnnul;
    }

    public void setNiUnitaDocAnnul(BigDecimal niUnitaDocAnnul) {
        this.niUnitaDocAnnul = niUnitaDocAnnul;
    }

    @Column(name = "NI_UNITA_DOC_VERS")
    public BigDecimal getNiUnitaDocVers() {
        return this.niUnitaDocVers;
    }

    public void setNiUnitaDocVers(BigDecimal niUnitaDocVers) {
        this.niUnitaDocVers = niUnitaDocVers;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_UNITA_DOC", insertable = false, updatable = false)
    public DecRegistroUnitaDoc getDecRegistroUnitaDoc() {
        return this.decRegistroUnitaDoc;
    }

    public void setDecRegistroUnitaDoc(DecRegistroUnitaDoc decRegistroUnitaDoc) {
        this.decRegistroUnitaDoc = decRegistroUnitaDoc;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC_PRINC", insertable = false, updatable = false)
    public DecTipoDoc getDecTipoDoc() {
        return this.decTipoDoc;
    }

    public void setDecTipoDoc(DecTipoDoc decTipoDoc) {
        this.decTipoDoc = decTipoDoc;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC", insertable = false, updatable = false)
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

    // bi-directional many-to-one association to OrgSubStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SUB_STRUT", insertable = false, updatable = false)
    public OrgSubStrut getOrgSubStrut() {
        return this.orgSubStrut;
    }

    public void setOrgSubStrut(OrgSubStrut orgSubStrut) {
        this.orgSubStrut = orgSubStrut;
    }

    @Column(name = "ID_REGISTRO_UNITA_DOC")
    public long getIdDecRegistroUnitaDoc() {
        return idDecRegistroUnitaDoc;
    }

    public void setIdDecRegistroUnitaDoc(long idDecRegistroUnitaDoc) {
        this.idDecRegistroUnitaDoc = idDecRegistroUnitaDoc;
    }

    @Column(name = "ID_TIPO_DOC_PRINC")
    public long getIdDecTipoDoc() {
        return idDecTipoDoc;
    }

    public void setIdDecTipoDoc(long idDecTipoDoc) {
        this.idDecTipoDoc = idDecTipoDoc;
    }

    @Column(name = "ID_TIPO_UNITA_DOC")
    public long getIdDecTipoUnitaDoc() {
        return idDecTipoUnitaDoc;
    }

    public void setIdDecTipoUnitaDoc(long idDecTipoUnitaDoc) {
        this.idDecTipoUnitaDoc = idDecTipoUnitaDoc;
    }

    @Column(name = "ID_SUB_STRUT")
    public long getIdOrgSubStrut() {
        return idOrgSubStrut;
    }

    public void setIdOrgSubStrut(long idOrgSubStrut) {
        this.idOrgSubStrut = idOrgSubStrut;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.aaKeyUnitaDoc);
        hash = 89 * hash + Objects.hashCode(this.dtRifConta);
        hash = 89 * hash + Objects.hashCode(this.idStrut);
        hash = 89 * hash + (int) (this.idDecRegistroUnitaDoc ^ (this.idDecRegistroUnitaDoc >>> 32));
        hash = 89 * hash + (int) (this.idDecTipoDoc ^ (this.idDecTipoDoc >>> 32));
        hash = 89 * hash + (int) (this.idDecTipoUnitaDoc ^ (this.idDecTipoUnitaDoc >>> 32));
        hash = 89 * hash + (int) (this.idOrgSubStrut ^ (this.idOrgSubStrut >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MonContaUdDocComp other = (MonContaUdDocComp) obj;
        if (!Objects.equals(this.aaKeyUnitaDoc, other.aaKeyUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.dtRifConta, other.dtRifConta)) {
            return false;
        }
        if (!Objects.equals(this.idStrut, other.idStrut)) {
            return false;
        }
        if (this.idDecRegistroUnitaDoc != other.idDecRegistroUnitaDoc) {
            return false;
        }
        if (this.idDecTipoDoc != other.idDecTipoDoc) {
            return false;
        }
        if (this.idDecTipoUnitaDoc != other.idDecTipoUnitaDoc) {
            return false;
        }
        if (this.idOrgSubStrut != other.idOrgSubStrut) {
            return false;
        }
        return true;
    }

    public enum TipoConteggio {
        UD_VERS, DOC_VERS, COMP_VERS, BYTE_VERS, DOC_AGG, COMP_AGG, BYTE_AGG, UD_ANNULL, DOC_ANNULL, COMP_ANNULL,
        BYTE_ANNULL
    }

}
