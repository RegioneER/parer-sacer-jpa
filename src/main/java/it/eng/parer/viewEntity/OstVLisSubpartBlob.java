package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the OST_V_LIS_SUBPART_BLOB database table.
 *
 */
@Entity
@Table(name = "OST_V_LIS_SUBPART_BLOB")
@NamedQuery(name = "OstVLisSubpartBlob.findAll", query = "SELECT o FROM OstVLisSubpartBlob o")
public class OstVLisSubpartBlob implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdPartition;
    private String cdSubPartition;
    private BigDecimal idSubPartition;
    private String mmMax;
    private String nmColonnaBlobFile;
    private String nmColonnaIdFile;
    private String nmTabellaFile;
    private BigDecimal numRows;
    private String status;
    private String tablespaceName;
    private String tiPartition;

    public OstVLisSubpartBlob() {
    }

    @Column(name = "CD_PARTITION")
    public String getCdPartition() {
        return this.cdPartition;
    }

    public void setCdPartition(String cdPartition) {
        this.cdPartition = cdPartition;
    }

    @Column(name = "CD_SUB_PARTITION")
    public String getCdSubPartition() {
        return this.cdSubPartition;
    }

    public void setCdSubPartition(String cdSubPartition) {
        this.cdSubPartition = cdSubPartition;
    }

    @Id
    @Column(name = "ID_SUB_PARTITION")
    public BigDecimal getIdSubPartition() {
        return this.idSubPartition;
    }

    public void setIdSubPartition(BigDecimal idSubPartition) {
        this.idSubPartition = idSubPartition;
    }

    @Column(name = "MM_MAX")
    public String getMmMax() {
        return this.mmMax;
    }

    public void setMmMax(String mmMax) {
        this.mmMax = mmMax;
    }

    @Column(name = "NM_COLONNA_BLOB_FILE")
    public String getNmColonnaBlobFile() {
        return this.nmColonnaBlobFile;
    }

    public void setNmColonnaBlobFile(String nmColonnaBlobFile) {
        this.nmColonnaBlobFile = nmColonnaBlobFile;
    }

    @Column(name = "NM_COLONNA_ID_FILE")
    public String getNmColonnaIdFile() {
        return this.nmColonnaIdFile;
    }

    public void setNmColonnaIdFile(String nmColonnaIdFile) {
        this.nmColonnaIdFile = nmColonnaIdFile;
    }

    @Column(name = "NM_TABELLA_FILE")
    public String getNmTabellaFile() {
        return this.nmTabellaFile;
    }

    public void setNmTabellaFile(String nmTabellaFile) {
        this.nmTabellaFile = nmTabellaFile;
    }

    @Column(name = "NUM_ROWS")
    public BigDecimal getNumRows() {
        return this.numRows;
    }

    public void setNumRows(BigDecimal numRows) {
        this.numRows = numRows;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "TABLESPACE_NAME")
    public String getTablespaceName() {
        return this.tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    @Column(name = "TI_PARTITION")
    public String getTiPartition() {
        return this.tiPartition;
    }

    public void setTiPartition(String tiPartition) {
        this.tiPartition = tiPartition;
    }

}
