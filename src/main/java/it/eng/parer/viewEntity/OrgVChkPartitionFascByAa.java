package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * The persistent class for the ORG_V_CHK_PARTITION_FASC_BY_AA database table.
 *
 */
@Entity
@Table(name = "ORG_V_CHK_PARTITION_FASC_BY_AA")
@NamedQueries({
        @NamedQuery(name = "OrgVChkPartitionFascByAa.findAll", query = "SELECT o FROM OrgVChkPartitionFascByAa o"),
        @NamedQuery(name = "OrgVChkPartitionFascByAa.findByStrutAnno", query = "SELECT o FROM OrgVChkPartitionFascByAa o WHERE o.idStrut=:idStrut AND o.anno=:anno") })
public class OrgVChkPartitionFascByAa implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdPartitionFasc;
    private String cdPartitionFascko;
    private String cdPartitionFileelevrsfasc;
    private String cdPartitionSesfascko;
    private String cdPartitionXmlfasc;
    private String cdPartitionXmlsesfascko;
    private String cdPartitionXmlversfasc;
    private String flPartFascAnnoOk;
    private String flPartFascOk;
    private String flPartFasckoAnnoOk;
    private String flPartFasckoOk;
    private String flPartFileelevrsfascDataOk;
    private String flPartFileelevrsfascOk;
    private String flPartSesfasckoAnnoOk;
    private String flPartSesfasckoOk;
    private String flPartXmlfascDataOk;
    private String flPartXmlfascOk;
    private String flPartXmlsesfasckoDataOk;
    private String flPartXmlsesfasckoOk;
    private String flPartXmlversfascDataOk;
    private String flPartXmlversfascOk;
    private BigDecimal idStrut;
    private BigDecimal anno;

    public OrgVChkPartitionFascByAa() {
    }

    @Column(name = "CD_PARTITION_FASC")
    public String getCdPartitionFasc() {
        return this.cdPartitionFasc;
    }

    public void setCdPartitionFasc(String cdPartitionFasc) {
        this.cdPartitionFasc = cdPartitionFasc;
    }

    @Column(name = "CD_PARTITION_FASCKO")
    public String getCdPartitionFascko() {
        return this.cdPartitionFascko;
    }

    public void setCdPartitionFascko(String cdPartitionFascko) {
        this.cdPartitionFascko = cdPartitionFascko;
    }

    @Column(name = "CD_PARTITION_FILEELEVRSFASC")
    public String getCdPartitionFileelevrsfasc() {
        return this.cdPartitionFileelevrsfasc;
    }

    public void setCdPartitionFileelevrsfasc(String cdPartitionFileelevrsfasc) {
        this.cdPartitionFileelevrsfasc = cdPartitionFileelevrsfasc;
    }

    @Column(name = "CD_PARTITION_SESFASCKO")
    public String getCdPartitionSesfascko() {
        return this.cdPartitionSesfascko;
    }

    public void setCdPartitionSesfascko(String cdPartitionSesfascko) {
        this.cdPartitionSesfascko = cdPartitionSesfascko;
    }

    @Column(name = "CD_PARTITION_XMLFASC")
    public String getCdPartitionXmlfasc() {
        return this.cdPartitionXmlfasc;
    }

    public void setCdPartitionXmlfasc(String cdPartitionXmlfasc) {
        this.cdPartitionXmlfasc = cdPartitionXmlfasc;
    }

    @Column(name = "CD_PARTITION_XMLSESFASCKO")
    public String getCdPartitionXmlsesfascko() {
        return this.cdPartitionXmlsesfascko;
    }

    public void setCdPartitionXmlsesfascko(String cdPartitionXmlsesfascko) {
        this.cdPartitionXmlsesfascko = cdPartitionXmlsesfascko;
    }

    @Column(name = "CD_PARTITION_XMLVERSFASC")
    public String getCdPartitionXmlversfasc() {
        return this.cdPartitionXmlversfasc;
    }

    public void setCdPartitionXmlversfasc(String cdPartitionXmlversfasc) {
        this.cdPartitionXmlversfasc = cdPartitionXmlversfasc;
    }

    @Column(name = "FL_PART_FASC_ANNO_OK")
    public String getFlPartFascAnnoOk() {
        return this.flPartFascAnnoOk;
    }

    public void setFlPartFascAnnoOk(String flPartFascAnnoOk) {
        this.flPartFascAnnoOk = flPartFascAnnoOk;
    }

    @Column(name = "FL_PART_FASC_OK")
    public String getFlPartFascOk() {
        return this.flPartFascOk;
    }

    public void setFlPartFascOk(String flPartFascOk) {
        this.flPartFascOk = flPartFascOk;
    }

    @Column(name = "FL_PART_FASCKO_ANNO_OK")
    public String getFlPartFasckoAnnoOk() {
        return this.flPartFasckoAnnoOk;
    }

    public void setFlPartFasckoAnnoOk(String flPartFasckoAnnoOk) {
        this.flPartFasckoAnnoOk = flPartFasckoAnnoOk;
    }

    @Column(name = "FL_PART_FASCKO_OK")
    public String getFlPartFasckoOk() {
        return this.flPartFasckoOk;
    }

    public void setFlPartFasckoOk(String flPartFasckoOk) {
        this.flPartFasckoOk = flPartFasckoOk;
    }

    @Column(name = "FL_PART_FILEELEVRSFASC_DATA_OK")
    public String getFlPartFileelevrsfascDataOk() {
        return this.flPartFileelevrsfascDataOk;
    }

    public void setFlPartFileelevrsfascDataOk(String flPartFileelevrsfascDataOk) {
        this.flPartFileelevrsfascDataOk = flPartFileelevrsfascDataOk;
    }

    @Column(name = "FL_PART_FILEELEVRSFASC_OK")
    public String getFlPartFileelevrsfascOk() {
        return this.flPartFileelevrsfascOk;
    }

    public void setFlPartFileelevrsfascOk(String flPartFileelevrsfascOk) {
        this.flPartFileelevrsfascOk = flPartFileelevrsfascOk;
    }

    @Column(name = "FL_PART_SESFASCKO_ANNO_OK")
    public String getFlPartSesfasckoAnnoOk() {
        return this.flPartSesfasckoAnnoOk;
    }

    public void setFlPartSesfasckoAnnoOk(String flPartSesfasckoAnnoOk) {
        this.flPartSesfasckoAnnoOk = flPartSesfasckoAnnoOk;
    }

    @Column(name = "FL_PART_SESFASCKO_OK")
    public String getFlPartSesfasckoOk() {
        return this.flPartSesfasckoOk;
    }

    public void setFlPartSesfasckoOk(String flPartSesfasckoOk) {
        this.flPartSesfasckoOk = flPartSesfasckoOk;
    }

    @Column(name = "FL_PART_XMLFASC_DATA_OK")
    public String getFlPartXmlfascDataOk() {
        return this.flPartXmlfascDataOk;
    }

    public void setFlPartXmlfascDataOk(String flPartXmlfascDataOk) {
        this.flPartXmlfascDataOk = flPartXmlfascDataOk;
    }

    @Column(name = "FL_PART_XMLFASC_OK")
    public String getFlPartXmlfascOk() {
        return this.flPartXmlfascOk;
    }

    public void setFlPartXmlfascOk(String flPartXmlfascOk) {
        this.flPartXmlfascOk = flPartXmlfascOk;
    }

    @Column(name = "FL_PART_XMLSESFASCKO_DATA_OK")
    public String getFlPartXmlsesfasckoDataOk() {
        return this.flPartXmlsesfasckoDataOk;
    }

    public void setFlPartXmlsesfasckoDataOk(String flPartXmlsesfasckoDataOk) {
        this.flPartXmlsesfasckoDataOk = flPartXmlsesfasckoDataOk;
    }

    @Column(name = "FL_PART_XMLSESFASCKO_OK")
    public String getFlPartXmlsesfasckoOk() {
        return this.flPartXmlsesfasckoOk;
    }

    public void setFlPartXmlsesfasckoOk(String flPartXmlsesfasckoOk) {
        this.flPartXmlsesfasckoOk = flPartXmlsesfasckoOk;
    }

    @Column(name = "FL_PART_XMLVERSFASC_DATA_OK")
    public String getFlPartXmlversfascDataOk() {
        return this.flPartXmlversfascDataOk;
    }

    public void setFlPartXmlversfascDataOk(String flPartXmlversfascDataOk) {
        this.flPartXmlversfascDataOk = flPartXmlversfascDataOk;
    }

    @Column(name = "FL_PART_XMLVERSFASC_OK")
    public String getFlPartXmlversfascOk() {
        return this.flPartXmlversfascOk;
    }

    public void setFlPartXmlversfascOk(String flPartXmlversfascOk) {
        this.flPartXmlversfascOk = flPartXmlversfascOk;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ANNO")
    public BigDecimal getAnno() {
        return anno;
    }

    public void setAnno(BigDecimal anno) {
        this.anno = anno;
    }

}
