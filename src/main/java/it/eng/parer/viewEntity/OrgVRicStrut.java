package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ORG_V_RIC_STRUT database table.
 *
 */
@Entity
@Table(name = "ORG_V_RIC_STRUT")
@NamedQuery(name = "OrgVRicStrut.findAll", query = "SELECT o FROM OrgVRicStrut o")
public class OrgVRicStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdCategEnte;
    private String dsStrut;
    private String dsTreeCdAmbitoTerrit;
    private String dsTreeIdAmbitoTerrit;
    private String flPartOk;
    private String flTemplate;
    private BigDecimal idAmbiente;
    private BigDecimal idAmbienteEnteConvenz;
    private BigDecimal idAmbitoTerrit;
    private BigDecimal idCategEnte;
    private BigDecimal idEnte;
    private BigDecimal idEnteConvenz;
    private BigDecimal idSistemaVersante;
    private BigDecimal idStrut;
    private BigDecimal idUserIamCor;
    private String nmAmbiente;
    private String nmAmbienteEnteConvenz;
    private String nmEnte;
    private String nmEnteConvenz;
    private String nmSistemaVersante;
    private String nmStrut;
    private String tiAmbitoTerrit;

    public OrgVRicStrut() {
    }

    public OrgVRicStrut(BigDecimal idAmbiente, String nmAmbiente, BigDecimal idEnte, String nmEnte, BigDecimal idStrut,
            String nmStrut, String dsStrut, String flTemplate, String flPartOk, BigDecimal idAmbitoTerrit,
            String tiAmbitoTerrit, String dsTreeCdAmbitoTerrit, String dsTreeIdAmbitoTerrit, BigDecimal idCategEnte,
            String cdCategEnte) {
        this.idAmbiente = idAmbiente;
        this.nmAmbiente = nmAmbiente;
        this.idEnte = idEnte;
        this.nmEnte = nmEnte;
        this.idStrut = idStrut;
        this.nmStrut = nmStrut;
        this.dsStrut = dsStrut;
        this.flTemplate = flTemplate;
        this.flPartOk = flPartOk;
        this.idAmbitoTerrit = idAmbitoTerrit;
        this.tiAmbitoTerrit = tiAmbitoTerrit;
        this.dsTreeCdAmbitoTerrit = dsTreeCdAmbitoTerrit;
        this.dsTreeIdAmbitoTerrit = dsTreeIdAmbitoTerrit;
        this.idCategEnte = idCategEnte;
        this.cdCategEnte = cdCategEnte;
    }

    @Column(name = "CD_CATEG_ENTE")
    public String getCdCategEnte() {
        return this.cdCategEnte;
    }

    public void setCdCategEnte(String cdCategEnte) {
        this.cdCategEnte = cdCategEnte;
    }

    @Column(name = "DS_STRUT")
    public String getDsStrut() {
        return this.dsStrut;
    }

    public void setDsStrut(String dsStrut) {
        this.dsStrut = dsStrut;
    }

    @Column(name = "DS_TREE_CD_AMBITO_TERRIT")
    public String getDsTreeCdAmbitoTerrit() {
        return this.dsTreeCdAmbitoTerrit;
    }

    public void setDsTreeCdAmbitoTerrit(String dsTreeCdAmbitoTerrit) {
        this.dsTreeCdAmbitoTerrit = dsTreeCdAmbitoTerrit;
    }

    @Column(name = "DS_TREE_ID_AMBITO_TERRIT")
    public String getDsTreeIdAmbitoTerrit() {
        return this.dsTreeIdAmbitoTerrit;
    }

    public void setDsTreeIdAmbitoTerrit(String dsTreeIdAmbitoTerrit) {
        this.dsTreeIdAmbitoTerrit = dsTreeIdAmbitoTerrit;
    }

    @Column(name = "FL_PART_OK")
    public String getFlPartOk() {
        return this.flPartOk;
    }

    public void setFlPartOk(String flPartOk) {
        this.flPartOk = flPartOk;
    }

    @Column(name = "FL_TEMPLATE")
    public String getFlTemplate() {
        return this.flTemplate;
    }

    public void setFlTemplate(String flTemplate) {
        this.flTemplate = flTemplate;
    }

    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Column(name = "ID_AMBITO_TERRIT")
    public BigDecimal getIdAmbitoTerrit() {
        return this.idAmbitoTerrit;
    }

    public void setIdAmbitoTerrit(BigDecimal idAmbitoTerrit) {
        this.idAmbitoTerrit = idAmbitoTerrit;
    }

    @Column(name = "ID_CATEG_ENTE")
    public BigDecimal getIdCategEnte() {
        return this.idCategEnte;
    }

    public void setIdCategEnte(BigDecimal idCategEnte) {
        this.idCategEnte = idCategEnte;
    }

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Id
    @Column(name = "ID_SISTEMA_VERSANTE")
    public BigDecimal getIdSistemaVersante() {
        return this.idSistemaVersante;
    }

    public void setIdSistemaVersante(BigDecimal idSistemaVersante) {
        this.idSistemaVersante = idSistemaVersante;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Id
    @Column(name = "ID_USER_IAM_COR")
    public BigDecimal getIdUserIamCor() {
        return this.idUserIamCor;
    }

    public void setIdUserIamCor(BigDecimal idUserIamCor) {
        this.idUserIamCor = idUserIamCor;
    }

    @Column(name = "NM_AMBIENTE")
    public String getNmAmbiente() {
        return this.nmAmbiente;
    }

    public void setNmAmbiente(String nmAmbiente) {
        this.nmAmbiente = nmAmbiente;
    }

    @Column(name = "NM_ENTE")
    public String getNmEnte() {
        return this.nmEnte;
    }

    public void setNmEnte(String nmEnte) {
        this.nmEnte = nmEnte;
    }

    @Column(name = "NM_SISTEMA_VERSANTE")
    public String getNmSistemaVersante() {
        return this.nmSistemaVersante;
    }

    public void setNmSistemaVersante(String nmSistemaVersante) {
        this.nmSistemaVersante = nmSistemaVersante;
    }

    @Column(name = "NM_STRUT")
    public String getNmStrut() {
        return this.nmStrut;
    }

    public void setNmStrut(String nmStrut) {
        this.nmStrut = nmStrut;
    }

    @Column(name = "TI_AMBITO_TERRIT")
    public String getTiAmbitoTerrit() {
        return this.tiAmbitoTerrit;
    }

    public void setTiAmbitoTerrit(String tiAmbitoTerrit) {
        this.tiAmbitoTerrit = tiAmbitoTerrit;
    }

    @Column(name = "ID_AMBIENTE_ENTE_CONVENZ")
    public BigDecimal getIdAmbienteEnteConvenz() {
        return idAmbienteEnteConvenz;
    }

    public void setIdAmbienteEnteConvenz(BigDecimal idAmbienteEnteConvenz) {
        this.idAmbienteEnteConvenz = idAmbienteEnteConvenz;
    }

    @Column(name = "ID_ENTE_CONVENZ")
    public BigDecimal getIdEnteConvenz() {
        return idEnteConvenz;
    }

    public void setIdEnteConvenz(BigDecimal idEnteConvenz) {
        this.idEnteConvenz = idEnteConvenz;
    }

    @Column(name = "NM_AMBIENTE_ENTE_CONVENZ")
    public String getNmAmbienteEnteConvenz() {
        return nmAmbienteEnteConvenz;
    }

    public void setNmAmbienteEnteConvenz(String nmAmbienteEnteConvenz) {
        this.nmAmbienteEnteConvenz = nmAmbienteEnteConvenz;
    }

    @Column(name = "NM_ENTE_CONVENZ")
    public String getNmEnteConvenz() {
        return nmEnteConvenz;
    }

    public void setNmEnteConvenz(String nmEnteConvenz) {
        this.nmEnteConvenz = nmEnteConvenz;
    }

}
