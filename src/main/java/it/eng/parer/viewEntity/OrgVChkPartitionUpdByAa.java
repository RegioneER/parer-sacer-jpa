package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ORG_V_CHK_PARTITION_UPD_BY_AA database table.
 * 
 */
@Entity
@Table(name = "ORG_V_CHK_PARTITION_UPD_BY_AA")
@NamedQuery(name = "OrgVChkPartitionUpdByAa.findAll", query = "SELECT o FROM OrgVChkPartitionUpdByAa o")
public class OrgVChkPartitionUpdByAa implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal anno;
    private String cdPartitionSesupdko;
    private String cdPartitionUpddatispec;
    private String cdPartitionUpdko;
    private String cdPartitionVersinidatispec;
    private String cdPartitionXmlsesupdko;
    private String cdPartitionXmlupd;
    private String flPartSesupdkoAaOk;
    private String flPartSesupdkoOk;
    private String flPartUpddatispecAaOk;
    private String flPartUpddatispecOk;
    private String flPartUpdkoAaOk;
    private String flPartUpdkoOk;
    private String flPartVersinidatispecAaOk;
    private String flPartVersinidatispecOk;
    private String flPartXmlsesupdkoOk;
    private String flPartXmlsesupdkpAaOk;
    private String flPartXmlupdAaOk;
    private String flPartXmlupdOk;
    private BigDecimal idStrut;

    public OrgVChkPartitionUpdByAa() {
    }

    @Column(name = "ANNO")
    public BigDecimal getAnno() {
        return this.anno;
    }

    public void setAnno(BigDecimal anno) {
        this.anno = anno;
    }

    @Column(name = "CD_PARTITION_SESUPDKO")
    public String getCdPartitionSesupdko() {
        return this.cdPartitionSesupdko;
    }

    public void setCdPartitionSesupdko(String cdPartitionSesupdko) {
        this.cdPartitionSesupdko = cdPartitionSesupdko;
    }

    @Column(name = "CD_PARTITION_UPDDATISPEC")
    public String getCdPartitionUpddatispec() {
        return this.cdPartitionUpddatispec;
    }

    public void setCdPartitionUpddatispec(String cdPartitionUpddatispec) {
        this.cdPartitionUpddatispec = cdPartitionUpddatispec;
    }

    @Column(name = "CD_PARTITION_UPDKO")
    public String getCdPartitionUpdko() {
        return this.cdPartitionUpdko;
    }

    public void setCdPartitionUpdko(String cdPartitionUpdko) {
        this.cdPartitionUpdko = cdPartitionUpdko;
    }

    @Column(name = "CD_PARTITION_VERSINIDATISPEC")
    public String getCdPartitionVersinidatispec() {
        return this.cdPartitionVersinidatispec;
    }

    public void setCdPartitionVersinidatispec(String cdPartitionVersinidatispec) {
        this.cdPartitionVersinidatispec = cdPartitionVersinidatispec;
    }

    @Column(name = "CD_PARTITION_XMLSESUPDKO")
    public String getCdPartitionXmlsesupdko() {
        return this.cdPartitionXmlsesupdko;
    }

    public void setCdPartitionXmlsesupdko(String cdPartitionXmlsesupdko) {
        this.cdPartitionXmlsesupdko = cdPartitionXmlsesupdko;
    }

    @Column(name = "CD_PARTITION_XMLUPD")
    public String getCdPartitionXmlupd() {
        return this.cdPartitionXmlupd;
    }

    public void setCdPartitionXmlupd(String cdPartitionXmlupd) {
        this.cdPartitionXmlupd = cdPartitionXmlupd;
    }

    @Column(name = "FL_PART_SESUPDKO_AA_OK")
    public String getFlPartSesupdkoAaOk() {
        return this.flPartSesupdkoAaOk;
    }

    public void setFlPartSesupdkoAaOk(String flPartSesupdkoAaOk) {
        this.flPartSesupdkoAaOk = flPartSesupdkoAaOk;
    }

    @Column(name = "FL_PART_SESUPDKO_OK")
    public String getFlPartSesupdkoOk() {
        return this.flPartSesupdkoOk;
    }

    public void setFlPartSesupdkoOk(String flPartSesupdkoOk) {
        this.flPartSesupdkoOk = flPartSesupdkoOk;
    }

    @Column(name = "FL_PART_UPDDATISPEC_AA_OK")
    public String getFlPartUpddatispecAaOk() {
        return this.flPartUpddatispecAaOk;
    }

    public void setFlPartUpddatispecAaOk(String flPartUpddatispecAaOk) {
        this.flPartUpddatispecAaOk = flPartUpddatispecAaOk;
    }

    @Column(name = "FL_PART_UPDDATISPEC_OK")
    public String getFlPartUpddatispecOk() {
        return this.flPartUpddatispecOk;
    }

    public void setFlPartUpddatispecOk(String flPartUpddatispecOk) {
        this.flPartUpddatispecOk = flPartUpddatispecOk;
    }

    @Column(name = "FL_PART_UPDKO_AA_OK")
    public String getFlPartUpdkoAaOk() {
        return this.flPartUpdkoAaOk;
    }

    public void setFlPartUpdkoAaOk(String flPartUpdkoAaOk) {
        this.flPartUpdkoAaOk = flPartUpdkoAaOk;
    }

    @Column(name = "FL_PART_UPDKO_OK")
    public String getFlPartUpdkoOk() {
        return this.flPartUpdkoOk;
    }

    public void setFlPartUpdkoOk(String flPartUpdkoOk) {
        this.flPartUpdkoOk = flPartUpdkoOk;
    }

    @Column(name = "FL_PART_VERSINIDATISPEC_AA_OK")
    public String getFlPartVersinidatispecAaOk() {
        return this.flPartVersinidatispecAaOk;
    }

    public void setFlPartVersinidatispecAaOk(String flPartVersinidatispecAaOk) {
        this.flPartVersinidatispecAaOk = flPartVersinidatispecAaOk;
    }

    @Column(name = "FL_PART_VERSINIDATISPEC_OK")
    public String getFlPartVersinidatispecOk() {
        return this.flPartVersinidatispecOk;
    }

    public void setFlPartVersinidatispecOk(String flPartVersinidatispecOk) {
        this.flPartVersinidatispecOk = flPartVersinidatispecOk;
    }

    @Column(name = "FL_PART_XMLSESUPDKO_OK")
    public String getFlPartXmlsesupdkoOk() {
        return this.flPartXmlsesupdkoOk;
    }

    public void setFlPartXmlsesupdkoOk(String flPartXmlsesupdkoOk) {
        this.flPartXmlsesupdkoOk = flPartXmlsesupdkoOk;
    }

    @Column(name = "FL_PART_XMLSESUPDKP_AA_OK")
    public String getFlPartXmlsesupdkpAaOk() {
        return this.flPartXmlsesupdkpAaOk;
    }

    public void setFlPartXmlsesupdkpAaOk(String flPartXmlsesupdkpAaOk) {
        this.flPartXmlsesupdkpAaOk = flPartXmlsesupdkpAaOk;
    }

    @Column(name = "FL_PART_XMLUPD_AA_OK")
    public String getFlPartXmlupdAaOk() {
        return this.flPartXmlupdAaOk;
    }

    public void setFlPartXmlupdAaOk(String flPartXmlupdAaOk) {
        this.flPartXmlupdAaOk = flPartXmlupdAaOk;
    }

    @Column(name = "FL_PART_XMLUPD_OK")
    public String getFlPartXmlupdOk() {
        return this.flPartXmlupdOk;
    }

    public void setFlPartXmlupdOk(String flPartXmlupdOk) {
        this.flPartXmlupdOk = flPartXmlupdOk;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

}